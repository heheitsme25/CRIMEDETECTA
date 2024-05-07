<%-- 
    Document   : newadminloginconn.jsp
    Created on : 23 Feb, 2024, 10:26:57 PM
    Author     : dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import='java.sql.*'%>
<%@page import='java.io.*'%>
<%@page import='java.util.*'%>
<%
    try{
    String Adminname=request.getParameter("txtusername");
    String APwd=request.getParameter("txtpwd");
    String query="Select count(*)from admin where Adminname='"+Adminname+"' and APwd='"+APwd+"'";
   
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery(query);
        int cnt=0;
        if(rs.next()) cnt=rs.getInt(1);
        if(cnt>0){
            response.sendRedirect("admin4statesreg.jsp");
        } else{
            out.println("Record not inserted successfully");
    }
    }catch(Exception e){e.printStackTrace();}
%>
