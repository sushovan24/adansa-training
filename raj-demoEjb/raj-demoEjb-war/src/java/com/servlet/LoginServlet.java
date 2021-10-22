/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import com.google.common.base.Objects;
import com.rajdemo.bl.TestRemoteImpl;
import com.rajdemo.da.Test;
import com.rajdemo.da.TestLocal;
import com.rajdemo.entity.Students;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            TestRemoteImpl remote = (TestRemoteImpl) new InitialContext().lookup("project-jndi");
            //project-jndi
            // java:global/raj-demoEjb/raj-demoEjb-ejb/Test!com.rajdemo.da.TestLocal
            String name = request.getParameter("email");
            String password = request.getParameter("password");
            
            boolean passworddata = validatePassword(password);
            HttpSession session = request.getSession();
            if (passworddata) {
                Students studentobj = remote.logIn(name, password);
                if (studentobj != null) {
                    session.setAttribute("msg", studentobj);
                    response.sendRedirect("home.jsp");
                } else {
                    session.setAttribute("loginError", "sorry username and password is not valid");
                    response.sendRedirect("index.jsp");
                }
            } else {
                out.println("wrong formate");
            }
        } catch (NamingException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX
            = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    
    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
    
    public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}");
    
    public static boolean validatePassword(String password) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(password);
        return matcher.find();
    }
    
}
