package com.trans.reuire.da;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
public class RequireBeanTrans implements RequireBeanTransLocal {

    @TransactionAttribute(TransactionAttributeType.REQUIRED)//in this client without transaction
    @Override
    public void printMesaage(String msg) {

        System.out.println("output reuire transaction: " + msg);
    }

}
