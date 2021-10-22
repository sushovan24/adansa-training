package com.rajdemo.da;

import com.rajdemo.entity.Students;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TestLocal {

    boolean saveUser(Students s);
    Students LogIn(String name, String password);
    List<Students> getLoginData(String name);
    List<Students> findAllData();
}
