<%-- 
    Document   : index
    Created on : 4 Oct, 2021, 6:31:22 PM
    Author     : Md mohsin alam
--%>

<%@page import="javax.naming.InitialContext"%>
<%@page import="com.ejb.bl.TestRemoteRemote"%>
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
            TestRemoteRemote remote = ( TestRemoteRemote)new InitialContext().lookup("java:global/mohsin-trainingEjb/mohsin-trainingEjb-ejb/TestRemote!com.ejb.bl.TestRemoteRemote");
            remote.printMessage("hi this is my first statless bean");
            remote.add(55, 5);
        %>
    </body>
</html>
