/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.dp.bl;

import com.practice.dp.da.ProcedureCallingLocal;
import com.practice.dp.da.StudentDALocal;
import com.practice.dp.entity.Students;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author susho
 */
@Stateless
public class DataPerperationFromProc implements DataPerperationFromProcRemote {

    @EJB
    private ProcedureCallingLocal procCall;

    @EJB
    private StudentDALocal stdLocal;

    public String dataPerpLogic() {
        String response = "";
        try {

            List<Object[]> dataFromProc = procCall.getDataFromProc();

            //Data Perp logic
            Students createStudents = stdLocal.createStudents(null);
            response = "Student successfully created with Id::" + createStudents.getId();
        } catch (Exception ex) {
            response = ex.toString();
        }

    }

}
