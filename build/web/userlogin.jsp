<%-- 
    Document   : userreg
    Created on : 27 Feb, 2024, 4:26:29 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
<title>CRIMEDETECTA</title>
    <link rel="stylesheet" type="text/css" href="css/crimeuser.css">
</head>
<body>
    <div class="loginbox">
        <form action="newlog.jsp" method="post">
        <img src="logo.jpg" class="cow">
                <h1>CRIMEDETECTA</h1>
                <h1>LogIn as USER</h1>
                <form>
                    <p>Username</p>
                    <input type="text" name="txtusername" placeholder="Enter Username">
                    <p>Password</p>
                    <input type="password" name="txtpwd" placeholder="Enter Password">
                    <input type="submit" name="btnsubmit" value="LogIn" />
                </form>
     </div>
    
</body>
</html>