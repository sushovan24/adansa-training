package com.demoproject.bl;

import com.demoproject.entity.Marks;
import com.demoproject.entity.Students;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import javax.ejb.Remote;
import java.util.*;

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

    boolean saveUser(string name, String password, String subject, String mobile, int mark);

    Students logIn(String name, String password);

    List<Students> getloginData(String name);

    List<Students> findAlldata();

    @Override
    public boolean equals(Object obj);

    public boolean saveUser(String name, String password, String sub, String mobile, int mark);

    boolean userLogin(String name, String password);
    // public boolean saveUser(String name, String password, String sub, String mobile, int mark);
    // public boolean saveUser(String name, String password, String sub, String mobile, int mark);
}
