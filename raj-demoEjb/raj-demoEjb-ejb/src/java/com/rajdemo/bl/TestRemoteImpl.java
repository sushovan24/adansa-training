package com.rajdemo.bl;

import com.rajdemo.entity.Mixture;
import com.rajdemo.entity.Students;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface TestRemoteImpl {

    boolean saveUser(String name, String password, String subject, String mobile, int mark);

    Students logIn(String name, String password);

    List<Students> getLoginData(String name);

    List<Students> findAllData();
}
