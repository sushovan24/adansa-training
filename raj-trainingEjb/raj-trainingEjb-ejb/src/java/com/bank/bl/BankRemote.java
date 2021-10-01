
package com.bank.bl;

import com.bank.da.BankLocalLocal;
import javax.ejb.EJB;
import javax.ejb.Stateful;


@Stateful
public class BankRemote implements BankRemoteRemote{

    @EJB
    private BankLocalLocal blocal;
    private int amount=5000;
    
    @Override
    public void withdraw(int amount) {
        System.out.println("withdraw object:=> "+blocal);
        if(amount <=this.amount){
            this.amount=this.amount-amount;
             blocal.withdraw(this.amount);
        }else{
            blocal.withdraw(this.amount);
        }
    }

    @Override
    public void deposit(int amount) {
        System.out.println("deposit object:=> "+blocal);
        this.amount=this.amount+amount;
        blocal.deposit(this.amount);
    }

    
    @Override
    public void getBalance() {
        System.out.println("getBalance object:=> "+blocal);
        blocal.getBalance(this.amount);
    }

    

    
}
