<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>login</title>
        
    </head>
    <body>
        <div> students </div>
        
    </body>
</html>
</head> <title> insertData </title> </head>
<body>
     <div align="center">
       <h1>studentsLogin</h1>
         <form action="<%=request.getContextPath()%>/login" method="post">
     <table style="with: 100%">
    <tr>
     <td>UserName</td>
     <td><input type="text" name="username" /></td>
    </tr>
    <tr>
     <td>Password</td>
     <td><input type="password" name="password" /></td>
    </tr>
    </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>
