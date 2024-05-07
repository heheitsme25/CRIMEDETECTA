<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
    import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>

<%
try {
    int Areano = Integer.parseInt(request.getParameter("areano"));
    String Districtname = request.getParameter("districtName");
    String Areaname = request.getParameter("areaName");
    int Pincode = Integer.parseInt(request.getParameter("pinCode"));
    String Policestation = request.getParameter("policeStationAddress");
    String Hospital = request.getParameter("hospital");
    int Hospno = Integer.parseInt(request.getParameter("hospitalNumber"));
    String Crime = request.getParameter("crimeName");
   
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
    
    String q1 = "INSERT INTO crimekr (Areano, Districtname, Areaname, Pincode, Policestation, Hospital, Hospno, Crime) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement pstmt = conn.prepareStatement(q1);
    pstmt.setInt(1, Areano);
    pstmt.setString(2, Districtname);
    pstmt.setString(3, Areaname);
    pstmt.setInt(4, Pincode);
    pstmt.setString(5, Policestation);
    pstmt.setString(6, Hospital);
    pstmt.setInt(7, Hospno);
    pstmt.setString(8, Crime);
    
    int x1 = pstmt.executeUpdate();
    if (x1 > 0) {
        response.sendRedirect("states1.jsp");
    } else {
        out.println("Record not inserted successfully");
    }
    
    pstmt.close();
    conn.close();
} catch (Exception e) {
    out.println("An error occurred: " + e.getMessage());
    e.printStackTrace();
}
%>
