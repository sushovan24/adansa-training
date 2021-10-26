/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demoproject.bl;

import com.demoproject.da.TestLocalLocal;
import com.demoproject.entity.Marks;
import com.demoproject.entity.Students;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Md mohsin alam
 */
@Stateless
@LocalBean
public class TestRemote implements TestRemoteRemote{

    @EJB
    private TestLocalLocal local;
    
    @Override
    public void print(String msg) {
        local.print(msg);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void printData(int id) {
        local.printData(id);
    }

    @Override
    public void addstudent(Students s) {
        local.saveUser(s);
    }

    @Override
    public void addmarks(Marks m) {
        local.saveMarksUser(m);
    }
}
