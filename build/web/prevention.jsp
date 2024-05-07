<%-- 
    Document   : prevention
    Created on : 5 Mar, 2024, 4:33:52 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
           <title>Prevention</title>
            <link rel="stylesheet" href="css/prevent.css" />
        </head>
        <body><div class="gradient-background">
    <nav class="navbar navbar-expand-lg">
        <div class="navbar-left">
            <img
              class="logo-icon"
              src="logo.jpg"
              width="100"
              
              height="60"
              alt="logo"
            />
        </div>
        <div class="navbar-right ms-auto">
            <ul>
                <li><a href="home.jsp">Home</a></li>
                <li><a href="vision.jsp">Vision</a></li>
                <li><a href="crimepage.jsp">Crimes</a></li>
                <li><a href="aboutus.jsp">About Us</a></li>
                <li><a href="feedback.jsp">Feedback</a></li>
                <li><a href="FAQ.jsp">FAQs</a></li>
            </ul>
        </div>
    </nav>
    <div class="image-container">
        <img src="css/police.jpg" alt="Police Image" class="big-police-image">
        <div class="text-overlay">
            <h1>Welcome to CrimeDetecta</h1>
            <p>Helping to create safer communities</p>
        </div>
    </div>
    <br>
      <div class="card_container">
        <div class="card_wrapper">
          <div class="v-card">
            <img src="css/safe.jpg" alt="safety"  width="320" height="200">
            <div class="card_content">
              <h2>Safety</h2>
              <p>
                Stay safe and secure with our comprehensive safety tips and resources. Learn how to protect yourself and your loved ones from potential dangers and emergencies.
              </p>
              <div class="status">
                <a href="#"><button class="read-btn">Read More</button></a>
              </div>
            </div>
          </div>
        </div>


        <div class="card_wrapper">
          <div class="v-card">
            <img src="css/reachout.jpg" alt="reach"  width="320" height="200">
            <div class="card_content">
              <h2>Reach Out</h2>
              <p>
                Need assistance or have a question? Don't hesitate to reach out to us! Our dedicated team is here to support you and provide the help you need.
              </p>
              <div class="status">
                <a href="post.html"><button class="read-btn">Read More</button></a>
              </div>
            </div>
          </div>
        </div>


        <div class="card_wrapper">
            <div class="v-card">
                <img src="css/ngo.jpg" alt="ngos"  width="320" height="200">
              <div class="card_content">
                <h2>NGO</h2>
                <p>
                    Discover how our NGO is making a difference in the community. We're dedicated to serving those in need, advocating for change, and fostering a brighter future for all.
                </p>
                <div class="status">
                 
                  <a href="ngo.jsp"><button class="read-btn">Read More</button></a>
                </div>
              </div>
            </div>
          </div>
       </div>

       <br>

         
       <div class="officer-container">
        <div class="officer-message">
            <div class="officer-image">
                <img src="css/officer.jpg" alt="Officer">
            </div>
            <div class="message">
                <p>"Prevent crime. Stay alert, report, and unite for safety. Together, we can create a secure society."</p>
            </div>
        </div>
    </div>
</div>



      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

        </body>
    </html>
</f:view>