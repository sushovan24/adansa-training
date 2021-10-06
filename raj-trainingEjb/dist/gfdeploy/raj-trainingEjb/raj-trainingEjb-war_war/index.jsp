<%-- 
    Document   : index
    Created on : Sep 30, 2021, 3:57:03 PM
    Author     : PANDIT
--%>

<%@page import="com.entity.Students"%>
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
//            NeverRemoteRemote nremote = (NeverRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/NeverRemote!com.trans.never.bl.NeverRemoteRemote");
//            nremote.print("this is never transaction");
//            nremote.printSupport("this is support transaction");
//            nremote.printNotSupported("this is not supported transaction");

            TestRemoteRemote remote = (TestRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/TestRemote!com.rajtraining.ejb.bl.TestRemoteRemote");
             Students student = new Students();
             student.setName("rajkumar");
             remote.createStudent(student);
        %>

        <a href="bank.jsp">Open Account</a>  
    </body>
</html>
