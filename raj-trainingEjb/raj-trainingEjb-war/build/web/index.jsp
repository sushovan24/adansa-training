<%-- 
    Document   : index
    Created on : Sep 30, 2021, 3:57:03 PM
    Author     : PANDIT
--%>

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
            TestRemoteRemote remote=(TestRemoteRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/TestRemote!com.rajtraining.ejb.bl.TestRemoteRemote");
            remote.print("hi this first ejb make by raj");
            
            TestRemoteStatefulBeanRemote sremote= (TestRemoteStatefulBeanRemote) new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/TestRemoteStatefulBean!com.rajtraining.ejb.bl.TestRemoteStatefulBean");
            sremote.printStatelessMsg("this is statefull session bean");
        %>
        
        <a href="bank.jsp">Open Account</a>  
    </body>
</html>
