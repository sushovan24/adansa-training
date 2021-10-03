package com.trans.never.bl;

import javax.ejb.Remote;

@Remote
public interface NeverRemoteRemote {

    void print(String msg);

    void printSupport(String msg);

    void printNotSupported(String msg);
}
