/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demoproject.da;

import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author Md mohsin alam
 */
@Stateless
public class TestRlb implements TestRlbLocal {

    public void saveData() {
        
    }

    @Override
    public void retriveData() {
        
    }
    @Override
    public void saveData(int id, int vid, String redisld, String action, String mod_type, int status, Date dtCreate, int cid, int segid) {
       
    }
    
}
