<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
       <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Crime Registration</title>
    <link rel="stylesheet" href="css/try.css" />


</head>
<body>
    <div class="gradient-background">
        <form action="admincrimeconn.jsp" method="post">
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
    <div class="form-container">
        <h1><bold>Crime Registration for Kerala</bold></h1>
        <form action="admincrimeconn" method="post">
            <div class="form-group">
                <label for="stateName">State Name</label>
                <select id="stateName" name="stateName" required>
                    <option value=""></option>
                    <option value="New Delhi">New Delhi</option>
                    <option value="Kerala">Kerala</option>
                    <option value="Rajasthan">Rajasthan</option>
                    <option value="Uttar Pradesh">Uttar Pradesh</option>
                </select>
            </div>
            <div class="form-group">
                <label for="districtName" class="district-name">District Name</label>
                <input type="text" id="districtName" name="districtName" required>
            </div>
            <div class="form-group">
                <label for="areaName">Area Name</label>
                <input type="text" id="areaName" name="areaName" required>
                <label for="pinCode" class="pin-code">Pin Code</label>
                <input type="text" id="pinCode" name="pinCode" required>
            </div>
            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" id="address" name="address" required>
            </div>
            <div class="form-group">
                <label for="policeStationAddress"> Police Station Address</label>
                <input type="text" id="policeStationAddress" name="policeStationAddress" required>
            </div>
            <div class="form-group">
                <label for="hospital"> Hospital Address </label>
                <input type="text" id="hospital" name="hospital" required>
            </div>
            <div class="form-group">
                <label for="hospitalNumber">Hospital Number</label>
                <input type="text" id="hospitalNumber" name="hospitalNumber" required>
            </div>
            <div class="form-group">
                <label for="crimeName">Crime Name</label>
                <select id="crimeName" name="crimeName" required>
                    <option value=""></option>
                    <option value="Cyber Crime">Cyber Crime</option>
                    <option value="Environmental Crime">Environmental Crime </option>
                    <option value="Human Trafficking">Human Trafficking</option>
                    <option value="Sexual Assault">Sexual Assault</option>
                    <option value="White Collar Crime">White Collar Crime</option>
                </select>
            </div>
            <div class="form-group">
                <input type="submit" value="Submit">
            </div>
        </form>
    </div>
    </div>
</body>
    </html>
</f:view>
