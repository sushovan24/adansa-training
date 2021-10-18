package com.rajtraining.ejb.da;

import com.entity.Marks;
import com.entity.Mixture;
import com.entity.StudentDetails;
import com.entity.Students;
import java.util.List;
import java.util.Objects;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class TestLocal implements TestLocalLocal {

    @PersistenceContext(unitName = "raj-trainingEjb-ejbPU")
    private EntityManager em;

    @Override
    public void printMessage(String msg) {
        try {
            System.out.println(msg);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    @Override
    public void createStudent(Students student) {
        em.persist(student);
        em.flush();
        System.out.println(student.getId());
//        Students sd = em.merge(student);
//        System.out.println(sd);
    }

    @Override
    public void addStudentDetails(StudentDetails sd) {
        em.persist(sd);
        em.flush();
        int id = sd.getId();
        System.out.println(id);
        System.out.println(em.find(StudentDetails.class, id));
    }

    @Override
    public void saveMarks(Marks marks) {
        em.persist(marks);
        em.flush();
        System.out.println(marks.getId());
        //List<Mixture> m=new ArrayList<>();
    }

    @Override
    public void getMixture(List<Mixture> mix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    public void getMarksDetails(int id){
//        em.find(Marks.class, id);
//    }
    @Override
    public void findMarksDetails(int id) {
        try {
            Marks mark = em.find(Marks.class, id);
            em.detach(mark);

            mark.setSubject("bio");
            mark = em.merge(mark);
            mark.setSubject("MTH");

            System.out.println(mark.getId() + "   " + mark.getStudId() + "    " + mark.getSubject() + "   " + mark.getMark());
            System.out.println("");
            //em.remove(mark);
            //System.out.println(em.getProperties());
        } catch (NullPointerException ex) {

            System.out.println(ex);
        }
    }

    @Override
    public void findStudents(int id) {
        Students s = em.find(Students.class, id);
        System.out.println(s.getId() + "  " + s.getName());
        em.detach(s);
        s.setName("raju");
        em.merge(s);
        System.out.println("after merge");
        System.out.println(s.getId() + "  " + s.getName());
    }

//named query find all in student table 
    public List<Students> fetchStudents() {
        Query query = em.createNamedQuery("Students.findAll");
        return query.getResultList();
    }

    //named query find by id
    public List<Students> fetchById(int id) {
        Query query = em.createNamedQuery("Students.findById").setParameter("id", id);
        return query.getResultList();
    }

    //named query find by name
    public List<Students> fetchByName(String name) {
        Query query = em.createNamedQuery("Students.findByName").setParameter("studentName", name);
        return query.getResultList();
    }

    @Override
    public void findStudentsById(int id) {
        List<Students> list = fetchById(id);
        for (Students s : list) {
            System.out.println(s.getId() + "  " + s.getName());
        }
    }

    @Override
    public void findStudentsByName(String name) {
        List<Students> list = fetchByName(name);
        for (Students s : list) {
            System.out.println(s.getName() + "    " + s.getId());
        }
    }

    @Override
    public void findAllStudents() {
        List<Students> list = fetchStudents();
        for (Students s : list) {
            System.out.println(s.getId() + "  " + s.getName());
        }
    }

    //native query find all student data
    public List<Object[]> fetchStudentsdata() {
        Query query = em.createNativeQuery("select * from students");
        return query.getResultList();
    }

    //native query find by id
    public List<Object[]> fetchByIddata(int id) {
        Query query = em.createNativeQuery("select * from students where id=" + id + "");
        return query.getResultList();
    }

    //native query find by name
    public List<Object[]> fetchByNamedata(String name) {
        Query query = em.createNativeQuery("select * from students where student_name=" + "'name'" + "");
        return query.getResultList();
    }

    //native query find data in asc order by name
    public List<Object[]> fetchDataAsc() {
        Query query = em.createNativeQuery("select * from students ORDER BY student_name ASC");
        return query.getResultList();
    }

    @Override
    public void findStudentsByNamedata(String name) {
        List<Object[]> data = fetchByNamedata(name);
        for (Object[] o : data) {
            System.out.println(o[0].toString() + "    " + o[1].toString());
        }
    }

    @Override
    public void findStudentsByIddata(int id) {
        List<Object[]> data = fetchByIddata(id);
        for (Object[] o : data) {
            System.out.println(o[0].toString() + "    " + o[1].toString());
        }
    }

    @Override
    public void findAllStudentsData() {
        List<Object[]> data = fetchStudentsdata();
        for (Object[] d : data) {
            System.out.println(d[0].toString() + "    " + d[1].toString());
        }
    }

    @Override
    public void findStudentsDataOrderByNameAsc() {
        List<Object[]> list = fetchDataAsc();
        for (Object[] o : list) {
            System.out.println(o[0].toString() + "    " + o[1].toString());
        }
    }

    @Override
    public void insertedByNameAsc() {
        List<Object[]> list = fetchDataAsc();
        List<Object[]> data = fetchStudentsdata();
        for(int i=0; i<data.size(); i++){
           
        }
    }

}
