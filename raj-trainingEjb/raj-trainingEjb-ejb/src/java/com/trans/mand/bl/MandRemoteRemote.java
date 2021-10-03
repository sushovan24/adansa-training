package com.trans.mand.bl;

import javax.ejb.Remote;

@Remote
public interface MandRemoteRemote {

    void print(String msg);
}
