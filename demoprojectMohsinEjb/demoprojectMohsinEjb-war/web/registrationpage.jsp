<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>student Register </title>
       // <link href="https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei" rel="stylesheet">
       // <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
            <div class="regbox box">
                <!-- for immage purpose used kar sakte hai 
                <img class="avatar" src="img/collaboration.png">
                -->
                <h1>Students Register </h1>
                <form action="RegisterServlet" method="post">
                    <p> Username</p>
                    <input type="text" placeholder="Username" name="name" required>
                    <p> pasword</p>
                    <input type="text" placeholder="pasword" name="pasword" required>
                    <p> mobile no </p>
                    <input type="password" placeholder="mobile no" name="mobile no" required>
                    <p> subject </p>
                    <input type="text" placeholder="pasword" name="pasword" required>
                    <p> marks</p>
                    <input type="text" placeholder="marks" name="marks" required>
                    <input type="submit" value="Register">
                    <a href="index.jsp">Already have Account?</a>
                </form>
            </div>
        </div>
    </body>
</html>
