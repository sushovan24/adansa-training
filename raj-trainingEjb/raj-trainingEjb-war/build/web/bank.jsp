<%-- 
    Document   : bank
    Created on : Sep 30, 2021, 7:06:05 PM
    Author     : PANDIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="operationprocess.jsp">  
            Enter Amount:<input type="text" name="amount"/><br>  

            Choose Operation:  
            Deposit<input type="radio" name="operation" value="deposit"/>  
            Withdraw<input type="radio" name="operation" value="withdraw"/>  
            Check balance<input type="radio" name="operation" value="checkbalance"/>  
            <br>  
            <input type="submit" value="submit">  
        </form>  
    </body>
</html>
