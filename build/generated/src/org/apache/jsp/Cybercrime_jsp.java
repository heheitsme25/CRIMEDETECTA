package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Cybercrime_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Crime Page | CyberCrime Website</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/CyberCrime.css\" />\n");
      out.write("    <script>\n");
      out.write("      src=\"https://kit.fontawesome.com/7a4b62b0a4.js\"\n");
      out.write("      crossorigin=\"anonymous\"\n");
      out.write("    </script>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-darkblue\">\n");
      out.write("      <img\n");
      out.write("            class=\"logo-icon\"\n");
      out.write("            src=\"logo.jpg\"\n");
      out.write("            width=\"100\"\n");
      out.write("           \n");
      out.write("            height=\"60\"\n");
      out.write("            alt=\"logo\"\n");
      out.write("          />\n");
      out.write("      <div class=\"navbar-right ms-auto\">\n");
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
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <nav>\n");
      out.write("        <h1>Cyber Crime</h1>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <main class=\"post\">\n");
      out.write("      <section>\n");
      out.write("        <div class=\"banner_image\">\n");
      out.write("          <img src=\"cybercrime.jpg\" alt=\"banner\" />\n");
      out.write("        </div>\n");
      out.write("        <h1>\"Nature's guardians, we must be, lest our crimes betray our legacy.\"</h1>\n");
      out.write("    </section>\n");
      out.write("      <hr />\n");
      out.write("      <article>\n");
      out.write("        <h2>Introduction</h2>\n");
      out.write("        <p>\n");
      out.write("          In today's interconnected world, where digital technologies permeate every aspect of our lives, the rise of cybercrime has become an undeniable reality. From data breaches to identity theft, cybercriminals exploit vulnerabilities in cyberspace, posing significant threats to individuals, businesses, and even nations. In this blog post, we'll delve into the multifaceted realm of cybercrime, exploring its various forms, impacts, and the crucial steps we can take to safeguard ourselves against this pervasive threat.\n");
      out.write("        </p>\n");
      out.write("        <h2>Understanding Environmental Crime</h2>\n");
      out.write("        <p>\n");
      out.write("          Cybercrime encompasses a broad spectrum of illicit activities conducted through digital means. These crimes exploit technology to target individuals, organizations, and governments for financial gain, espionage, or disruption. Some common forms of cybercrime include:\n");
      out.write("            <ul>\n");
      out.write("                <li><b>Malware Attacks:</b> Malicious software, or malware, is designed to infiltrate computer systems, steal sensitive information, or disrupt operations. Examples include viruses, ransomware, and spyware.</li>\n");
      out.write("                <li><b>Phishing Scams:</b> Phishing involves fraudulent attempts to trick individuals into revealing personal information, such as passwords or financial details, by masquerading as a trustworthy entity via email, text message, or social media.</li>\n");
      out.write("                <li><b>Identity Theft:</b> Cybercriminals steal personal information, such as Social Security numbers or credit card details, to impersonate individuals, commit fraud, or access financial accounts.</li>\n");
      out.write("                <li><b>Cyberbullying and Harassment:</b> Online harassment, cyberstalking, and cyberbullying involve the use of digital platforms to intimidate, harass, or threaten individuals, often causing psychological harm and emotional distress.</li>\n");
      out.write("            </ul>\n");
      out.write("            \n");
      out.write("        </p>\n");
      out.write("        <h2>Impacts of Cybercrime:</h2>\n");
      out.write("        <p>\n");
      out.write("          The consequences of cybercrime extend far beyond financial losses and reputational damage. They can disrupt critical infrastructure, compromise national security, and violate individual privacy rights. Some key impacts include:\n");
      out.write("          <ul>\n");
      out.write("            <li><b>Financial Losses: </b> Businesses incur substantial financial losses due to data breaches, ransomware attacks, and fraudulent transactions, impacting their bottom line and shareholder confidence.</li>\n");
      out.write("            <li><b>Reputational Damage:</b> Organizations and individuals suffer reputational damage when their data is compromised, leading to loss of trust, customer defection, and diminished brand value.</li>\n");
      out.write("            <li><b>Legal and Regulatory Ramifications:</b> Data breaches and privacy violations can result in costly lawsuits, regulatory fines, and compliance failures, exposing organizations to legal liabilities and regulatory scrutiny.</li>\n");
      out.write("            <li><b>Psychological and Emotional Toll:</b> Cyberbullying, harassment, and online abuse have profound psychological and emotional effects on victims, causing anxiety, depression, and trauma.</li>\n");
      out.write("        </ul>\n");
      out.write("        </p>\n");
      out.write("        <h2>Combatting Cybercrime:</h2>\n");
      out.write("        <p>\n");
      out.write("          Addressing the complex challenges posed by cybercrime requires a multifaceted approach involving collaboration between governments, law enforcement agencies, businesses, and individuals. Key strategies include:\n");
      out.write("          <ul>\n");
      out.write("            <li><b>Enhancing Cybersecurity Measures:</b> Organizations must implement robust cybersecurity measures, such as encryption, multi-factor authentication, and intrusion detection systems, to safeguard against cyber threats.</li>\n");
      out.write("            <li><b>Raising Awareness and Education:</b>Educating individuals and businesses about cybersecurity best practices, recognizing phishing scams, and protecting personal information is essential to prevent falling victim to cybercrime.</li>\n");
      out.write("            <li><b>Strengthening Legislation and Enforcement:</b> Governments should enact stringent laws and regulations to deter cybercriminal activities, prosecute offenders, and promote international cooperation in combating cyber threats.</li>\n");
      out.write("            <li><b>Investing in Technology and Innovation:</b> Continued investment in cybersecurity technology, research, and innovation is crucial to stay ahead of evolving cyber threats and vulnerabilities.</li>\n");
      out.write("        </ul>\n");
      out.write("        </p>\n");
      out.write("      </article>\n");
      out.write("    </main>\n");
      out.write("    <hr />\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <p class=\"copyright\">Copyright by CRIMEDETECTA</p>\n");
      out.write("       \n");
      out.write("      </footer>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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
