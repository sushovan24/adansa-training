
package com.mohsin.ejb.da;

import com.entity.Students;
import javax.ejb.Local;

@Local
public interface TestMohsinLocalLocal {
    void printMsg(String msg);
    void createStudents(Students student);
}
