package com.rajdemo.da;

import com.rajdemo.entity.Marks;
import com.rajdemo.entity.Mixture;
import com.rajdemo.entity.StudentDetails;
import com.rajdemo.entity.Students;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sun.security.provider.SHA;

@Stateless
public class Test implements TestLocal {

    @PersistenceContext(unitName = "raj-demoEjb-ejbPU")
    private EntityManager em;
    Students s;
    StudentDetails sd;
    Marks mr;
    int userid;
    String name;
    String password;
    String subject;
    String mobile;
    int mark;

    @Override
    public boolean saveUser(Students s) {
        boolean f = false;
        List<Students> studentlist = getLoginData(s.getStudentName());
        for (Students st : studentlist) {
            if (st.getStudentName().equalsIgnoreCase(s.getStudentName())) {
                return f;
            }
        }
        em.persist(s);
        em.flush();
        if (s.getId() != null) {
            f = true;
        }
        return f;
    }

    @Override
    public Students LogIn(String name, String password) {
        System.out.println(name + "   " + password);
        s = null;
        List<Students> data = getLoginData(name);
        for (Students d : data) {
            if (d.getStudentName().equals(name) && (password).equals(d.getPassword())) {
                s = new Students();
                userid = d.getId();
                List<StudentDetails> sdList = findStudentDetails(userid);
                List<Marks> mList = findMarksDetails(userid);
                name = d.getStudentName();
                //password = d.getPassword();
                s.setId(userid);
                s.setStudentName(name);
                //s.setPassword(password);
                s.setSdList(sdList);
                s.setMarkList(mList);
                break;
            }
        }
        return s;

    }

    @Override
    public List<Students> getLoginData(String name) {
        Query query = em.createNamedQuery("Students.findByStudentName").setParameter("studentName", name);
        return query.getResultList();
    }

    public List<StudentDetails> findStudentDetails(int id) {
        Query query = em.createNamedQuery("StudentDetails.findByStudentId").setParameter("studentId", id);
        return query.getResultList();
    }

    public List<Marks> findMarksDetails(int id) {
        Query query = em.createNamedQuery("Marks.findByStudId").setParameter("studId", id);
        return query.getResultList();
    }

    @Override
    public List<Students> findAllData() {
        List<Students> data = getAlldata();
        return data;
    }

    public List<Students> getAlldata() {
        Query query = em.createNamedQuery("Students.findAll");
        return query.getResultList();
    }
}
