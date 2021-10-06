package com.rajtraining.ejb.bl;

import com.entity.Students;
import com.rajtraining.ejb.da.TestLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class TestRemote implements TestRemoteRemote {

    @EJB
    private TestLocalLocal local;

    @Override
    public void print(String msg) {
        try {
            System.out.println("stateless => " + local);
            local.printMessage(msg);
        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }

    }

    @Override
    public void createStudent(Students student) {
        local.createStudent(student);
    }

}
