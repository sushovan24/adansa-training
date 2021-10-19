
package com.ejb.dl;

import javax.ejb.Stateful;
import javax.ejb.Stateless;

//@Stateles
@Stateful
public class TestLocal implements TestLocalLocal {

    @Override
    public void print(String msg) {
        System.out.println("local=> "+msg);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void add(int a, int b) {
        int k=a+b;
        System.out.println(k);
    }
    
}
