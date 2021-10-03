package com.trans.mand.da;

import javax.ejb.Local;

@Local
public interface MandLocalLocal {

    void print(String msg);
}
