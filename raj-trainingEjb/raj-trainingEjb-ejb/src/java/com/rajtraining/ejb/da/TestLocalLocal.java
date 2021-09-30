
package com.rajtraining.ejb.da;

import javax.ejb.Local;

@Local
public interface TestLocalLocal {
    
    void printMessage(String msg);
}
