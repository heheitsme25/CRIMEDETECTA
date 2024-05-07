<%-- 
    Document   : newuserconn
    Created on : 27 Feb, 2024, 4:31:14 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.*" %>

<%
try {
    // Retrieve form parameters
    String Fname=request.getParameter("txtfname");
    String lname=request.getParameter("txtlname");
    String username=request.getParameter("txtusername");
    String Email=request.getParameter("txtmail");
    String Pwd=request.getParameter("txtpwd");
    String Cpwd=request.getParameter("txtcpwd");
    String Gender=request.getParameter("gender");
    int Ph_no=Integer.parseInt(request.getParameter("txtphno"));
    
    // Establish database connection
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
    
    // Create and execute SQL query
    String q1 = "INSERT INTO user (username,Fname,lname,Email,Pwd,Cpwd,Ph_no,Gender) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(q1);
    pstmt.setString(1, Fname);
    pstmt.setString(2, lname);
    pstmt.setString(3, username);
    pstmt.setString(4, Email);
    pstmt.setString(5, Pwd);
    pstmt.setString(6, Cpwd);
    pstmt.setInt(7, Ph_no);
    pstmt.setString(8, Gender);
    
    int x1 = pstmt.executeUpdate();
    
    // Redirect based on the result
    if (x1 > 0) {
        response.sendRedirect("userlogin.jsp");
    } else {
        out.println("Record not inserted successfully");
    }
    
    // Close resources
    pstmt.close();
    conn.close();
} catch (Exception e) {
    // Handle exceptions
    out.println("An error occurred: " + e.getMessage());
    e.printStackTrace();
}
%>

