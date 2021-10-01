
package com.trans.never.bl;

import com.trans.never.da.NeverLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;


@Stateless

public class NeverRemote implements NeverRemoteRemote {

    @EJB
    private NeverLocalLocal nlocal;

    @TransactionAttribute(TransactionAttributeType.REQUIRED) //without this there is eception
    @Override
    public void print(String msg) {

        try {
            nlocal.print(msg);
        } catch (Exception e) {
            System.out.println("remote excep: " + e);
        }
    }

    //@TransactionAttribute(TransactionAttributeType.SUPPORTS)
    @Override
    public void printSupport(String msg) {
        nlocal.printSupport(msg);
    }

    @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
    @Override
    public void printNotSupported(String msg) {
        nlocal.printNotSupported(msg);
    }

}
