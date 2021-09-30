
package com.rajtraining.ejb.bl;

import javax.ejb.Remote;


@Remote
public interface TestRemoteRemote {
    
    void print(String msg);
}
