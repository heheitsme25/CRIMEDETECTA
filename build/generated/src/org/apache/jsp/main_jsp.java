package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n");
      out.write("            background-color: #ADD8E6;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            background: url(background_1.jpg);\n");
      out.write("            background-size: cover;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .container {\n");
      out.write("            background: maroon;\n");
      out.write("            border-radius: 8px;\n");
      out.write("            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            text-align: center;\n");
      out.write("            position: relative;\n");
      out.write("            right: 50%;\n");
      out.write("            transform: translateX(50%);\n");
      out.write("            padding: 20px; /* Added padding for spacing */\n");
      out.write("        }\n");
      out.write("        .con{\n");
      out.write("            position: relative;\n");
      out.write("            width: 100vw;\n");
      out.write("            height: 100vh;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        img{\n");
      out.write("            position: absolute;\n");
      out.write("            top: 0px;\n");
      out.write("            left: 0px;\n");
      out.write("        }\n");
      out.write("        h2 {\n");
      out.write("            color: white;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn {\n");
      out.write("            display: inline-block;\n");
      out.write("            padding: 10px 20px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            transition: background-color 0.3s;\n");
      out.write("            margin: 5px; /* Added margin for spacing */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Added CSS for two-column layout */\n");
      out.write("        .btn-container {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            margin-top: 20px; /* Added margin for spacing */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-container .btn {\n");
      out.write("            flex: 1; /* Distribute space evenly between buttons */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"con\">\n");
      out.write("         <img src=\"css/logo.jpg\" alt=\"logo\" width=\"100\" height=\"60\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h2>CRIMEDETECTA</h2>\n");
      out.write("        \n");
      out.write("        <div class=\"btn-container\">\n");
      out.write("            <a href=\"registration.jsp\" class=\"btn\">Register as Admin</a>\n");
      out.write("            <a href=\"newuserreg.jsp\" class=\"btn\">Register as User</a>\n");
      out.write("        </div>\n");
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
