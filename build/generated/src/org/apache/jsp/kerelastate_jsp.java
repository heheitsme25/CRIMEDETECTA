package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class kerelastate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Crimes</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/delhistate.css\" />\n");
      out.write("    <script\n");
      out.write("      src=\"https://kit.fontawesome.com/7a4b62b0a4.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    ></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg\">\n");
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
      out.write("               <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                <li><a href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                <li><a href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <main>\n");
      out.write("        <div class=\"gradient-background\">\n");
      out.write("      <section id=\"hero\">\n");
      out.write("        <div class=\"hero_content\">\n");
      out.write("          <h2>\"Understanding the spectrum of crimes is the first step towards building safer communities.\"</h2>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"hero_image\">\n");
      out.write("          <img src=\"css/crime.avif\" alt=\"hero\" width=\"650\" height=\"320\" />\n");
      out.write("        </div>\n");
      out.write("      </section>\n");
      out.write("<br>\n");
      out.write("      <div class=\"card_container\">\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("          <div class=\"v-card\">\n");
      out.write("            <div class=\"card_content\">\n");
      out.write("              <h2>Cybercrime</h2>\n");
      out.write("              <p>\n");
      out.write("                Cybercrime in Kerala involves a range of illicit activities conducted online, including hacking, identity theft, phishing, and online fraud. Perpetrators exploit vulnerabilities in digital systems to steal sensitive information, disrupt services, or perpetrate financial crimes. Law enforcement agencies employ specialized units to investigate and combat these evolving cyber threats in the capital city.\n");
      out.write("              </p>\n");
      out.write("              <div class=\"status\">\n");
      out.write("                \n");
      out.write("                <a href=\"mapkeralacyber.jsp\"\n");
      out.write("                  ><button class=\"read-btn\">Open Map</button></a\n");
      out.write("                >\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"css/cc.jpg\" alt=\"Maps\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("          <div class=\"v-card\">\n");
      out.write("            <div class=\"card_content\">\n");
      out.write("              <h2>Sexual Assault</h2>\n");
      out.write("              <p>\n");
      out.write("                Sexual assault in Kerala is a pressing issue, with incidents ranging from harassment to rape. Perpetrators often target women and children, exploiting vulnerabilities and societal norms. Despite increased awareness and legal reforms, underreporting remains a challenge due to social stigma and institutional barriers. Efforts focus on prevention, victim support, and legal prosecution.\n");
      out.write("              </p>\n");
      out.write("              <div class=\"status\">\n");
      out.write("                \n");
      out.write("                <a href=\"css/kerelasamap.jsp\"\n");
      out.write("                  ><button class=\"read-btn\">Open Map</button></a\n");
      out.write("                >\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"css/sa.webp\" alt=\"States\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("          <div class=\"v-card\">\n");
      out.write("            <div class=\"card_content\">\n");
      out.write("              <h2>Human Trafficking</h2>\n");
      out.write("              <p>\n");
      out.write("                Human trafficking in Kerala involves the illegal trade of humans for various exploitative purposes, including forced labor, sexual exploitation, and organ harvesting. Vulnerable populations, such as women and children from impoverished backgrounds, are often targeted and subjected to physical and psychological coercion. Law enforcement agencies and NGOs work to combat trafficking networks and support victims.\n");
      out.write("              </p>\n");
      out.write("              <div class=\"status\">\n");
      out.write("                \n");
      out.write("                <a href=\"css/kerelahtmap.jsp\"\n");
      out.write("                  ><button class=\"read-btn\">Open Map</button></a\n");
      out.write("                >\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <img src=\"css/ht.avif\" alt=\"Database\" />\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"card_wrapper\">\n");
      out.write("            <div class=\"v-card\">\n");
      out.write("              <div class=\"card_content\">\n");
      out.write("                <h2>Environmental Crime</h2>\n");
      out.write("                <p>\n");
      out.write("                    Environmental crime in Kerala encompasses various illegal activities that harm the environment, such as air pollution, illegal waste dumping, deforestation, and wildlife trafficking. Perpetrators disregard environmental regulations for profit or convenience, leading to health hazards and ecological degradation. Government agencies and environmental organizations work to enforce laws and promote sustainable practices to mitigate these crimes.\n");
      out.write("                </p>\n");
      out.write("                <div class=\"status\">\n");
      out.write("                 \n");
      out.write("                  <a href=\"kerlaevmap.jsp\"\n");
      out.write("                    ><button class=\"read-btn\">Open Map</button></a\n");
      out.write("                  >\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <img src=\"css/ev.webp\" alt=\"Prevention\" />\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <br>\n");
      out.write("      <div class=\"card_containers\">\n");
      out.write("       <div class=\"card_wrappers last-card-wrappers\">\n");
      out.write("      <div class=\"v-card\">\n");
      out.write("        <div class=\"card_content\">\n");
      out.write("          <h2>White Collar Crime</h2>\n");
      out.write("          <p>\n");
      out.write("            White-collar crime in Kerala encompasses various fraudulent activities committed by individuals or organizations, such as embezzlement, bribery, insider trading, and financial scams. Perpetrators often exploit their positions of trust or authority for personal gain, resulting in significant financial losses and erosion of public confidence. Law enforcement efforts target these sophisticated forms of crime.\n");
      out.write("          </p>\n");
      out.write("          <div class=\"status\">\n");
      out.write("            <a href=\"kerelawcmap.jsp\">\n");
      out.write("              <button class=\"read-btn\">Open Map</button>\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <img src=\"css/WCC.png\" alt=\"Prevention\" />\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    </main>\n");
      out.write("    <hr />\n");
      out.write("    \n");
      out.write("  </body>\n");
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
