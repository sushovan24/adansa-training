package com.demoproject.da;

import com.demoproject.entity.Marks;
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
}
