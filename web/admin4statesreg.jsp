<%-- 
    Document   : admin4statesreg
    Created on : 6 Apr, 2024, 11:23:28 PM
    Author     : ashir
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #ADD8E6;
            margin: 0;
            padding: 0;
            display: flex;
            background: url(background_1.jpg);
            background-size: cover;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: maroon;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            text-align: center;
            position: relative;
            right: 50%;
            transform: translateX(50%);
            padding: 20px; /* Added padding for spacing */
        }
        .con{
            position: relative;
            width: 100vw;
            height: 100vh;
        }
        
        img{
            position: absolute;
            top: 0px;
            left: 0px;
        }
        h2 {
            color: white;
            margin-bottom: 20px;
        }

        .btn {
            display: inline-block;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            text-decoration: none;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s;
            margin: 5px; /* Added margin for spacing */
        }

        .btn:hover {
            background-color: #0056b3;
        }

        /* Added CSS for two-column layout */
        .btn-container {
            display: flex;
            justify-content: center;
            margin-top: 20px; /* Added margin for spacing */
        }

        .btn-container .btn {
            flex: 1; /* Distribute space evenly between buttons */
        }

    </style>
</head>
<body>
    <div class="con">
         <img src="css/logo.jpg" alt="logo" width="100" height="60">
    </div>
    <div class="container">
        <h2>CRIMEDETECTA</h2>
        
        <div class="btn-container">
            <a href="connectionup.jsp" class="btn">Register crime of  Uttar Pradesh</a>
            <a href="connectionrj.jsp" class="btn">Register crime of  Rajasthan</a>
            <a href="connectiondl.jsp" class="btn">Register crime of  Delhi</a>
            <a href="connection.jsp" class="btn">Register crime of  Kerala</a>

        </div>
    </div>
</body>
</html>
