<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page language="java" %>

<%
String url = "jdbc:mysql://localhost:3306/project";
String areano = "Areano";
String hospno = "Hospno";

// Additional check to ensure variables are numeric before parsing
int arean = 0;
int hosp = 0;

try {
    // Check if the variables are numeric before parsing
    if (areano.matches("\\d+")) {
        arean = Integer.parseInt(areano);
    }

    if (hospno.matches("\\d+")) {
        hosp = Integer.parseInt(hospno);
    }

    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root" , "");
    String sql = "SELECT * FROM crimekr";
    Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery(sql);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Database Content</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Areano</th>
            <th>Districtname</th>
            <th>Areaname</th>
            <th>Pincode</th>
            <th>Policestation</th>
            <th>Hospital</th>
            <th>Hospno</th>
            <th>Crime</th>  
        </tr>
        <%
        while (resultSet.next()) {
        %>
        <tr>
            <td><%= resultSet.getString("areano") %></td>
            <td><%= resultSet.getString("districtname") %></td>
            <td><%= resultSet.getString("areaname") %></td>
            <td><%= resultSet.getString("pincode") %></td>
            <td><%= resultSet.getString("policestation") %></td>
            <td><%= resultSet.getString("hospital") %></td>
            <td><%= resultSet.getString("hospno") %></td>
            <td><%= resultSet.getString("crime") %></td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>

<%
    resultSet.close();
    statement.close();
    conn.close();
} catch (Exception e) {
    e.printStackTrace();
}
%>
