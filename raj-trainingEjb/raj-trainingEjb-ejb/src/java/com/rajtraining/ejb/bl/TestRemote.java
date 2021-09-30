
package com.rajtraining.ejb.bl;

import com.rajtraining.ejb.da.TestLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class TestRemote implements TestRemoteRemote{

    @EJB
    private TestLocalLocal local;
    @Override
    public void print(String msg) {
        System.out.println("stateless => "+local);
        local.printMessage(msg);
        
    }

    
}
