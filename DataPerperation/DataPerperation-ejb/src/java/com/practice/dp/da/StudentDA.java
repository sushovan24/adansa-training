/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.dp.da;

import com.practice.dp.entity.Students;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author susho
 */
@Stateless
public class StudentDA implements StudentDALocal {

    @PersistenceContext(unitName = "DataPerperation-ejbPU")
    private EntityManager em;
    
    public Students createStudents(Students std){
        em.persist(std);
        em.flush();
        return std;
    }
}
