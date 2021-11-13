package com.login;

import com.demoproject.bl.TestRemoteRemote;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginpage", urlPatterns = {"/loginpage"})
public class LoginPageServelete extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            // jndi
            TestRemoteRemote remote = (TestRemoteRemote) new InitialContext().lookup("java:global/demoprojectMohsinEjb/demoprojectMohsinEjb-ejb/TestRemote!com.demoproject.bl.TestRemoteRemote");
            // fetch data from login page 
            String sname = request.getParameter("name");
            String password = request.getParameter("password");

            //create a database for ejb models Remote and war file ke liye
            //Student s = new Student();
            // s.setUsername(name);
            //	s.setPassword(password);
            //	try {
            //		if (loginDao.validate(loginBean)) {
            //HttpSession session = request.getSession();
            // session.setAttribute("username",username);
            response.sendRedirect("loginsuccess.jsp");
            //	} else {
            HttpSession session = request.getSession();
            //session.setAttribute("user", username);
            //response.sendRedirect("login.jsp");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(LoginPageServelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            Logger.getLogger(LoginPageServelete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
