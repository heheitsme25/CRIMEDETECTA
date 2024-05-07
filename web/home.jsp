<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CrimeDetecta</title>
    <link rel="stylesheet" href="css/ash.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<style>
        .navbar-dark .navbar-nav .nav-link {
            color: #ffffff; /* White text color for links */
        }
        .navbar-dark .navbar-nav .nav-link:hover {
            color: #ffffff; /* White text color for links on hover */
        }
        .navbar-dark .navbar-nav .nav-item.active .nav-link {
            color: #ffffff; /* White text color for active link */
        }
        .navbar-dark .navbar-nav .nav-item.active .nav-link:hover {
            color: #ffffff; /* White text color for active link on hover */
        }
        .bg-darkblue {
            background-color: #00008B; /* Dark blue background color */
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-darkblue">
        <img
              class="logo-icon"
              src="logo.jpg"
              width="100"
              
              height="60"
              alt="logo"
            />
        <div class="navbar-right ms-auto">
            <div class="navbar-collapse navbar-nav">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link" href="#">Home</a></li>
                    <li class="nav-item"><a class="nav-link" href="vision.jsp">Vision</a></li>
                    <li class="nav-item"><a class="nav-link" href="crimepage.jsp">Crimes</a></li>
                    <li class="nav-item"><a class="nav-link" href="aboutus.jsp">About Us</a></li>
                    <li class="nav-item"><a class="nav-link" href="feedback.jsp">Feedback</a></li>
                    <li class="nav-item"><a class="nav-link" href="FAQ.jsp">FAQs</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div id="myCarousel" class="carousel slide mb-6" data-bs-ride="carousel">
        <div class="carousel-indicators">
          <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="0" class="" aria-label="Slide 1"></button>
          <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="1" aria-label="Slide 2" class="active" aria-current="true"></button>
          <button type="button" data-bs-target="#myCarousel" data-bs-slide-to="2" aria-label="Slide 3" class=""></button>
        </div>
        <div class="carousel-inner">
          <div class="carousel-item active ">
            <img src="https://img.freepik.com/premium-photo/abstract-background-from-pieces-aged-paper-with-word-crime-related-words_464863-334.jpg" height="550px" width="258px" class="d-block w-100" alt="Slide 1">
            <div class="container">
              <div class="carousel-caption text-start">
                <h1>"Analyzing crime today to create safer communities tomorrow!"</h1>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img src="https://img.freepik.com/free-photo/html-css-collage-concept-with-hacker_23-2150061984.jpg" height="550px" width="258px" class="d-block w-100" alt="Slide 2">
            <div class="container">
              <div class="carousel-caption">
                <h1>"A criminal always returns to the scene of the crime."</h1>
              </div>
            </div>
          </div>
          <div class="carousel-item">
            <img src="https://st3.depositphotos.com/1010613/18294/i/450/depositphotos_182948156-stock-photo-gavel-handcuffs-law-book-wooden.jpg" height="550px" width="258px" class="d-block w-100" alt="Slide 3">
            <div class="container">
              <div class="carousel-caption text-end">
                <h1>"Injustice anywhere is a threat to justice everywhere".</h1>
              </div>
            </div>
          </div>
        </div>
        <button class="carousel-control-prev" type="button" data-bs-target="#myCarousel" data-bs-slide="prev">
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#myCarousel" data-bs-slide="next">
          <span class="carousel-control-next-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Next</span>
        </button>
      </div>
    
    <div class="gradient-background">
      <div class="row featurette">
        <div class="col-md-7">
        <a href="whitecollarmain.jsp" class="heading-link">
          <h2 class="featurette-heading fw-normal lh-1">White Collar <span class="text-body-secondary"></span></h2>
        </a>
          <p class="lead">Discover the hidden dimensions of white-collar crime on our website. Unveiling the non-violent yet financially devastating realm, we shed light on deceptive practices, corporate fraud, and financial misconduct. Delve into the intricacies of how professionals misuse their positions for personal gain, explore real-world case studies, and stay informed on the evolving landscape of regulations. Knowledge is your strongest defense – arm yourself with insights into the world of white-collar crime.Unlock the secrets behind white-collar crime with us. Learn how individuals and organizations manipulate the financial system, deceive investors, and engage in cunning schemes. Navigate the complexities of embezzlement, insider trading, and corporate scandals through our insightful content. </p>
        </div>
        <div class="col-md-5">
          <div style="margin: 10px;">
            <a href="whitecollarmain.jsp">
          <img src="https://www.dughihewit.com/wp-content/uploads/2020/01/consequences-of-white-collar-crime.png" alt="White Collar" class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto " >
            </a>
        </div>
      </div>
    </div>

      <br>

      <div class="row featurette">
        <div class="col-md-7 order-md-2">
            <a href="cybermain.jsp" class="heading-link">
          <h2 class="featurette-heading fw-normal lh-1">Cyber crime <span class="text-body-secondary"></span></h2>
            </a>
          <p class="lead">Dive into the realm of cybercrime on our platform. Explore the digital underworld where hackers, fraudsters, and cybercriminals operate. Understand the sophisticated techniques employed in online scams, data breaches, and identity theft. Arm yourself with knowledge about the evolving landscape of cybersecurity threats and safeguard your digital presence. Stay informed, stay secure, as we unravel the intricacies of cybercrime and empower you to navigate the digital world with confidence.Unveil the mysteries of cybercrime on our platform. From phishing to cyber espionage, we demystify the tactics used by digital malefactors. "</p>
        </div>
        <div class="col-md-5 order-md-1">
          <div style="margin: 10px;">
            <a href="cybermain.jsp">
          <img src="https://www.livemint.com/lm-img/img/2023/07/10/1600x900/3-0-58230984-2BJP1XN-0_1679807674932_1689004151190.jpg" alt="Cyber crime " class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto">
            </a>
          </div>
        </div>
      </div>

       <br>

      <div class="row featurette">
        <div class="col-md-7">
            <a href="sexualmain.jsp" class="heading-link">
            
          <h2 class="featurette-heading fw-normal lh-1">Sexual Assault <span class="text-body-secondary"></span></h2>
            </a>
          <p class="lead">Addressing the sensitive topic of sexual assault, our platform provides a safe space for understanding, support, and awareness. Explore the complexities surrounding sexual assault, from its various forms to the lasting impact on survivors. Through empathetic discussions and informative resources, we strive to foster education, break the silence, and contribute to a culture that advocates for consent, respect, and survivor empowerment. Join us in raising awareness and creating a community dedicated to combating sexual assault and promoting a safer, more compassionate world.Empowering through awareness, we confront the issue of sexual assault on our platform. </p>
        </div>
        <div class="col-md-5">
          <div style="margin: 10px;">
            <a href="Sexualmain.jsp">
          <img src="https://phelanpetty.com/wp-content/uploads/2020/10/Sexual-assault.jpg" alt="Sexual Assault" class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto">
            </a>
        </div>
        </div>
      </div>

      <br>

      <div class="row featurette">
        <div class="col-md-7 order-md-2">
            <a href="humanmain.jsp" class="heading-link">
          <h2 class="featurette-heading fw-normal lh-1">Human Trafficking <span class="text-body-secondary"></span></h2>
            </a>
          <p class="lead">Dive into the critical issue of human trafficking on our platform. Unveil the harsh realities of this global epidemic, exploring its various forms, root causes, and the profound impact on victims. Through informative content and resources, we strive to raise awareness, inspire action, and contribute to the collective effort against modern-day slavery. Join us in fostering education, empathy, and advocacy to combat human trafficking and support survivors on their path to recovery.Through insightful narratives and educational resources, we aim to empower individuals to recognize, report, and combat human trafficking. Together, let's build a world where exploitation has no place, and every person can live free from the chains of trafficking.</p>
        </div>
        <div class="col-md-5 order-md-1">
          <div style="margin: 10px;">
            <a href="humanmain.jsp">
          <img src="https://blog.ipleaders.in/wp-content/uploads/2020/07/unnamed-3.jpg" alt="Human Traffickings" class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto">
            </a>
        </div>
        </div>
      </div>

       <br>

<div class="row featurette">
  <div class="col-md-7">
    <a href="environmentalmain.jsp" class="heading-link">
    <h2 class="featurette-heading fw-normal lh-1">Environment Crime <span class="text-body-secondary"></span></h2>
    </a>
    <p class="lead">Navigate the world of environmental crime with us as we uncover the threats to our planet. From illegal wildlife trade to hazardous waste dumping, explore the various forms of environmental exploitation and their consequences. Our platform is dedicated to shedding light on these crimes, promoting awareness, and advocating for sustainable practices. Join us in the mission to protect our environment, preserve biodiversity, and create a more sustainable future.At the forefront of the battle against environmental crime, our platform delves into the illicit activities harming our planet. Discover the hidden world of poaching, deforestation, and pollution, and understand their far-reaching impacts.</p>
  </div>
  <div class="col-md-5">
    <div style="margin: 10px;">
        <a href="environmentalmain.jsp">
    <img src="https://i0.wp.com/www.actwithus.org/wp-content/uploads/2021/06/whale-1.jpg?resize=825%2C510&ssl=1" alt="Environment Crime Image" height="900px"class="bd-placeholder-img bd-placeholder-img-lg featurette-image img-fluid mx-auto">
        </a>
    </div>
  </div>
  </div>
</div>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>

</body>
</html>
