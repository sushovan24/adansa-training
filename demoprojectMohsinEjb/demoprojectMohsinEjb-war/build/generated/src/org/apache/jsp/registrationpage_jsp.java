package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registrationpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("        <title>student Register </title>\r\n");
      out.write("       // <link href=\"https://fonts.googleapis.com/css?family=ZCOOL+XiaoWei\" rel=\"stylesheet\">\r\n");
      out.write("       // <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"regbox box\">\r\n");
      out.write("                <!--\r\n");
      out.write("                <img class=\"avatar\" src=\"img/collaboration.png\">\r\n");
      out.write("                -->\r\n");
      out.write("                <h1>Students Register </h1>\r\n");
      out.write("                <form action=\"RegisterServlet\" method=\"post\">\r\n");
      out.write("                    <p> Username</p>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"Username\" name=\"name\" required>\r\n");
      out.write("                    <p> pasword</p>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"pasword\" name=\"pasword\" required>\r\n");
      out.write("                    <p> mobile no </p>\r\n");
      out.write("                    <input type=\"password\" placeholder=\"mobile no\" name=\"mobile no\" required>\r\n");
      out.write("                    <p> subject </p>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"pasword\" name=\"pasword\" required>\r\n");
      out.write("                    <p> marks</p>\r\n");
      out.write("                    <input type=\"text\" placeholder=\"marks\" name=\"marks\" required>\r\n");
      out.write("                    <input type=\"submit\" value=\"Register\">\r\n");
      out.write("                    <a href=\"index.jsp\">Already have Account?</a>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
