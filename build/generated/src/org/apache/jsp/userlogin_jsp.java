package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>CRIMEDETECTA</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/crimeuser.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"loginbox\">\n");
      out.write("        <form action=\"newlog.jsp\" method=\"post\">\n");
      out.write("        <img src=\"logo.jpg\" class=\"cow\">\n");
      out.write("                <h1>CRIMEDETECTA</h1>\n");
      out.write("                <h1>LogIn as USER</h1>\n");
      out.write("                <form>\n");
      out.write("                    <p>Username</p>\n");
      out.write("                    <input type=\"text\" name=\"txtusername\" placeholder=\"Enter Username\">\n");
      out.write("                    <p>Password</p>\n");
      out.write("                    <input type=\"password\" name=\"txtpwd\" placeholder=\"Enter Password\">\n");
      out.write("                    <input type=\"submit\" name=\"btnsubmit\" value=\"LogIn\" />\n");
      out.write("                </form>\n");
      out.write("     </div>\n");
      out.write("    \n");
      out.write("</body>\n");
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
