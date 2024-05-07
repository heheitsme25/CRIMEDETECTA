package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class connectionup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<f:view>\n");
      out.write("    <html>\n");
      out.write("       <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Admin Crime Registration</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/try.css\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"gradient-background\">\n");
      out.write("        <form action=\"admincrimeconnup.jsp\" method=\"post\">\n");
      out.write("        <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("            <div class=\"navbar-left\">\n");
      out.write("            <img\n");
      out.write("              class=\"logo-icon\"\n");
      out.write("              src=\"logo.jpg\"\n");
      out.write("              width=\"100\"\n");
      out.write("              \n");
      out.write("              height=\"60\"\n");
      out.write("              alt=\"logo\"\n");
      out.write("            />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"navbar-right ms-auto\">\n");
      out.write("          <div class=\"navbar-collapse navbar-nav\">\n");
      out.write("              <ul class=\"navbar-nav\">\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"home.jsp\">Home</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                  <li class=\"nav-item\"><a class=\"nav-link\" href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("              </ul>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("        </nav>\n");
      out.write("    <div class=\"form-container\">\n");
      out.write("        <h1><bold>Crime Registration for Uttar Pradesh</bold></h1>\n");
      out.write("        <form action=\"admincrimeconnup.jsp\" method=\"post\">\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"address\">Area Number</label>\n");
      out.write("                <input type=\"text\" id=\"areano\" name=\"address\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"districtName\" class=\"district-name\">District Name</label>\n");
      out.write("                <input type=\"text\" id=\"districtName\" name=\"districtName\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"areaName\">Area Name</label>\n");
      out.write("                <input type=\"text\" id=\"areaName\" name=\"areaName\" required>\n");
      out.write("                <label for=\"pinCode\" class=\"pin-code\">Pin Code</label>\n");
      out.write("                <input type=\"text\" id=\"pinCode\" name=\"pinCode\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"policeStationAddress\"> Police Station Address</label>\n");
      out.write("                <input type=\"text\" id=\"policeStationAddress\" name=\"policeStationAddress\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"hospital\"> Hospital Address </label>\n");
      out.write("                <input type=\"text\" id=\"hospital\" name=\"hospital\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"hospitalNumber\">Hospital Number</label>\n");
      out.write("                <input type=\"text\" id=\"hospitalNumber\" name=\"hospitalNumber\" required>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <label for=\"crimeName\">Crime Name</label>\n");
      out.write("                <select id=\"crimeName\" name=\"crimeName\" required>\n");
      out.write("                    <option value=\"\"></option>\n");
      out.write("                    <option value=\"Cyber Crime\">Cyber Crime</option>\n");
      out.write("                    <option value=\"Environmental Crime\">Environmental Crime </option>\n");
      out.write("                    <option value=\"Human Trafficking\">Human Trafficking</option>\n");
      out.write("                    <option value=\"Sexual Assault\">Sexual Assault</option>\n");
      out.write("                    <option value=\"White Collar Crime\">White Collar Crime</option>\n");
      out.write("                </select>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("                <input type=\"submit\" value=\"Submit\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("    </html>\n");
      out.write("</f:view>\n");
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
