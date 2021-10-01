package com.trans.require.bl;

import com.trans.reuire.da.RequireBeanTrans;
import com.trans.reuire.da.RequireBeanTransLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

@Stateless

public class RequireRemote implements RequireRemoteRemote {

    @EJB
    private RequireBeanTransLocal rlocal;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    
    @Override
    public void print(String msg) {

        rlocal.printMesaage(msg);
    }

}
