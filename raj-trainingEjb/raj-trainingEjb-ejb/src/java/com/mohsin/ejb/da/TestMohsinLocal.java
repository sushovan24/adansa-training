package com.mohsin.ejb.da;

import com.entity.Students;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TestMohsinLocal implements TestMohsinLocalLocal {

    @PersistenceContext(unitName = "raj-trainingEjb-ejbPU")
    private EntityManager em;

    @Override
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    @Override
    public void createStudents(Students student) {
        System.out.println(student.getName());
        em.persist(student);
        em.flush();
        System.out.println(student.getName());
    }

}
//insert value into mark and studentdetails table ok