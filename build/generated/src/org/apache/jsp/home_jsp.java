package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>CrimeDetecta</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ash.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("<style>\n");
      out.write("        .navbar-dark .navbar-nav .nav-link {\n");
      out.write("            color: #ffffff; /* White text color for links */\n");
      out.write("        }\n");
      out.write("        .navbar-dark .navbar-nav .nav-link:hover {\n");
      out.write("            color: #ffffff; /* White text color for links on hover */\n");
      out.write("        }\n");
      out.write("        .navbar-dark .navbar-nav .nav-item.active .nav-link {\n");
      out.write("            color: #ffffff; /* White text color for active link */\n");
      out.write("        }\n");
      out.write("        .navbar-dark .navbar-nav .nav-item.active .nav-link:hover {\n");
      out.write("            color: #ffffff; /* White text color for active link on hover */\n");
      out.write("        }\n");
      out.write("        .bg-darkblue {\n");
      out.write("            background-color: #00008B; /* Dark blue background color */\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <nav class=\"navbar navbar-expand-lg navbar-dark bg-darkblue\">\n");
      out.write("        <img\n");
      out.write("              class=\"logo-icon\"\n");
      out.write("              src=\"logo.jpg\"\n");
      out.write("              width=\"100\"\n");
      out.write("              \n");
      out.write("              height=\"60\"\n");
      out.write("              alt=\"logo\"\n");
      out.write("            />\n");
      out.write("        <div class=\"navbar-right ms-auto\">\n");
      out.write("            <div class=\"navbar-collapse navbar-nav\">\n");
      out.write("                <ul class=\"navbar-nav\">\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Home</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide mb-6\" data-bs-ride=\"carousel\">\n");
      out.write("        <div class=\"carousel-indicators\">\n");
      out.write("          <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"0\" class=\"\" aria-label=\"Slide 1\"></button>\n");
      out.write("          <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\" class=\"active\" aria-current=\"true\"></button>\n");
      out.write("          <button type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\" class=\"\"></button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"carousel-inner\">\n");
      out.write("          <div class=\"carousel-item active \">\n");
      out.write("            <img src=\"https://img.freepik.com/premium-photo/abstract-background-from-pieces-aged-paper-with-word-crime-related-words_464863-334.jpg\" height=\"550px\" width=\"258px\" class=\"d-block w-100\" alt=\"Slide 1\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"carousel-caption text-start\">\n");
      out.write("                <h1>\"Analyzing crime today to create safer communities tomorrow!\"</h1>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"https://img.freepik.com/free-photo/html-css-collage-concept-with-hacker_23-2150061984.jpg\" height=\"550px\" width=\"258px\" class=\"d-block w-100\" alt=\"Slide 2\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"carousel-caption\">\n");
      out.write("                <h1>\"A criminal always returns to the scene of the crime.\"</h1>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"carousel-item\">\n");
      out.write("            <img src=\"https://st3.depositphotos.com/1010613/18294/i/450/depositphotos_182948156-stock-photo-gavel-handcuffs-law-book-wooden.jpg\" height=\"550px\" width=\"258px\" class=\"d-block w-100\" alt=\"Slide 3\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("              <div class=\"carousel-caption text-end\">\n");
      out.write("                <h1>\"Injustice anywhere is a threat to justice everywhere\".</h1>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"visually-hidden\">Previous</span>\n");
      out.write("        </button>\n");
      out.write("        <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#myCarousel\" data-bs-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"visually-hidden\">Next</span>\n");
      out.write("        </button>\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("    <div class=\"gradient-background\">\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-7\">\n");
      out.write("        <a href=\"whitecollarmain.jsp\" class=\"heading-link\">\n");
      out.write("          <h2 class=\"featurette-heading fw-normal lh-1\">White Collar <span class=\"text-body-secondary\"></span></h2>\n");
      out.write("        </a>\n");
      out.write("          <p class=\"lead\">Discover the hidden dimensions of white-collar crime on our website. Unveiling the non-violent yet financially devastating realm, we shed light on deceptive practices, corporate fraud, and financial misconduct. Delve into the intricacies of how professionals misuse their positions for personal gain, explore real-world case studies, and stay informed on the evolving landscape of regulations. Knowledge is your strongest defense – arm yourself with insights into the world of white-collar crime.Unlock the secrets behind white-collar crime with us. Learn how individuals and organizations manipulate the financial system, deceive investors, and engage in cunning schemes. Navigate the complexities of embezzlement, insider trading, and corporate scandals through our insightful content. </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("          <div style=\"margin: 10px;\">\n");
      out.write("            <a href=\"whitecollarmain.jsp\">\n");
      out.write("          <img src=\"https://www.dughihewit.com/wp-content/uploads/2020/01/consequences-of-white-collar-crime.png\" alt=\"White Collar\" class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto \" >\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-7 order-md-2\">\n");
      out.write("            <a href=\"cybermain.jsp\" class=\"heading-link\">\n");
      out.write("          <h2 class=\"featurette-heading fw-normal lh-1\">Cyber crime <span class=\"text-body-secondary\"></span></h2>\n");
      out.write("            </a>\n");
      out.write("          <p class=\"lead\">Dive into the realm of cybercrime on our platform. Explore the digital underworld where hackers, fraudsters, and cybercriminals operate. Understand the sophisticated techniques employed in online scams, data breaches, and identity theft. Arm yourself with knowledge about the evolving landscape of cybersecurity threats and safeguard your digital presence. Stay informed, stay secure, as we unravel the intricacies of cybercrime and empower you to navigate the digital world with confidence.Unveil the mysteries of cybercrime on our platform. From phishing to cyber espionage, we demystify the tactics used by digital malefactors. \"</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5 order-md-1\">\n");
      out.write("          <div style=\"margin: 10px;\">\n");
      out.write("            <a href=\"cybermain.jsp\">\n");
      out.write("          <img src=\"https://www.livemint.com/lm-img/img/2023/07/10/1600x900/3-0-58230984-2BJP1XN-0_1679807674932_1689004151190.jpg\" alt=\"Cyber crime \" class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\">\n");
      out.write("            </a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       <br>\n");
      out.write("\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-7\">\n");
      out.write("            <a href=\"sexualmain.jsp\" class=\"heading-link\">\n");
      out.write("            \n");
      out.write("          <h2 class=\"featurette-heading fw-normal lh-1\">Sexual Assault <span class=\"text-body-secondary\"></span></h2>\n");
      out.write("            </a>\n");
      out.write("          <p class=\"lead\">Addressing the sensitive topic of sexual assault, our platform provides a safe space for understanding, support, and awareness. Explore the complexities surrounding sexual assault, from its various forms to the lasting impact on survivors. Through empathetic discussions and informative resources, we strive to foster education, break the silence, and contribute to a culture that advocates for consent, respect, and survivor empowerment. Join us in raising awareness and creating a community dedicated to combating sexual assault and promoting a safer, more compassionate world.Empowering through awareness, we confront the issue of sexual assault on our platform. </p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5\">\n");
      out.write("          <div style=\"margin: 10px;\">\n");
      out.write("            <a href=\"Sexualmain.jsp\">\n");
      out.write("          <img src=\"https://phelanpetty.com/wp-content/uploads/2020/10/Sexual-assault.jpg\" alt=\"Sexual Assault\" class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <br>\n");
      out.write("\n");
      out.write("      <div class=\"row featurette\">\n");
      out.write("        <div class=\"col-md-7 order-md-2\">\n");
      out.write("            <a href=\"humanmain.jsp\" class=\"heading-link\">\n");
      out.write("          <h2 class=\"featurette-heading fw-normal lh-1\">Human Trafficking <span class=\"text-body-secondary\"></span></h2>\n");
      out.write("            </a>\n");
      out.write("          <p class=\"lead\">Dive into the critical issue of human trafficking on our platform. Unveil the harsh realities of this global epidemic, exploring its various forms, root causes, and the profound impact on victims. Through informative content and resources, we strive to raise awareness, inspire action, and contribute to the collective effort against modern-day slavery. Join us in fostering education, empathy, and advocacy to combat human trafficking and support survivors on their path to recovery.Through insightful narratives and educational resources, we aim to empower individuals to recognize, report, and combat human trafficking. Together, let's build a world where exploitation has no place, and every person can live free from the chains of trafficking.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-5 order-md-1\">\n");
      out.write("          <div style=\"margin: 10px;\">\n");
      out.write("            <a href=\"humanmain.jsp\">\n");
      out.write("          <img src=\"https://blog.ipleaders.in/wp-content/uploads/2020/07/unnamed-3.jpg\" alt=\"Human Traffickings\" class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\">\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("       <br>\n");
      out.write("\n");
      out.write("<div class=\"row featurette\">\n");
      out.write("  <div class=\"col-md-7\">\n");
      out.write("    <a href=\"environmentalmain.jsp\" class=\"heading-link\">\n");
      out.write("    <h2 class=\"featurette-heading fw-normal lh-1\">Environment Crime <span class=\"text-body-secondary\"></span></h2>\n");
      out.write("    </a>\n");
      out.write("    <p class=\"lead\">Navigate the world of environmental crime with us as we uncover the threats to our planet. From illegal wildlife trade to hazardous waste dumping, explore the various forms of environmental exploitation and their consequences. Our platform is dedicated to shedding light on these crimes, promoting awareness, and advocating for sustainable practices. Join us in the mission to protect our environment, preserve biodiversity, and create a more sustainable future.At the forefront of the battle against environmental crime, our platform delves into the illicit activities harming our planet. Discover the hidden world of poaching, deforestation, and pollution, and understand their far-reaching impacts.</p>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"col-md-5\">\n");
      out.write("    <div style=\"margin: 10px;\">\n");
      out.write("        <a href=\"environmentalmain.jsp\">\n");
      out.write("    <img src=\"https://i0.wp.com/www.actwithus.org/wp-content/uploads/2021/06/whale-1.jpg?resize=825%2C510&ssl=1\" alt=\"Environment Crime Image\" height=\"900px\"class=\"bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto\">\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
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
