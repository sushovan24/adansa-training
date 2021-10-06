
package com.rajtraining.ejb.bl;

import com.entity.Students;
import javax.ejb.Remote;


@Remote
public interface TestRemoteRemote {
    
    void print(String msg);
    void createStudent(Students student);
}
