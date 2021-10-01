
package com.rajtraining.ejb.bl;

import javax.ejb.Remote;

@Remote
public interface TestRemoteStatefulBeanRemote {
    
    void printStatelessMsg(String mag);
}
