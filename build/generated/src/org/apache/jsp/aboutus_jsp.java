package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aboutus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("\n");
      out.write("    <title>About-CrimeDetecta</title>\n");
      out.write("\n");
      out.write("    <meta\n");
      out.write("      name=\"description\"\n");
      out.write("      content=\"A description about gogreen as a company\"\n");
      out.write("    />\n");
      out.write("\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@400;700&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      referrerpolicy=\"no-referrer\"\n");
      out.write("    />\n");
      out.write("   \n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\"  href=\"css/aboutus.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header id=\"header\" class=\"header\">\n");
      out.write("      <nav class=\"navbar\">\n");
      out.write("        <div id=\"navbar-1\">\n");
      out.write("          <a href=\"/\">\n");
      out.write("            <img\n");
      out.write("              class=\"logo-icon\"\n");
      out.write("              src=\"css/logo.jpg\"\n");
      out.write("              width=\"100\"\n");
      out.write("              height=\"60\"\n");
      out.write("              alt=\"logo\"\n");
      out.write("            />\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"navbar-right ms-auto\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                <li><a href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                <li><a href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <main>\n");
      out.write("      <section class=\"company-members\" id=\"company-members\">\n");
      out.write("        <div class=\"content\">\n");
      out.write("          <h1>ABOUT US</h1>\n");
      out.write("          <hr />\n");
      out.write("          <div class=\"members\">\n");
      out.write("            <div class=\"members-content\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"css/ashirika.jpg\" height=\"200\" width=\"200\"/>\n");
      out.write("                <h2 style=\"color: white;\" > Ashirika Bharadwaj</h2>\n");
      out.write("                <h4 style=\"color: white;\" >Mail - ashirikabhardwaj@gmail.com</h4>\n");
      out.write("                <h4 style=\"color: white;\" >LinkedIn - www.linkedin.com/in/ashirika-bhardwaj-2a6930230</h4>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"members-content\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"css/anu.jpg\" height=\"200\" width=\"200\" />\n");
      out.write("                <h2 style=\"color: white;\" >Anukriti</h2>\n");
      out.write("                <h4 style=\"color: white;\" >Mail - anukriti9732@gmail.com</h4>\n");
      out.write("                <h4 style=\"color: white;\" >LinkedIn - www.linkedin.com/in/anukriti-banga-420a5b256</h4>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"members-content\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"css/aarushi.jpg\" height=\"200\" width=\"200\" />\n");
      out.write("                <h2 style=\"color: white;\" >Arushi</h2>\n");
      out.write("                <h4 style=\"color: white;\" >Mail - nishi.raj.2509@gmail.com</h4>\n");
      out.write("                <h4 style=\"color: white;\" >LinkedIn - www.linkedin.com/in/arushi-raj-6b0b62219/</h4>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"members-content\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"css/anshika.jpg\" height=\"200\" width=\"200\" />\n");
      out.write("                <h2 style=\"color: white;\" >Anshika Yadav</h2>\n");
      out.write("                <h4 style=\"color: white;\" >Mail - anshi02ka@gmail.com</h4>\n");
      out.write("                <h4 style=\"color: white;\" >LinkedIn - www.linkedin.com/in/anshika-yadav-26543a227</h4>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("          <hr />\n");
      out.write("          <div class=\"company-members-end\">\n");
      out.write("            <h1></h1>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("    </main>\n");
      out.write("  </body>\n");
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
