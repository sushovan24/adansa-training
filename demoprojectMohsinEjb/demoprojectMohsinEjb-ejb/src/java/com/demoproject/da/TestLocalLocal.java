package com.demoproject.da;

import com.demoproject.entity.Marks;
import com.demoproject.entity.RlbVredisMap;
import com.demoproject.entity.Students;
import java.util.List;
import javax.ejb.Local;

@Local
public interface TestLocalLocal {

    void print(String msg);

    void printData(int id);

    void saveUser(Students s);
    void saveMarksUser(Marks m);

    public Students logIn(String name);

    public Students logIn(String name, String encriptPass);

    public List<Students> getLoginData(String name);

    public List<Students> findAlldata();
    boolean userLogin(String username, String password);
    
    List<RlbVredisMap> accessData();
    void saveData(RlbVredisMap rlb);
}
