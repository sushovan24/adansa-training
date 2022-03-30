/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.dp.da;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author susho
 */
@Stateless
public class ProcedureCalling implements ProcedureCallingLocal {

    
    @PersistenceContext(unitName = "DataPerperation-ejbPU")
    private EntityManager em;
    
    
    public List<Object[]> getDataFromProc(){
        Query query = em.createNativeQuery("call test_proc()");
        return query.getResultList();
    }
}
