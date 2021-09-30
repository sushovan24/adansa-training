<%-- 
    Document   : index
    Created on : 30 Sep, 2021, 12:47:23 PM
    Author     : DELL
--%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="com.training.ejb.bl.TestRemoteRemote"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        TestRemoteRemote remote = (TestRemoteRemote)new InitialContext().lookup("java:global/TrainingEjb/TrainingEjb-ejb/TestRemote!com.training.ejb.bl.TestRemoteRemote");
        remote.testPrint("Hi this is my first ejb");
        %>
        <h1>Hello World!</h1>
    </body>
</html>
