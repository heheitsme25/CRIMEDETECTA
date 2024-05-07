package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;

public final class newuserreg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Registration Form</title>\n");
      out.write("    <link rel=\"stylesheet\"  href=\"css/registeration.css\" type=\"text/css\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <script>\n");
      out.write("        function validateForm() {\n");
      out.write("            var password = document.getElementById(\"txtpwd\").value;\n");
      out.write("            var confirmPassword = document.getElementById(\"txtcpwd\").value;\n");
      out.write("            if (password != confirmPassword) {\n");
      out.write("                alert(\"Passwords do not match!\");\n");
      out.write("                return false;\n");
      out.write("            }\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"title\">Registration</div>\n");
      out.write("        <form action=\"newregserv.jsp\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("            <div class=\"user-details\">\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Username</span>\n");
      out.write("                    <input type=\"text\" name=\"txtusername\" placeholder=\"Enter your Username\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">First Name</span>\n");
      out.write("                    <input type=\"text\" name=\"txtfname\" placeholder=\"Enter your First name\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Last Name</span>\n");
      out.write("                    <input type=\"text\" name=\"txtlname\" placeholder=\"Enter your Last name\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Email</span>\n");
      out.write("                    <input type=\"text\" name=\"txtmail\" placeholder=\"Enter your Email\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Password</span>\n");
      out.write("                    <input type=\"password\" name=\"txtpwd\" id=\"txtpwd\" placeholder=\"Enter your Password\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Confirm Password</span>\n");
      out.write("                    <input type=\"password\" name=\"txtcpwd\" id=\"txtcpwd\" placeholder=\"Enter Confirm Password\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-box\">\n");
      out.write("                    <span class=\"details\">Phone Number</span>\n");
      out.write("                    <input type=\"text\" name=\"txtphno\" placeholder=\"Enter your Phone Number\" required>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"gender-details\">\n");
      out.write("                    <input type=\"radio\" name=\"gender\" id=\"dot-1\">\n");
      out.write("                    <input type=\"radio\" name=\"gender\" id=\"dot-2\">\n");
      out.write("                    <input type=\"radio\" name=\"gender\" id=\"dot-3\">\n");
      out.write("                    <span class=\"gender-title\">Gender</span>\n");
      out.write("                    <div class=\"category\">\n");
      out.write("                        <label for=\"dot-1\">\n");
      out.write("                            <span class=\"dot one\"></span>\n");
      out.write("                            <span class=\"Gender\">Male</span>\n");
      out.write("                        </label>\n");
      out.write("                        <label for=\"dot-2\">\n");
      out.write("                            <span class=\"dot two\"></span>\n");
      out.write("                            <span class=\"Gender\">Female</span>\n");
      out.write("                        </label>\n");
      out.write("                        <label for=\"dot-3\">\n");
      out.write("                            <span class=\"dot three\"></span>\n");
      out.write("                            <span class=\"Gender\">Other</span>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"button\">\n");
      out.write("                    <input type=\"submit\" value=\"Register\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
