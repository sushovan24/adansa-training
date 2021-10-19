
package com.ejb.dl;

import javax.ejb.Local;
@Local
public interface TestLocalLocal {//interface class there and 
    
    void print(String msg);// abstract the method here
    void add(int a, int b);
}
