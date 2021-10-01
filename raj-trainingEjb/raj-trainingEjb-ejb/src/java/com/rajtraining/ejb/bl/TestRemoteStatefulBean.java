
package com.rajtraining.ejb.bl;

import com.rajtraining.ejb.da.TestLocalStatefulBeanLocal;
import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;


@Stateful
@LocalBean
public class TestRemoteStatefulBean implements TestRemoteStatefulBeanRemote{

    @EJB
    TestLocalStatefulBeanLocal slocal;
    @Override
    public void printStatelessMsg(String mag) {
        System.out.println("stateful => "+slocal);
        slocal.printSatefulMsg(mag);
    }

    
}
