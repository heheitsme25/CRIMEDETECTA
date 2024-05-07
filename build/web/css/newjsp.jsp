<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page language="java" %>

<%
// Define database connection parameters
String url = "jdbc:mysql://localhost:3306/project";
String username = "Username";
String password = "feedback";

try {
    // Load the MySQL JDBC driver
    Class.forName("com.mysql.jdbc.Driver");

    // Establish the database connection
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root" , "");

    // Create a SQL query
    String sql = "SELECT * FROM feedback";
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
            <th>Username</th>
            <th>Feedback</th>
        </tr>
        <% 
        // Loop through the result set and display data
        while (resultSet.next()) { 
        %>
        <tr>
            <td><%= resultSet.getString("username") %></td>
            <td><%= resultSet.getString("feedback") %></td>
        </tr>
        <% 
        } // End of while loop
        %>
    </table>
</body>
</html>

<%
    // Close JDBC resources
    resultSet.close();
    statement.close();
    conn.close();
} catch (Exception e) {
    e.printStackTrace();
}
%>



