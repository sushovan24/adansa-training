
package com.bank.bl;

import javax.ejb.Remote;


@Remote
public interface BankRemoteRemote {
    void withdraw(int amount);
    void deposit(int amount);
    void getBalance();

}
