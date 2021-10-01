package com.trans.rn.bl;

import com.trans.rn.da.ReqNewLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless

public class ReqNewRemote implements ReqNewRemoteRemote {

    @EJB
    private ReqNewLocalLocal rnlocal;

    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    @Override
    public void print(String msg) {

        rnlocal.print(msg);
    }

}
