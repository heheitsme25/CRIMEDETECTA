package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class safety_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<f:view>\n");
      out.write("    <html>\n");
      out.write("        <head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Safety</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/safe1.css\" />\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Safety</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/safe1.css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
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
      out.write("                <li><a href=\"FAQ.jsp\">FAQ's</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("        <div class=\"image-container\">\n");
      out.write("            <img src=\"css/crimesafety.jpg\" alt=\"safeImage\" class=\"safe-photo-image\" >\n");
      out.write("            <br>\n");
      out.write("        </div>  \n");
      out.write("        <p><h1  class=\"crime-heading\">White Collar Crime</h1></p>\n");
      out.write("        <div class=\"crime-info\">\n");
      out.write("                    <p>Implement robust internal controls and auditing mechanisms within organizations to detect fraudulent activities early.</p>\n");
      out.write("                    <p>Conduct thorough background checks on employees, especially those in positions of financial responsibility.</p>\n");
      out.write("                    <p>Provide regular training to employees on ethics, compliance, and fraud prevention.</p>\n");
      out.write("                    <p>Encourage a culture of transparency and accountability within the organization.</p>\n");
      out.write("                    <p>Cooperate with regulatory authorities and law enforcement agencies to report and prosecute instances of white-collar crime.</p>          \n");
      out.write("        </div>  \n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <p><h1  class=\"crime-heading\">Cyber Crime</h1></p>\n");
      out.write("        <div class=\"crime-info\">\n");
      out.write("                <p>Keep software and systems updated with the latest security patches.</p>\n");
      out.write("                <p>Educate employees about phishing scams, malware, and other common cyber threats.</p>\n");
      out.write("                <p>Use strong, unique passwords and consider implementing multi-factor authentication.</p>\n");
      out.write("                <p>Encrypt sensitive data both in transit and at rest.</p>\n");
      out.write("                <p>Regularly backup important data and store it securely.</p>\n");
      out.write("                <p>Employ robust cybersecurity measures such as firewalls, intrusion detection systems, and antivirus software.</p>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p><h1  class=\"crime-heading\">Sexual Assasult</h1></p>\n");
      out.write("        <div class=\"crime-info\">\n");
      out.write("                <p>Promote education and awareness campaigns about consent, boundaries, and healthy relationships.</p>\n");
      out.write("                <p>Provide resources and support for survivors of sexual assault, including counseling and medical assistance.</p>\n");
      out.write("                <p>Encourage bystander intervention and teach individuals how to safely intervene in potentially harmful situations.</p>\n");
      out.write("                <p>Advocate for policies and laws that hold perpetrators accountable and prioritize the rights and well-being of survivors.</p>                    \n");
      out.write("                <p>Foster a culture of respect and equality that rejects all forms of sexual violence and harassment.</p>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p><h1  class=\"crime-heading\">Human Trafficking</h1></p>\n");
      out.write("        <div class=\"crime-info\">\n");
      out.write("                <p>Train law enforcement, health care professionals, and social service providers to recognize the signs of human trafficking.</p>\n");
      out.write("                <p>Strengthen border controls and collaborate with international partners to disrupt trafficking networks.</p>\n");
      out.write("                <p>Provide support services for trafficking survivors, including shelter, legal assistance, and counseling.</p>\n");
      out.write("                <p>Raise public awareness about the realities of human trafficking and the importance of reporting suspicious activity.</p>\n");
      out.write("                <p>Advocate for stronger legislation and policies to prevent human trafficking and prosecute traffickers.</p>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <p><h1  class=\"crime-heading\">Environmental Crime</h1></p>\n");
      out.write("        <div class=\"crime-info\">\n");
      out.write("                <p>Enforce environmental regulations and hold polluters accountable for their actions.</p>\n");
      out.write("                <p>Invest in technologies and practices that reduce pollution and mitigate environmental damage.</p>\n");
      out.write("                <p>Increase public awareness about the importance of environmental protection and conservation.</p>\n");
      out.write("                <p>Strengthen international cooperation to combat transnational environmental crimes such as illegal logging and wildlife trafficking.</p>\n");
      out.write("                <p>Support community-based initiatives that promote sustainable development and responsible stewardship of natural resources.</p>\n");
      out.write("                <p>Advocate for stronger legislation and policies to prevent human trafficking and prosecute traffickers.</p>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <hr>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
