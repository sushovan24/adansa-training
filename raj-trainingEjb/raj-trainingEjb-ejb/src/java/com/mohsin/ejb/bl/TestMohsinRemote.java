
package com.mohsin.ejb.bl;

import com.entity.Students;
import com.mohsin.ejb.da.TestMohsinLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class TestMohsinRemote implements TestMohsinRemoteRemote{

    @EJB
    private TestMohsinLocalLocal mlocal;

    @Override
    public void printMsg(String msg) {
        mlocal.printMsg(msg);
    }

    @Override
    public void cretateStudent(Students student) {
        mlocal.createStudents(student);
    }
    
   
    
}
