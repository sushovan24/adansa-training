/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohsin.ejb.bl;

import com.entity.Students;
import javax.ejb.Remote;


@Remote
public interface TestMohsinRemoteRemote {
    void printMsg(String msg);
    void cretateStudent(Students student);
}
