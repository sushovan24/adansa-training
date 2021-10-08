<%-- 
    Document   : index
    Created on : Sep 30, 2021, 3:57:03 PM
    Author     : PANDIT
--%>

<%@page import="com.entity.Students"%>
<%@page import="com.entity.StudentDetails"%>
<%@page import="com.entity.Marks"%>
<%@page import="com.entity.Mixture"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.trans.never.bl.NeverRemoteRemote"%>
<%@page import="com.trans.mand.bl.MandRemoteRemote"%>
<%@page import="com.trans.rn.bl.ReqNewRemoteRemote"%>
<%@page import="com.trans.rn.bl.ReqNewRemote"%>
<%@page import="com.trans.require.bl.RequireRemoteRemote"%>
<%@page import="com.rajtraining.ejb.bl.TestRemoteStatefulBeanRemote"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="com.rajtraining.ejb.bl.TestRemoteRemote"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%

//            
//            TestRemoteStatefulBeanRemote sremote= (TestRemoteStatefulBeanRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/TestRemoteStatefulBean!com.rajtraining.ejb.bl.TestRemoteStatefulBean");
//            sremote.printStatelessMsg("this is statefull session bean");

//            RequireRemoteRemote rremote = (RequireRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/RequireRemote!com.trans.require.bl.RequireRemoteRemote");
//            rremote.print("this is the require transactions");
//            ReqNewRemoteRemote rnremote = (ReqNewRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/ReqNewRemote!com.trans.rn.bl.ReqNewRemoteRemote");
//            rnremote.print("this is reuire new transaction");
//            MandRemoteRemote mremote = (MandRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/MandRemote!com.trans.mand.bl.MandRemoteRemote");
//            mremote.print("this is mandatory transaction");

//            NeverRemoteRemote nremote = (NeverRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/NeverRemote!com.trans.never.bl.NeverRemote");
//            nremote.print("this is never transaction");
//            nremote.printSupport("this is support transaction");
//            nremote.printNotSupported("this is not supported transaction");

//            NeverRemoteRemote nremote = (NeverRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/NeverRemote!com.trans.never.bl.NeverRemoteRemote");
//            nremote.print("this is never transaction");
//            nremote.printSupport("this is support transaction");
//            nremote.printNotSupported("this is not supported transaction");

            TestRemoteRemote remote = (TestRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/TestRemote!com.rajtraining.ejb.bl.TestRemoteRemote");
             Students student = new Students();
             student.setName("nausad");
             remote.createStudent(student);

//          StudentDetails sd=new StudentDetails();
//          sd.setStudentId(110);
//          sd.setMobile("9632145678");
//          remote.saveStudentDetails(sd);

//            Marks m=new Marks();
//            m.setStudId(108);
//            m.setSubject("gk");
//            m.setMark(25);
//            remote.saveMarks(m);
//
//            List<Mixture> list=new ArrayList<>();
//            Mixture m=new Mixture();
//            m.setStudId(101);
//            m.setSubject("PHY");
//            m.setMobile("7462088722");
//            m.setMark(78);
//            m.setStudName("mohsin");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(102);
//            m.setSubject("che");
//            m.setMobile("7462088222");
//            m.setMark(74);
//            m.setStudName("deepak");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(103);
//            m.setSubject("che");
//            m.setMobile("8862088222");
//            m.setMark(74);
//            m.setStudName("deepak kumar");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(103);
//            m.setSubject("che");
//            m.setMobile("8523697412");
//            m.setMark(74);
//            m.setStudName("deepak kumar");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(104);
//            m.setSubject("che");
//            m.setMobile("8965236584");
//            m.setMark(65);
//            m.setStudName("sohan");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(104);
//            m.setSubject("che");
//            m.setMobile("8965236584");
//            m.setMark(65);
//            m.setStudName("sohan");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(105);
//            m.setSubject("che");
//            m.setMobile("8862088222");
//            m.setMark(74);
//            m.setStudName("deepak kumar");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(105);
//            m.setSubject("phy");
//            m.setMobile("8862088222");
//            m.setMark(58);
//            m.setStudName("deepak kumar");
//            list.add(m);
//            
//            m=new Mixture();
//            m.setStudId(105);
//            m.setSubject("mth");
//            m.setMobile("8862088222");
//            m.setMark(90);
//            m.setStudName("deepak kumar");
//            list.add(m);

            
//              remote.findMarksDetails(1);
//              remote.findMarksDetails(2);
//              remote.findMarksDetails(3);
//              remote.findMarksDetails(4);
              
              
//              remote.findStudents(4);

//                remote.findAllStudents();
//                   remote.findAllStudentsData();

                //remote.findStudentsById(2);
                
                //remote.findStudentsByName("rajkumar");
                
//                remote.findStudentsByIddata(3);
//                remote.findStudentsByNamedata("tipu");
                    
                   //remote.findStudentsDataOrderbyNameAsc();
        %>


    </body>
</html>
