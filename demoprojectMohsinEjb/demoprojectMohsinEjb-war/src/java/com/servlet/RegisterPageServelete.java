package com.servlet;

import com.demoproject.bl.TestRemoteRemote;
import com.demoproject.entity.Students;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterPageServelete extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            TestRemoteRemote remote = (TestRemoteRemote) new InitialContext().lookup("java:global/demoprojectMohsinEjb/demoprojectMohsinEjb-ejb/TestRemote!com.demoproject.bl.TestRemoteRemote");

            String sname = request.getParameter("name");
            String password = request.getParameter("password");
            String mobile = request.getParameter("mobile");
            String sub = request.getParameter("subject");
            int mark = Integer.parseInt(request.getParameter("marks"));

            // user name and password only 
            // login page only 
            //create a database model   we can used for jdbc for connection purpose
            Students student = new Students(1);
            // if (student.saveUser(userModel)) {
            response.sendRedirect("index.html");
            //   } else {
            String errorMessage = "User Available";
            HttpSession regSession = request.getSession();
            regSession.setAttribute("RegError", errorMessage);
            response.sendRedirect("register.jsp");
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(RegisterPageServelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(RegisterPageServelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
