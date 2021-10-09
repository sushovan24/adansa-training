<%-- 
    Document   : operationprocess
    Created on : Sep 30, 2021, 7:08:12 PM
    Author     : PANDIT
--%>

<%@page import="com.bank.bl.BankRemoteRemote"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        BankRemoteRemote bremote=(BankRemoteRemote)new InitialContext().lookup("java:global/raj-trainingEjb/raj-trainingEjb-ejb/BankRemote!com.bank.bl.BankRemoteRemote");
        int amount = Integer.parseInt(request.getParameter("amount"));
        String operation = request.getParameter("operation");
        
        if(operation.equalsIgnoreCase("deposit")){
            bremote.deposit(amount);
        }else if(operation.equalsIgnoreCase("withdraw")){
            bremote.withdraw(amount);
        }else if(operation.equalsIgnoreCase("checkbalance")){
            bremote.getBalance();
        }
        %>
    </body>
</html>
