package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div  class=\"form\">\n");
      out.write("\n");
      out.write("            <form id=\"contactform\">\n");
      out.write("\n");
      out.write("                <p class=\"contact\"><label for=\"name\">Name</label></p>\n");
      out.write("\n");
      out.write("                <input id=\"name\" name=\"name\" placeholder=\"First and last name\" required=\"\" tabindex=\"1\" type=\"text\">\n");
      out.write("\n");
      out.write("<p class=\"contact\"><label for=\"phone\">Mobile phone</label></p>\n");
      out.write("\n");
      out.write("                <input id=\"phone\" name=\"phone\" placeholder=\"phone number\" required=\"\" type=\"text\"> <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <p class=\"contact\"><label for=\"email\">Email</label></p>\n");
      out.write("\n");
      out.write("                <input id=\"email\" name=\"email\" placeholder=\"example@domain.com\" required=\"\" type=\"email\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <p class=\"contact\"><label for=\"username\">Create a username</label></p>\n");
      out.write("\n");
      out.write("                <input id=\"username\" name=\"username\" placeholder=\"username\" required=\"\" tabindex=\"2\" type=\"text\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <p class=\"contact\"><label for=\"password\">Create a password</label></p>\n");
      out.write("\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                <p class=\"contact\"><label for=\"repassword\">Confirm your password</label></p>\n");
      out.write("\n");
      out.write("                <input type=\"password\" id=\"password\" name=\"password\" required=\"\" type=\"text\">\n");
      out.write("\n");
      out.write("                <form action=\"/action_page.php\">\n");
      out.write("                    <p> <label for=\"birthday\">Birthday:</label></p>\n");
      out.write("                    <input type=\"date\" id=\"birthday\" name=\"birthday\">\n");
      out.write("                    </input>\n");
      out.write("                </form>\n");
      out.write("                <select class=\"select-style gender\" name=\"gender\">\n");
      out.write("\n");
      out.write("                    <option value=\"select\">Gender </option>\n");
      out.write("\n");
      out.write("                    <option value=\"m\">Male</option>\n");
      out.write("\n");
      out.write("                    <option value=\"f\">Female</option>\n");
      out.write("\n");
      out.write("                    <option value=\"others\">Other</option>\n");
      out.write("\n");
      out.write("                </select><br><br>\n");
      out.write("\n");
      out.write("                <input class=\"buttom\" name=\"submit\" id=\"submit\" tabindex=\"5\" value=\"Sign up\" type=\"submit\">   \n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
