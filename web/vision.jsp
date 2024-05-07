<%-- 
    Document   : vision
    Created on : 27 Feb, 2024, 3:35:20 PM
    Author     : dell
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Company Vision</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f5f5f5;
        }

        header {
            background: linear-gradient(to right,#260a6d,#080808);
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        section {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
        .header {
    background-color: #101756;
    display: flex;
    justify-content: center;
  }
 
  .navbar {
    display: flex;
    justify-content: space-between;
    align-items: center;
    width: 100%;
    max-width: 1100px;
  }
 
  a {
    text-decoration: none;
    color: white;
  }
 
  ul {
    list-style: none;
    gap: 50px;
    display: flex;
  }
 
  .about-page-navbar {
    background-color: #32483a;
    display: flex;
    color: #fff;
    font-weight: lighter;
    font-size: 1.2em;
    justify-content: center;
  }
 
  .about-page-navbar-content {
    display: flex;
    justify-content: space-between;
    flex-grow: 1;
    flex-shrink: 1;
    max-width: 1100px;
  }
 
  .about-page-navbar-content ul {
    gap: 5em;
    padding-inline-start: 0;
  }
 
    </style>
    <style>
        body {
            background: url(background_1.jpg);
            background-size: cover;
        }
    </style>
</head>
<body>
    

    <header id="header" class="header">
      <nav class="navbar">
        <div id="navbar-1">
          <a href="/">
            <img
              class="logo-icon"
              src="css/logo.jpg"
              width="100"
              height="60"
              alt="logo"
            />
          </a>
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
        </ul>
      </nav>
    </header>
   
    <section>
        <h2>Our Vision</h2>
        <p>
            <%-- This is where you can add Java code if necessary --%>
            "At CRIMEDETECTA, we envision a global paradigm shift in safety through our innovative crime analysis platform.
            Designed for seamless integration with mapping giants like Google Maps, we commit to scalable, predictive analytics, fostering a safer world through data-driven insights and open collaboration.
            Join us in redefining security globally."
        </p>
    </section>

    <section>
        <h2>Our Values</h2>
        <ul>
            <li>Precision: Accurate crime trend identification for targeted interventions and community safety. </li>
            <li>Innovation: Pioneering technology for advanced, adaptive crime analysis solutions globally.</li>
            <li>Collaboration: Uniting communities, law enforcement, and technology for effective crime prevention.</li>
            <li>Ethical Responsibility: Upholding privacy, fairness, and integrity in all data-driven analyses.</li>
        </ul>
    </section>

    <section>
        <h2>Our Goals</h2>
        <ul>
            <li> Scalability: Develop and enhance the platform for global crime analysis adoption. </li>
            <li> User-Centric Design: Create an intuitive, accessible interface for diverse user engagement </li>
            <li> Predictive Analytics: Employ advanced AI to anticipate and proactively address emerging crime trends.</li>
            <li> Integration: Seamlessly integrate with major mapping services, including Google Maps.</li>
        </ul>
    </section>
</body>
</html>
