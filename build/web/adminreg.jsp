<%-- 
    Document   : adminreg
    Created on : 23 Feb, 2024, 10:26:33 PM
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
        <form action="newadminloginconn.jsp" method="post">
        <img src="logo.jpg" class="cow">
                <h1>CRIMEDETECTA</h1>
                <h1>LogIn as ADMIN</h1>
                <form>
                    <p>Admin Name</p>
                    <input type="text" name="txtusername" placeholder="Enter Username">
                    <p>Password</p>
                    <input type="password" name="txtpwd" placeholder="Enter Password">
                    <input type="submit" name="btnsubmit" value="LogIn" onclick="auth()" />
                </form>
     </div>
</body>
</html>