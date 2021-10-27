package com.demoproject.da;

import com.demoproject.entity.Marks;
import com.demoproject.entity.Students;
import javax.ejb.Local;

@Local
public interface TestLocalLocal {

    void print(String msg);

    void printData(int id);

    void saveUser(Students s);
    void saveMarksUser(Marks m);
}
