<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FAQs Page</title>
    <link rel="stylesheet" href="css/styles.css">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;900&family=Open+Sans:wght@300;400;500;600;700&family=Ubuntu:wght@300;400;500;700&display=swap" rel="stylesheet">
</head>
<body>
    <%-- Navigation Bar --%>
    <nav class="nav-bar">
        <div class="navbar-left">
            <a href="/">
                <img class="logo-icon" src="logo.jpg" width="100" height="60" alt="logo" />
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
    </nav>

    <%-- Header Section --%>
    <header class="index-header">
        <section class="questions">
            <div class="question-form">
                <h1 class="disabled-heading" style="background-color:powderblue;">You have questions, right?</h1>
                <h1 class="disabled-heading" style="background-color:rgb(54, 86, 90);">We are here to help!</h1>
            </div>
        </section>
    </header>

    <%-- Main Section --%>
    <main>
        <%-- Frequent Questions Section --%>
        <section class="frequent-question">
            <h1>These are top topics recommended for you!</h1>
            <div class="answer-question">
                <%-- First FAQ --%>
                <div class="metadata">
                    <span><img class="open active" src="css/up-circle-1.png" alt=""></span>
                    <span><img class="close" src="css/down-circle.png"></span>
                    <h2 class="meta-question">What is crime analysis?</h2>
                </div>
                <div class="content">
                    <p>Crime analysis is the systematic examination of crime and disorder data to identify patterns, trends, and relationships that can help law enforcement agencies and communities understand crime issues better. By analyzing various data sources, such as crime reports, arrests, and calls for service, crime analysts provide valuable insights to support informed decision-making and proactive crime prevention strategies.</p>
                </div>
                <%-- Second FAQ --%>
                <div class="metadata">
                    <span><img class="open active" src="css/up-circle-1.png" alt=""></span>
                    <span><img class="close" src="css/down-circle.png"></span>
                    <h2 class="meta-question">How can I access crime data for my community?</h2>
                </div>
                <div class="content">
                    <p>Many law enforcement agencies provide access to crime data through their websites, online crime mapping tools, or public records requests. Community members can also attend local meetings or forums where crime data and trends are discussed, or they can contact their local police department or sheriff's office for assistance in obtaining specific crime information.</p>
                </div>
                <%-- Third FAQ --%>
                <div class="metadata">
                    <span><img class="open active" src="css/up-circle-1.png" alt=""></span>
                    <span><img class="close" src="css/down-circle.png"></span>
                    <h2 class="meta-question">What privacy measures are in place when handling crime data?</h2>
                </div>
                <div class="content"> 
                    <p>Law enforcement agencies adhere to strict privacy protocols and legal requirements when handling crime data to protect individuals' sensitive information. Access to crime data is typically restricted to authorized personnel, and data sharing practices comply with applicable laws and regulations, such as the Health Insurance Portability and Accountability Act (HIPAA) and the Freedom of Information Act (FOIA).</p>
                </div>
                <%-- Fourth FAQ --%>
                <div class="metadata">
                    <span><img class="open active" src="css/up-circle-1.png" alt=""></span>
                    <span><img class="close" src="css/down-circle.png"></span>
                    <h2 class="meta-question">How does crime analysis help law enforcement?</h2>
                </div>
                <div class="content">
                    <p>Crime analysis assists law enforcement agencies in several ways. By identifying crime patterns and hotspots, agencies can allocate resources more effectively, target crime prevention efforts in high-risk areas, and track the effectiveness of their interventions over time. Additionally, crime analysis supports investigative efforts by providing timely information and intelligence to detectives, helping them identify suspects and link related crimes.</p>
                </div>
                <%-- Fifth FAQ --%>
                <div class="metadata">
                    <span><img class="open active" src="css/up-circle-1.png" alt=""></span>
                    <span><img class="close" src="css/down-circle.png"></span>
                    <h2 class="meta-question">How can I report suspicious activity or crime tips?</h2>
                </div>
                <div class="content">
                    <p>Reporting suspicious activity or providing crime tips is crucial for maintaining community safety. Individuals can report suspicious activity to their local law enforcement agency by calling the non-emergency number or using online reporting forms if available. Many agencies also offer anonymous reporting options through hotlines or tip lines staffed by trained personnel who can receive and investigate tips confidentially. Remember, if you believe a crime is in progress or someone is in immediate danger, always call 100.</p> 
                </div>
                <%-- Add more FAQs as needed --%>

            </div>
        </section>

        <%-- In Touch Section --%>
        <section class="in-touch">
            <h1 class="touch-heading">Still have questions?</h1>
            <p class="touch-paragraph">Can't Find The Answer You Are Looking For?  Chat Out Friendly Team.</p>
            <a href="aboutus.jsp"><button class="touch-button" type="button">Get in touch with us</button></a>
        </section>
    </main>

    <script src="index.js" charset="utf-8"></script>
    
</body>
</html>
