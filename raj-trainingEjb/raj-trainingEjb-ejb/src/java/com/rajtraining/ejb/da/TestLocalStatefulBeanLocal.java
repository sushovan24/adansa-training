
package com.rajtraining.ejb.da;

import javax.ejb.Local;


@Local
public interface TestLocalStatefulBeanLocal {
   
    void printSatefulMsg(String msg);
}
