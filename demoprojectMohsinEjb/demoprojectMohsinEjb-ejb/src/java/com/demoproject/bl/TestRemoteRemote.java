/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demoproject.bl;

import com.demoproject.entity.Marks;
import com.demoproject.entity.Students;
import javax.ejb.Remote;

/**
 *
 * @author Md mohsin alam
 */
@Remote
public interface TestRemoteRemote {
    void print(String msg);
    void printData(int id);
    void addstudent(Students s);
    void addmarks(Marks m);// marks class data for 

    @Override
    public boolean equals(Object obj);
}
