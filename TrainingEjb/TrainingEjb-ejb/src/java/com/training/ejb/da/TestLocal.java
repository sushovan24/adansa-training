/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.ejb.da;

import javax.ejb.Stateless;

/**
 *
 * @author DELL
 */
@Stateless
public class TestLocal implements TestLocalLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    int i=0;
    @Override
    public void printTest(String msg) throws Exception{
        i++;
//        try{
        System.out.println("Message["+i+"]=>"+msg.toLowerCase());
//        }catch(Exception ex){
//            System.out.println("[Local] Error in print message===>"+ex.toString()); 
//        }
    }
}
