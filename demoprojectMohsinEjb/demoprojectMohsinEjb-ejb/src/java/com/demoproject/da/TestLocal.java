package com.demoproject.da;

import com.demoproject.entity.Marks;
import com.demoproject.entity.RlbVredisMap;
import com.demoproject.entity.Students;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class TestLocal implements TestLocalLocal {

    @PersistenceContext(unitName = "demoprojectMohsinEjb-ejbPU")
    private EntityManager em;

    @Override
    public void print(String msg) {
        System.out.println(msg);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @Override
    public void printData(int id) {
        Query query = em.createNamedQuery("Students.findById").setParameter("id", id);
        List<Students> data = query.getResultList();
        for (Students s : data) {
            System.out.println(s.getId() + "    " + s.getStudentName() + "  " + s.getPassword());
        }
    }

    @Override
    public void saveUser(Students s) {
        em.persist(s);
        em.flush();
        System.out.println(s.getId());
    }

    @Override// marks class ke liye 
    public void saveMarksUser(Marks m) {
        em.persist(m);
        em.flush();
        System.out.println(s.getId());
    }

    @Override
    public Students logIn(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Students logIn(String name, String encriptPass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Students> getLoginData(String name) {
        Query query = em.createNamedQuery("Students.findByStudentName");
        query.setParameter("studentName", name);
        return query.getResultList();
    }

    @Override
    public List<Students> findAlldata() {
        Query query = em.createNamedQuery("Students.findAll");
        return query.getResultList();
    }

    @Override
    public boolean userLogin(String username, String password) {
        boolean f = false;
        Query q = em.createNamedQuery("Students.findByStudentName");
        List<Students> list = q.getResultList();
        for (Students s : list) {
            if (s.getStudentName().equalsIgnoreCase(username) && s.getPassword().endsWith(password)) {
                f = true;
                break;
            }
        }
        return f;
    }

    @Override
    public List<RlbVredisMap> accessData() {
        Query query = em.createNamedQuery("RlbVredisMap.findAll");
        return query.getResultList();
    }

    @Override
    public void saveData(RlbVredisMap rlb) {
        System.out.println(rlb.getCid());
        System.out.println(rlb.getAction());
        System.out.println(rlb.getRedisId());
        System.out.println(rlb.getDtCreate());
        em.persist(rlb);
        em.flush();
        System.out.println(rlb.getId()); 
    }
}
