package com.servlet;

import com.rajdemo.bl.TestRemoteImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();

            String name = request.getParameter("email");
            String password = request.getParameter("password");
            String sub = request.getParameter("subject");
            String mobile = request.getParameter("mobile");
            int mark = Integer.parseInt(request.getParameter("mark"));

            TestRemoteImpl remote = (TestRemoteImpl) new InitialContext().lookup("project-jndi");

            boolean valid = validatePassword(password);
            HttpSession session = request.getSession();
            if (valid) {
                boolean f = remote.saveUser(name, password, sub, mobile, mark);
                if (f) {
                    session.setAttribute("regMsg", "registration successfull");
                    response.sendRedirect("index.jsp");
                } else {
                    session.setAttribute("regError", "username is already taken try different username");
                    response.sendRedirect("register.jsp");
                }
            } else {
                session.setAttribute("passformat", "password should be one letter upper & lower case, one character and number with 8 digit long");
                response.sendRedirect("register.jsp");
            }

        } catch (NamingException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
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
