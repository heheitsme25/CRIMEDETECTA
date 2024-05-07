<%-- 
    Document   : newlog
    Created on : 27 Feb, 2024, 4:39:15 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import='java.sql.*'%>
<%@page import='java.io.*'%>
<%@page import='java.util.*'%>
<%
    try{
    String username=request.getParameter("txtusername");
    String Pwd=request.getParameter("txtpwd");
    String query="Select count(*)from user where username='"+username+"' and Pwd='"+Pwd+"'";
   
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        int cnt=0;
        if(rs.next()) cnt=rs.getInt(1);
        if(cnt>0){
            response.sendRedirect("home.jsp");
        } else{
            out.println("Record not inserted successfully");
    }
    }catch(Exception e){e.printStackTrace();}
%>



