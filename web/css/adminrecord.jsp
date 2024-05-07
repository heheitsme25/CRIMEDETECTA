<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<f:view>
    <html>
       <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Crime Registration</title>
    <link rel="stylesheet" href="try.css" />


</head>
<body>
    <div class="gradient-background">
        <nav class="navbar navbar-expand-lg">
            <div class="navbar-left">
                <a href="#" class="website-name">CrimeDetecta</a>
            </div>
            <div class="navbar-right ms-auto">
                <ul>
                    <li><a href="#">Home</a></li>
                    <li><a href="#">Vision</a></li>
                    <li><a href="#">Crimes</a></li>
                    <li><a href="#">Prevention</a></li>
                    <li><a href="#">About Us</a></li>
                </ul>
            </div>
        </nav>
    <div class="form-container">
        <h1><bold>Crime Registration</bold></h1>
        <form action="#" method="post">
            <div class="form-group">
                <label for="stateName">State Name</label>
                <select id="statetName" name="stateName" required>
                    <option value=""></option>
                    <option value="district1">New Delhi</option>
                    <option value="district2">Kerala</option>
                    <option value="district3">Rajasthan</option>
                    <option value="district3">Uttar Pradesh</option>
                </select>
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
                <label for="crimeType">Crime Name</label>
                <select id="crimeName" name="crimeName" required>
                <option value=""></option>
                    <option value="crime1">Cyber Crime</option>
                    <option value="crime2">Environmental Crime </option>
                    <option value="crime3">Human Trafficking</option>
                    <option value="crime4">Sexual Assault</option>
                    <option value="crime5">White Collar </option>
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
