package com.rajtraining.ejb.da;

import com.entity.Students;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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
    }

}
