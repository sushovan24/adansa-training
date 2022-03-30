/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.dp.da;

import com.practice.dp.entity.Students;
import javax.ejb.Local;

/**
 *
 * @author susho
 */
@Local
public interface StudentDALocal {

    public Students createStudents(Students std);
    
}
