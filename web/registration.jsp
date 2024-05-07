<%-- 
    Document   : registration
    Created on : 23 Feb, 2024, 10:02:52 PM
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
    <style>
        .password-container {
            position: relative;
        }

        .password-container input[type="password"] {
            padding-right: 35px;
        }

        .password-container .toggle-password {
            position: absolute;
            right: 10px;
            top: 50%;
            transform: translateY(-50%);
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="title">Registration as Admin</div>
    <form action="newadminreg.jsp" method="post" onsubmit="return validateForm()">
        <div class="user-details">
            <div class="input-box">
                <span class="details">Admin First Name</span>
                <input type="text" name="txtfname" placeholder="Enter your First name" required>
            </div>
            <div class="input-box">
                <span class="details">Admin Last Name</span>
                <input type="text" name="txtlname" placeholder="Enter your Last name" required>
            </div>
            <div class="input-box">
                <span class="details">AdminName</span>
                <input type="text" name="txtusername" placeholder="Enter your Username" required>
            </div>
            <div class="input-box">
                <span class="details">Admin Email</span>
                <input type="text" name="txtmail" placeholder="Enter your Email" required>
            </div>
            <div class="password-container input-box">
                <span class="details">Password</span>
                <input type="password" name="txtpwd" id="password" placeholder="Enter your Password" required>
                <span class="toggle-password" onclick="togglePasswordVisibility('password')">
                </span>
            </div>
            <div class="password-container input-box">
                <span class="details">Confirm Password</span>
                <input type="password" name="txtcpwd" id="confirmPassword" placeholder="Enter Confirm Password" required>
                <span class="toggle-password" onclick="togglePasswordVisibility('confirmPassword')">
                </span>
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

<script>
    function validateForm() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirmPassword").value;

        if (password !== confirmPassword) {
            alert("Passwords do not match!");
            return false;
        }
        return true;
    }

    function togglePasswordVisibility(inputId) {
        var passwordInput = document.getElementById(inputId);
        if (passwordInput.type === "password") {
            passwordInput.type = "text";
        } else {
            passwordInput.type = "password";
        }
    }
</script>
</body>
</html>
