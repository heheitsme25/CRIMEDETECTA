package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <title>Feedback CRIMEDETECTA</title>\n");
      out.write("    <script>\n");
      out.write("        document.addEventListener('DOMContentLoaded', function () {\n");
      out.write("            var textarea = document.getElementById('comment');\n");
      out.write("            var wordCount = document.getElementById('wordCount');\n");
      out.write("            var maxWords = 100;\n");
      out.write("\n");
      out.write("            textarea.addEventListener('input', function () {\n");
      out.write("                var words = textarea.value.trim().split(/\\s+/);\n");
      out.write("                wordCount.textContent = words.length;\n");
      out.write("\n");
      out.write("                if (words.length > maxWords) {\n");
      out.write("                    textarea.value = words.slice(0, maxWords).join(' ');\n");
      out.write("                    wordCount.textContent = maxWords;\n");
      out.write("                    textarea.disabled = true;\n");
      out.write("                    textarea.style.backgroundColor = 'lightgrey'; // Optionally, you can change the background color to indicate disabled state\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");

    try {
        if (request.getParameter("btnSubmit") != null) {
            String username = request.getParameter("field-text");
            String feedback = request.getParameter("comment");

            // Establish the database connection
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");

            // Prepare the SQL statement with parameterized query to prevent SQL injection
            String query = "INSERT INTO feedback (Username, Feedback) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, username);
            pstmt.setString(2, feedback);

            // Execute the query
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                out.print("<script>alert('Record Inserted Successfully')</script>");
            } else {
                out.print("<script>alert('Error in Inserting Record')</script>");
            }

            // Close resources
            pstmt.close();
            conn.close();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\n");
      out.write("    <link\n");
      out.write("      href=\"https://fonts.googleapis.com/css2?family=Noto+Sans:wght@400;700&display=swap\"\n");
      out.write("      rel=\"stylesheet\"\n");
      out.write("    />\n");
      out.write("    <link href=\"css/contact1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <body class=\"body nonav\">\n");
      out.write("    <header id=\"header\" class=\"header\">\n");
      out.write("      <nav class=\"navbar\">\n");
      out.write("        <div id=\"navbar-1\">\n");
      out.write("          <a href=\"/\">\n");
      out.write("            <img\n");
      out.write("              class=\"logo-icon\"\n");
      out.write("              src=\"logo.jpg\"\n");
      out.write("              width=\"100\"\n");
      out.write("              \n");
      out.write("              height=\"60\"\n");
      out.write("              alt=\"logo\"\n");
      out.write("            />\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <ul id=\"navbar-2\" class=\"menu\">\n");
      out.write("           <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"vision.jsp\">Vision</a></li>\n");
      out.write("                <li><a href=\"crimepage.jsp\">Crimes</a></li>\n");
      out.write("                <li><a href=\"aboutus.jsp\">About Us</a></li>\n");
      out.write("                <li><a href=\"feedback.jsp\">Feedback</a></li>\n");
      out.write("                <li><a href=\"FAQ.jsp\">FAQs</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    <main class=\"main nonav\">\n");
      out.write("      <section class=\"section nonav\">\n");
      out.write("        <div class=\"right side\">\n");
      out.write("          <form class=\"form\">\n");
      out.write("            <h1>Thank you for your interest in CRIMEDETECTA</h1>\n");
      out.write("            <p>You can contact us or submit your feedback here.<p>\n");
      out.write("    <fieldset class=\"fieldset form text item\">\n");
      out.write("        <legend>Username</legend>\n");
      out.write("        <div class=\"input text\">\n");
      out.write("            <input type=\"text\" name=\"field-text\" placeholder=\"Username\"/>\n");
      out.write("        </div>\n");
      out.write("        <label for=\"email\" class=\"form text caption\"></label>\n");
      out.write("    </fieldset>\n");
      out.write("    <fieldset class=\"fieldset form text item\">\n");
      out.write("        <div class=\"textarea-container\">\n");
      out.write("            <textarea id=\"comment\" rows=\"10\" cols=\"150\" class=\"textarea comment\" name=\"comment\" placeholder=\"Comment\" rows=\"5\" cols=\"33\"></textarea>\n");
      out.write("            <div id=\"wordCount\">0</div>\n");
      out.write("        </div>\n");
      out.write("        <legend>Comment</legend>\n");
      out.write("    </fieldset>\n");
      out.write("    <div class=\"tncbox\">\n");
      out.write("        <input type=\"checkbox\" id=\"checkbox-tnc\"/>\n");
      out.write("        <label for=\"checkbox-tnc\">I hereby consent to disclose my personal identification information and its affiliates to identify my queries and the media to respond to my queries</label>\n");
      out.write("    </div>\n");
      out.write("    <button type=\"submit\" name=\"btnSubmit\">Submit</button>\n");
      out.write("</form>\n");
      out.write("            <\n");
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
