
package com.bank.da;

import javax.ejb.Local;

@Local
public interface BankLocalLocal {
    void withdraw(int amount);
    void deposit(int amount);
    void getBalance(int amount);
}
