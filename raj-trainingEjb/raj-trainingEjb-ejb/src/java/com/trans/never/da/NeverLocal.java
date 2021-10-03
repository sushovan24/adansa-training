
package com.trans.never.da;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;


@Stateless
public class NeverLocal implements NeverLocalLocal {

    @TransactionAttribute(TransactionAttributeType.NEVER)
    @Override
    public void print(String msg) {
        try {
            System.out.println("never trans: " + msg);
        } catch (Exception e) {
            System.out.println("never trans local: " + e);
        }

    }

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)// if client use then it use otherwise not
    @Override
    public void printSupport(String msg) {
        System.out.println("support trans: " + msg);
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    @Override
    public void printNotSupported(String msg) {
        System.out.println("notsupport trans: " + msg);
    }

}
