
package com.ejb.bl;
import javax.ejb.Remote;
@Remote
public interface TestRemoteRemote {// interface  class banaya hai aur uske ander method hidding kiya gya hai 
    void printMessage(String msg);
    void add(int a, int b);
}
