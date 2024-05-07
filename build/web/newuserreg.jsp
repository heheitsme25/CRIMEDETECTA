<%-- 
    Document   : newuserreg
    Created on : 27 Feb, 2024, 4:30:37 PM
    Author     : dell
--%>

<%@page import='java.sql.*'%>
<%@page import='java.io.*'%>
<%@page import='java.util.*'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
    <meta charset="UTF-8">
    <title>Registration Form</title>
    <link rel="stylesheet"  href="css/registeration.css" type="text/css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script>
        function validateForm() {
            var password = document.getElementById("txtpwd").value;
            var confirmPassword = document.getElementById("txtcpwd").value;
            if (password != confirmPassword) {
                alert("Passwords do not match!");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <div class="container">
        <div class="title">Registration</div>
        <form action="newregserv.jsp" method="post" onsubmit="return validateForm()">
            <div class="user-details">
                <div class="input-box">
                    <span class="details">Username</span>
                    <input type="text" name="txtusername" placeholder="Enter your Username" required>
                </div>
                <div class="input-box">
                    <span class="details">First Name</span>
                    <input type="text" name="txtfname" placeholder="Enter your First name" required>
                </div>
                <div class="input-box">
                    <span class="details">Last Name</span>
                    <input type="text" name="txtlname" placeholder="Enter your Last name" required>
                </div>
                <div class="input-box">
                    <span class="details">Email</span>
                    <input type="text" name="txtmail" placeholder="Enter your Email" required>
                </div>
                <div class="input-box">
                    <span class="details">Password</span>
                    <input type="password" name="txtpwd" id="txtpwd" placeholder="Enter your Password" required>
                </div>
                <div class="input-box">
                    <span class="details">Confirm Password</span>
                    <input type="password" name="txtcpwd" id="txtcpwd" placeholder="Enter Confirm Password" required>
                </div>
                <div class="input-box">
                    <span class="details">Phone Number</span>
                    <input type="text" name="txtphno" placeholder="Enter your Phone Number" required>
                </div>
                <div class="gender-details">
    <input type="radio" name="gender" id="dot-1" value="Male">
    <input type="radio" name="gender" id="dot-2" value="Female">
    <input type="radio" name="gender" id="dot-3" value="Other">
    <span class="gender-title">Gender</span>
    <div class="category">
        <label for="dot-1">
            <span class="dot one"></span>
            <span class="Gender">Male</span>
        </label>
        <label for="dot-2">
            <span class="dot two"></span>
            <span class="Gender">Female</span>
        </label>
        <label for="dot-3">
            <span class="dot three"></span>
            <span class="Gender">Other</span>
        </label>
    </div>
</div>

                <div class="button">
                    <input type="submit" value="Register">
                </div>
            </div>
        </form>
    </div>
</body>
</html>
