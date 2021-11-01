
package com.demoproject.bl;

import com.demoproject.da.TestLocalLocal;
import com.demoproject.entity.Marks;
import com.demoproject.entity.StudentDetails;
import com.demoproject.entity.Students;
import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;


@Stateless
@LocalBean
public class TestRemote implements TestRemoteRemote{
    Students s;
    StudentDetails sd;
    Marks m;

    @EJB
    private TestLocalLocal local;
    
    @Override
    public void print(String msg) {
        local.print(msg);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public void printData(int id) {
        local.printData(id);
    }

    @Override
    public void addstudent(Students s) {
        local.saveUser(s);
    }

    @Override
    public void addmarks(Marks m) {
        local.saveMarksUser(m);
    }

    @Override
    public boolean saveUser(string name, String password, String subject, String mobile, int mark) {
     boolean f= false;
     List<StudentDetails> stdlist=new ArrayList<>();
     List<marks> marklist=new ArrayList<>();
     
     String encriptPass=encriptPassword(password);
     
     s=new Students();
     sd=new StudentDetails();
     sd.setMobile(mobile);
     sd.setStudentId(s);
     stdlist.add(sd);
     
     m=new Marks();
     m.setSubject(subject);
     m.setStudId(s);
     m.setMark(mark);
     marklist.add(m);
    
     s.setMarkList(marklist);
     s.setSdList(stdlist);
     s.setStudentName(subject);
     s.setPassword(encriptPass);
     
     boolean valid=local.saveUser(s);
     if(valid){
         f=true;
           }
     return f;
    }

    @Override
    public Students logIn(String name, String password) {
     String encriptPass=encriptPassword(password);
     Students s=local.logIn(name, encriptPass);
     return s;
    }
    

    public List<Students> getLoginData(String name) {
        return local.getLoginData(name);
        
    }

    public List<Students> findAlldata() {
       List<Students> data = local.findAlldata();
        return data;
    }

    
    // Message Driven Purpose used kiya gya hai 
    private String encriptPassword(String password) {
        String encriptPass=null;
        try{
          
            MessageDigest md=MessageDigest.getInstantce("SHA-1");
            byte[] b=md.digest(password.getBytes());
            BigInteger num=new BigInteger(1,b);
            encriptPass=num.toString(16);
            while(encriptPass.length()<32){
                encriptPass="0" + encriptPass;
            }
        }
          catch(NoSuchAlgorithmException e){
            System.out.println(e);
               
        }
        return encriptPass;
        
    }
}
