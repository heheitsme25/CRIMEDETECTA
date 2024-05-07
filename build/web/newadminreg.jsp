<%-- 
    Document   : newadminreg.jsp
    Created on : 23 Feb, 2024, 10:04:24 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="java.io.*" %>
<%@page import="java.util.*" %>

<%
try {
    // Retrieve form parameters
    String AFirstname = request.getParameter("txtfname");
    String ALastname = request.getParameter("txtlname");
    String Adminname = request.getParameter("txtusername");
    String Email = request.getParameter("txtmail");
    String APwd = request.getParameter("txtpwd");
    String ACpwd = request.getParameter("txtcpwd");
    String AGender = request.getParameter("gender");
    int APh_no = Integer.parseInt(request.getParameter("txtphno"));
   
    // Establish database connection
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
    
    // Create and execute SQL query
    String q1 = "INSERT INTO admin (AFirstname, ALastname, Adminname, Email, APwd, ACpwd, APh_no, AGender) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(q1);
    pstmt.setString(1, AFirstname);
    pstmt.setString(2, ALastname);
    pstmt.setString(3, Adminname);
    pstmt.setString(4, Email);
    pstmt.setString(5, APwd);
    pstmt.setString(6, ACpwd);
    pstmt.setInt(7, APh_no);
    pstmt.setString(8, AGender);
    
    int x1 = pstmt.executeUpdate();
    
    // Redirect based on the result
    if (x1 > 0) {
        response.sendRedirect("adminreg.jsp");
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
