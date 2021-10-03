package com.rajtraining.ejb.da;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class TestLocal implements TestLocalLocal {

    @Override
    public void printMessage(String msg) {
        try {
            System.out.println(msg);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
