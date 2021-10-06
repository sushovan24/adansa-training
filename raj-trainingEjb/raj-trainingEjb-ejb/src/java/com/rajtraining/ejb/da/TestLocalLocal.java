
package com.rajtraining.ejb.da;

import com.entity.Students;
import javax.ejb.Local;

@Local
public interface TestLocalLocal {
    
    void printMessage(String msg);
    void createStudent(Students student);
}
