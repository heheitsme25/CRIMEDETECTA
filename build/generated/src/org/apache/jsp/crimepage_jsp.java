package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class crimepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <head>\n");
      out.write("       <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Crimes</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/crimes.css\"/>\n");
      out.write("    <script>\n");
      out.write("      src=\"https://kit.fontawesome.com/7a4b62b0a4.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("      </script>\n");
      out.write("  </head>\n");
      out.write("        <body>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("        <div class=\"navbar-left\">\n");
      out.write("            <img\n");
      out.write("              class=\"logo-icon\"\n");
      out.write("              src=\"logo.jpg\"\n");
      out.write("              width=\"100\"\n");
      out.write("              \n");
      out.write("              height=\"60\"\n");
      out.write("              alt=\"logo\"\n");
      out.write("            />\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-right ms-auto\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                <li><a href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                <li><a href=\"prevention.jsp\">Prevention</a></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"gradient-background\">\n");
      out.write("      <section id=\"hero\">\n");
      out.write("        <div class=\"hero_content\">\n");
      out.write("          <h1>\"Stop! Drop it!\"</h1>\n");
      out.write("          <h4>You are under arrest.</h4>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero_image\">\n");
      out.write("          <img src=\"https://images.pexels.com/photos/923681/pexels-photo-923681.jpeg?cs=srgb&dl=pexels-kat-wilcox-923681.jpg&fm=jpg\" alt=\"hero\" width=\"650\" height=\"320\" />\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("<br>\n");
      out.write("      <div class=\"card_container\">\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("          <div class=\"v-card\">\n");
      out.write("            <div class=\"card_content\">\n");
      out.write("              <h2>Maps</h2>\n");
      out.write("              <p>\n");
      out.write("                Maps serve as invaluable tools in crime detection and various other domains due to their ability to visually represent geographical data. In crime detection, patterns, aiding law enforcement agencies in deploying resources effectively.\n");
      out.write("              </p>\n");
      out.write("              <div class=\"status\">\n");
      out.write("          \n");
      out.write("\n");
      out.write("                <a href=\"states.jsp\"><button class=\"read-btn\">Read More</button></a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"css/maps.jpg\" alt=\"Maps\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("          <div class=\"v-card\">\n");
      out.write("            <div class=\"card_content\">\n");
      out.write("              <h2>States</h2>\n");
      out.write("              <p>\n");
      out.write("                State boundaries serve as critical reference points for crime analysis and law enforcement, enabling jurisdictional delineation, resource allocation, and strategic planning to address regional crime dynamics effectively.\n");
      out.write("              </p>\n");
      out.write("              <div class=\"status\">\n");
      out.write("                <a href=\"states.jsp\"><button class=\"read-btn\">Read More</button></a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"css/states.jpg\" alt=\"States\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("          <div class=\"v-card\">\n");
      out.write("            <div class=\"card_content\">\n");
      out.write("              <h2>Database</h2>\n");
      out.write("              <p>\n");
      out.write("                Crime databases serve as comprehensive repositories, centralizing crucial information for law enforcement agencies to track criminal activities, analyze patterns, and facilitate investigations, ultimately enhancing public safety and justice.\n");
      out.write("              </p>\n");
      out.write("              <div class=\"status\">\n");
      out.write("               \n");
      out.write("                <a href=\"states1.jsp\"><button class=\"read-btn\">Read More</button></a>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"css/database'.jpg\" alt=\"Database\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("            <div class=\"v-card\">\n");
      out.write("              <div class=\"card_content\">\n");
      out.write("                <h2>Preventions</h2>\n");
      out.write("                <p>\n");
      out.write("                    Prevention is paramount in combating crime, fostering safer communities through proactive measures such as community engagement, education, and targeted interventions aimed at addressing root causes and reducing criminal opportunities.\n");
      out.write("                </p>\n");
      out.write("                <div class=\"status\">\n");
      out.write("                 \n");
      out.write("                  <a href=\"prevention.jsp\"><button class=\"read-btn\">Read More</button></a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"css/prevention.jpg\" alt=\"Prevention\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </main>\n");
      out.write("    <hr />\n");
      out.write("        </body>\n");
      out.write("    </html>\n");
      out.write("</f:view>\n");
      out.write("\n");
      out.write("\n");
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
