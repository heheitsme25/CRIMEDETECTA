package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class FAQ_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>FAQs Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/styles.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;900&family=Open+Sans:wght@300;400;500;600;700&family=Ubuntu:wght@300;400;500;700&display=swap\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    ");
      out.write("\n");
      out.write("    <nav class=\"nav-bar\">\n");
      out.write("        <div class=\"navbar-left\">\n");
      out.write("            <a href=\"/\">\n");
      out.write("                <img class=\"logo-icon\" src=\"logo.jpg\" width=\"100\" height=\"60\" alt=\"logo\" />\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"navbar-right ms-auto\">\n");
      out.write("            <ul>\n");
      out.write("                 <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                <li><a href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                <li><a href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <header class=\"index-header\">\n");
      out.write("        <section class=\"questions\">\n");
      out.write("            <div class=\"question-form\">\n");
      out.write("                <h1 class=\"disabled-heading\" style=\"background-color:powderblue;\">You have questions, right?</h1>\n");
      out.write("                <h1 class=\"disabled-heading\" style=\"background-color:rgb(54, 86, 90);\">We are here to help!</h1>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <main>\n");
      out.write("        ");
      out.write("\n");
      out.write("        <section class=\"frequent-question\">\n");
      out.write("            <h1>These are top topics recommended for you!</h1>\n");
      out.write("            <div class=\"answer-question\">\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"metadata\">\n");
      out.write("                    <span><img class=\"open active\" src=\"css/up-circle-1.png\" alt=\"\"></span>\n");
      out.write("                    <span><img class=\"close\" src=\"css/down-circle.png\"></span>\n");
      out.write("                    <h2 class=\"meta-question\">What is crime analysis?</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <p>Crime analysis is the systematic examination of crime and disorder data to identify patterns, trends, and relationships that can help law enforcement agencies and communities understand crime issues better. By analyzing various data sources, such as crime reports, arrests, and calls for service, crime analysts provide valuable insights to support informed decision-making and proactive crime prevention strategies.</p>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"metadata\">\n");
      out.write("                    <span><img class=\"open active\" src=\"css/up-circle-1.png\" alt=\"\"></span>\n");
      out.write("                    <span><img class=\"close\" src=\"css/down-circle.png\"></span>\n");
      out.write("                    <h2 class=\"meta-question\">How can I access crime data for my community?</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <p>Many law enforcement agencies provide access to crime data through their websites, online crime mapping tools, or public records requests. Community members can also attend local meetings or forums where crime data and trends are discussed, or they can contact their local police department or sheriff's office for assistance in obtaining specific crime information.</p>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"metadata\">\n");
      out.write("                    <span><img class=\"open active\" src=\"css/up-circle-1.png\" alt=\"\"></span>\n");
      out.write("                    <span><img class=\"close\" src=\"css/down-circle.png\"></span>\n");
      out.write("                    <h2 class=\"meta-question\">What privacy measures are in place when handling crime data?</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\"> \n");
      out.write("                    <p>Law enforcement agencies adhere to strict privacy protocols and legal requirements when handling crime data to protect individuals' sensitive information. Access to crime data is typically restricted to authorized personnel, and data sharing practices comply with applicable laws and regulations, such as the Health Insurance Portability and Accountability Act (HIPAA) and the Freedom of Information Act (FOIA).</p>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"metadata\">\n");
      out.write("                    <span><img class=\"open active\" src=\"css/up-circle-1.png\" alt=\"\"></span>\n");
      out.write("                    <span><img class=\"close\" src=\"css/down-circle.png\"></span>\n");
      out.write("                    <h2 class=\"meta-question\">How does crime analysis help law enforcement?</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <p>Crime analysis assists law enforcement agencies in several ways. By identifying crime patterns and hotspots, agencies can allocate resources more effectively, target crime prevention efforts in high-risk areas, and track the effectiveness of their interventions over time. Additionally, crime analysis supports investigative efforts by providing timely information and intelligence to detectives, helping them identify suspects and link related crimes.</p>\n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("                <div class=\"metadata\">\n");
      out.write("                    <span><img class=\"open active\" src=\"css/up-circle-1.png\" alt=\"\"></span>\n");
      out.write("                    <span><img class=\"close\" src=\"css/down-circle.png\"></span>\n");
      out.write("                    <h2 class=\"meta-question\">How can I report suspicious activity or crime tips?</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <p>Reporting suspicious activity or providing crime tips is crucial for maintaining community safety. Individuals can report suspicious activity to their local law enforcement agency by calling the non-emergency number or using online reporting forms if available. Many agencies also offer anonymous reporting options through hotlines or tip lines staffed by trained personnel who can receive and investigate tips confidentially. Remember, if you believe a crime is in progress or someone is in immediate danger, always call 100.</p> \n");
      out.write("                </div>\n");
      out.write("                ");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <section class=\"in-touch\">\n");
      out.write("            <h1 class=\"touch-heading\">Still have questions?</h1>\n");
      out.write("            <p class=\"touch-paragraph\">Can't Find The Answer You Are Looking For?  Chat Out Friendly Team.</p>\n");
      out.write("            <a href=\"aboutus.jsp\"><button class=\"touch-button\" type=\"button\">Get in touch with us</button></a>\n");
      out.write("        </section>\n");
      out.write("    </main>\n");
      out.write("\n");
      out.write("    <script src=\"index.js\" charset=\"utf-8\"></script>\n");
      out.write("    \n");
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
