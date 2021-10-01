
package com.bank.da;

import javax.ejb.Stateful;


@Stateful
public class BankLocal implements BankLocalLocal {

    @Override
    public void withdraw(int amount) {
        System.out.println("amount "+amount+" successfull withdraw");
   
    }

    @Override
    public void deposit(int amount) {
   
        System.out.println("amount "+amount+" successfull deposit");
    }

    @Override
    public void getBalance(int amount) {
        
        System.out.println("your available amount is: "+amount);
    }

    
}
