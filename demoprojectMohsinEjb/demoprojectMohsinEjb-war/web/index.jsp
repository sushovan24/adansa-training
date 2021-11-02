<%-- 
    Document   : index
    Created on : 22 Oct, 2021, 10:35:29 AM
    Author     : Md mohsin alam
--%>

<%@page import="com.demoproject.entity.Marks"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.demoproject.entity.Students"%>
<%@page import="com.demoproject.entity.StudentDetails"%>
<%@page import="com.demoproject.bl.TestRemoteRemote"%>
<%@page import="javax.naming.InitialContext"%>
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
            TestRemoteRemote remote = (TestRemoteRemote) new InitialContext().lookup("java:global/demoprojectMohsinEjb/demoprojectMohsinEjb-ejb/TestRemote!com.demoproject.bl.TestRemoteRemote");
            remote.print("hello");
//        remote.printData(43);
            Students s = new Students();
            s.setStudentName("mohsin");
            s.setPassword("Mohsin@1233");
            
            StudentDetails sd = new StudentDetails();
            sd.setMobile("8965231254");
            sd.setStudentId(s);
            
            List<StudentDetails> list = new ArrayList<StudentDetails>();
            list.add(sd);
            
            Marks m = new Marks();
            m.setStudId(s);
            m.setSubject("math");
            m.setMark(75);
            List<Marks> markList = new ArrayList<Marks>();
            markList.add(m);
            
            s.setSdmarks(markList);
            s.setStdentdetaillist(list);
            
            remote.addstudent(s);
            

        %>
        <a href="registrationpage.jsp"></a>
        <a href="loginpage.jsp"></a>
    </body>
</html>
