
<%@page import="com.rajdemo.entity.Students"%>
<%@page import="com.rajdemo.bl.TestRemoteImpl"%>
<%@page import="javax.naming.InitialContext"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Login page</title>
    </head>
    <body>
        <div class="row mt-4">
            <div class="col-md-6 offset-3">
                <div class="text-center">
                    <h1>This is Login Page</h1>
                    <%
                        String m = (String) session.getAttribute("erroMsg");
                        if (m != null) {
                    %>
                    <h1><%= m%></h1>
                    <%
                        }
                        session.removeAttribute("errorMsg");
                        String sucMsg = (String) session.getAttribute("regMsg");
                        if (sucMsg != null) {%>
                    <h1 class="text-success"><%=sucMsg%></h1>
                    <%}
                        session.removeAttribute("regMsg");
                        String loginmsg = (String) session.getAttribute("loginError");
                        if (loginmsg != null) {
                    %>
                    <h1><%=loginmsg%></h1>
                    <%
                        }
                        session.removeAttribute("loginError");
                        String passmsg = (String) session.getAttribute("passformat");
                        if (passmsg != null) {
                    %>
                    <p class="text-danger"><%=passmsg%></p>
                    <%
                        }
                        session.removeAttribute("passformat");
                    %>
                </div>
                <form name="form" action="LoginServlet" method="post">
                    <div class="form-group">
                        <label for="exampleInputUserName">User Name</label>
                        <input type="text" class="form-control" id="exampleInputUserName" aria-describedby="emailHelp" placeholder="Enter email" name="email">
                    </div>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Password" name="password">
                    </div>
                    <div class="form-group text-center">
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <a href="register.jsp" class="btn btn-success">Register</a>
                        <!--<a href="register.jsp" class="btn btn-success">Register</a>-->
                    </div>
                </form>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
