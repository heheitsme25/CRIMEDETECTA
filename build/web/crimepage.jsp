<%-- 
    Document   : crimepage
    Created on : 28 Feb, 2024, 10:52:37 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
        <head>
       <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Crimes</title>
    <link rel="stylesheet" type="text/css" href="css/crimes.css"/>
    <script>
      src="https://kit.fontawesome.com/7a4b62b0a4.js"
      crossorigin="anonymous"
      </script>
  </head>
        <body>
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
                <li><a href="prevention.jsp">Prevention</a></li>
                <li><a href="aboutus.jsp">About Us</a></li>
                <li><a href="FAQ.jsp">FAQs</a></li>
            </ul>
        </div>
    </nav>
    <main>
        <div class="gradient-background">
      <section id="hero">
        <div class="hero_content">
          <h1>"Stop! Drop it!"</h1>
          <h4>You are under arrest.</h4>
        </div>
        <div class="hero_image">
          <img src="https://images.pexels.com/photos/923681/pexels-photo-923681.jpeg?cs=srgb&dl=pexels-kat-wilcox-923681.jpg&fm=jpg" alt="hero" width="650" height="320" />
        </div>
      </section>
<br>
      <div class="card_container">
        <div class="card_wrapper">
          <div class="v-card">
            <div class="card_content">
              <h2>Maps</h2>
              <p>
                Maps serve as invaluable tools in crime detection and various other domains due to their ability to visually represent geographical data. In crime detection, patterns, aiding law enforcement agencies in deploying resources effectively.
              </p>
              <div class="status">
          

                <a href="states.jsp"><button class="read-btn">Read More</button></a>
              </div>
            </div>
            <img src="css/maps.jpg" alt="Maps" />
          </div>
        </div>
        <div class="card_wrapper">
          <div class="v-card">
            <div class="card_content">
              <h2>States</h2>
              <p>
                State boundaries serve as critical reference points for crime analysis and law enforcement, enabling jurisdictional delineation, resource allocation, and strategic planning to address regional crime dynamics effectively.
              </p>
              <div class="status">
                <a href="states.jsp"><button class="read-btn">Read More</button></a>
              </div>
            </div>
            <img src="css/states.jpg" alt="States" />
          </div>
        </div>
        <div class="card_wrapper">
          <div class="v-card">
            <div class="card_content">
              <h2>Database</h2>
              <p>
                Crime databases serve as comprehensive repositories, centralizing crucial information for law enforcement agencies to track criminal activities, analyze patterns, and facilitate investigations, ultimately enhancing public safety and justice.
              </p>
              <div class="status">
               
                <a href="states1.jsp"><button class="read-btn">Read More</button></a>
              </div>
            </div>
            <img src="css/database'.jpg" alt="Database" />
          </div>
        </div>

        <div class="card_wrapper">
            <div class="v-card">
              <div class="card_content">
                <h2>Preventions</h2>
                <p>
                    Prevention is paramount in combating crime, fostering safer communities through proactive measures such as community engagement, education, and targeted interventions aimed at addressing root causes and reducing criminal opportunities.
                </p>
                <div class="status">
                 
                  <a href="prevention.jsp"><button class="read-btn">Read More</button></a>
                </div>
              </div>
              <img src="css/prevention.jpg" alt="Prevention" />
            </div>
          </div>
      </div>
    </div>
    </main>
    <hr />
        </body>
    </html>
</f:view>


