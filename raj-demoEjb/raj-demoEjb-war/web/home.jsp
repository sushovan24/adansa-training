<%-- 
    Document   : home
    Created on : Oct 21, 2021, 1:57:43 PM
    Author     : PANDIT
--%>

<%@page import="com.rajdemo.entity.Marks"%>
<%@page import="com.rajdemo.entity.StudentDetails"%>
<%@page import="java.util.List"%>
<%@page import="com.rajdemo.entity.Students"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

        <title>Hello, world!</title>
    </head>
    <body>

        <div class="row">
            <div class="col-md-8 offset-2 mt-3">
                <h1 class="text-center">User data</h1>




                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th scope="col">studentId</th>
                            <th scope="col">username</th>
                            <th scope="col">mobile</th>
                            <th scope="col">subject</th>
                            <th scope="col">marks</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            Students obj = (Students) session.getAttribute("msg");
                            if (obj != null) {
                                List<StudentDetails> studentdata = obj.getSdList();
                                List<Marks> studentmark = obj.getMarkList();
                        %>
                        <tr>
                            <td><%=obj.getId()%></td>
                            <td><%=obj.getStudentName()%></td>
                            <%
                                for (StudentDetails sd : studentdata) {
                            %>
                            <td><%=sd.getMobile()%></td>
                            <%
                                }
                                for (Marks m : studentmark) {
                            %>
                            <td><%=m.getSubject()%></td>
                            <td><%=m.getMark()%></td>
                            <%
                                }
                            %>

                        </tr>
                        <%
                            }
                            session.removeAttribute("msg");
                        %>

                    </tbody>
                </table>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    </body>
</html>
