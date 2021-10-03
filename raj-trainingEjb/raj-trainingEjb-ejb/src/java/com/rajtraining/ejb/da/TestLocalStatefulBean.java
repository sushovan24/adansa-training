
package com.rajtraining.ejb.da;

import javax.ejb.Stateful;

@Stateful
public class TestLocalStatefulBean implements TestLocalStatefulBeanLocal {

    @Override
    public void printSatefulMsg(String msg) {
    
        System.out.println(msg);
    }
    

    
}
