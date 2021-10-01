package com.trans.mand.bl;

import com.trans.mand.da.MandLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless
@LocalBean
public class MandRemote implements MandRemoteRemote {

    @EJB
    private MandLocalLocal mlocal;

   // @TransactionAttribute(TransactionAttributeType.) using this reuire exception
    @Override
    public void print(String msg) {
        try {
            mlocal.print(msg);
        } catch (Exception e) {
            System.out.println("remote bean: " + e);
        }

    }

}
