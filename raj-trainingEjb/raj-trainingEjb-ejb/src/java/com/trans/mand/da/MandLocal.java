package com.trans.mand.da;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class MandLocal implements MandLocalLocal {

    @TransactionAttribute(TransactionAttributeType.NEVER)
    @Override
    public void print(String msg) {
        try {
            System.out.println("mand output: " + msg);
        } catch (Exception e) {
            System.out.println("exception: " + e);
        }

    }

}
