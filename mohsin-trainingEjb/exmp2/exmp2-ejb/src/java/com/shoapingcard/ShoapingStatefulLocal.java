/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoapingcard;

import javax.ejb.Local;
@Local
public interface ShoapingStatefulLocal {
public void add(int amt);
public void remove(int amt);
public void cheak(int amt);
public Integer cheak();
    
}
