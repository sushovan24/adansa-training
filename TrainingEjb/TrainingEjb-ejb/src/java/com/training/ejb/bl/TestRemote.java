/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.training.ejb.bl;

import com.training.ejb.da.TestLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author DELL
 */
@Stateless
public class TestRemote implements TestRemoteRemote {

    @EJB
    private TestLocalLocal local;
    
    public void testPrint(String msg){
        System.out.println("Local Obj->"+local);
        local.printTest(msg);
    }

}
