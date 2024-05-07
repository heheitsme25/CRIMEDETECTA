<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Feedback CRIMEDETECTA</title>
    <script>
        document.addEventListener('DOMContentLoaded', function () {
            var textarea = document.getElementById('comment');
            var wordCount = document.getElementById('wordCount');
            var maxWords = 100;

            textarea.addEventListener('input', function () {
                var words = textarea.value.trim().split(/\s+/);
                wordCount.textContent = words.length;

                if (words.length > maxWords) {
                    textarea.value = words.slice(0, maxWords).join(' ');
                    wordCount.textContent = maxWords;
                    textarea.disabled = true;
                    textarea.style.backgroundColor = 'lightgrey'; // Optionally, you can change the background color to indicate disabled state
                }
            });
        });
    </script>
</head>
<body>

<%
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
%>

<form method="post">
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Noto+Sans:wght@400;700&display=swap"
      rel="stylesheet"
    />
    <link href="css/contact1.css" rel="stylesheet" type="text/css"/>
    
  </head>
  <body class="body nonav">
    <header id="header" class="header">
      <nav class="navbar">
        <div id="navbar-1">
          <a href="/">
            <img
              class="logo-icon"
              src="logo.jpg"
              width="100"
              
              height="60"
              alt="logo"
            />
          </a>
        </div>
        <ul id="navbar-2" class="menu">
           <li><a href="home.jsp">Home</a></li>
                <li><a href="vision.jsp">Vision</a></li>
                <li><a href="crimepage.jsp">Crimes</a></li>
                <li><a href="aboutus.jsp">About Us</a></li>
                <li><a href="feedback.jsp">Feedback</a></li>
                <li><a href="FAQ.jsp">FAQs</a></li>
        </ul>
      </nav>
    </header>

    <main class="main nonav">
      <section class="section nonav">
        <div class="right side">
          <form class="form">
            <h1>Thank you for your interest in CRIMEDETECTA</h1>
            <p>You can contact us or submit your feedback here.<p>
    <fieldset class="fieldset form text item">
        <legend>Username</legend>
        <div class="input text">
            <input type="text" name="field-text" placeholder="Username"/>
        </div>
        <label for="email" class="form text caption"></label>
    </fieldset>
    <fieldset class="fieldset form text item">
        <div class="textarea-container">
            <textarea id="comment" rows="10" cols="150" class="textarea comment" name="comment" placeholder="Comment" rows="5" cols="33"></textarea>
            <div id="wordCount">0</div>
        </div>
        <legend>Comment</legend>
    </fieldset>
    <div class="tncbox">
        <input type="checkbox" id="checkbox-tnc"/>
        <label for="checkbox-tnc">I hereby consent to disclose my personal identification information and its affiliates to identify my queries and the media to respond to my queries</label>
    </div>
    <button type="submit" name="btnSubmit">Submit</button>
</form>
            <

</body>
</html>
