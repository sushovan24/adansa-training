<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> LoginPage</title>
        <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
               <!--   for immage seating ke liye  used kar sakte ho 
               <img class="avatar" src="img/collaboration.png"> 
               -->
                <h1>
                      StudentsPage </h1>
                <form action="LoginPageServlet" method="post">
                    <p>
                        Username</p>
                    <input type="text" placeholder="Username" name="name" required>
                    <p>
                        Password</p>
                    <input type="password" placeholder="Password" name="password" required>
                    <input type="submit" value="Login">
                    <p>
                        <a href="index.jsp">Create New Account</a>
                    </p>
                    <a href="index.jsp">Forgot Pasword</a>
                </form>
            </div>
        </div>
    </body>
</html>

