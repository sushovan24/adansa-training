package com.trans.rn.da;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class ReqNewLocal implements ReqNewLocalLocal {

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)//always create new transaction
    @Override                                                   // either require or not
    public void print(String msg) {
        System.out.println("req new output: " + msg);
    }

}
