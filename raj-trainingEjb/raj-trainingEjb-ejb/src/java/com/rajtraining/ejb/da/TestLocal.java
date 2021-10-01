
package com.rajtraining.ejb.da;

import javax.ejb.Stateless;


@Stateless
public class TestLocal implements TestLocalLocal {

    @Override
    public void printMessage(String msg) {
        
        System.out.println(msg);
    }

    
}
