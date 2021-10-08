
package com.shoapingcard;
import javax.ejb.Stateful;
@Stateful
public class ShoapingStateful implements ShoapingStatefulLocal {
    private int cost;
    public ShoapingStateful() {
        cost+=0;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void add(int amt) {
        cost+=amt;
    }
   @Override
    public void remove(int amt) {
        cost-=amt;
    }
    @Override
    public Integer cheak() {
        return cost;
    }
    @Override
    public void cheak(int amt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
   


   
    }

