<%@page import="com.db.DBConnection" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css?v=9578">
    <title>DoctorPataintApp</title>
	<meta charset="ISO-8859-1">
<title>DoctorPataintApp</title>
</head>
<body>
		<% Connection conn = DBConnection.GetConnection(); %>
		<Nav>
        <div class="logos">
            <h3 class="list" >XenonStack </h3>
        </div> 
       <!--   --> 
     <div class="list">
        <a href="loginpage.html">Log Out</a>
     </div>
    </Nav>
        <!--  -->
            <div class="main">
               <h1 id="text_h">XenonStack </h1>  
            </div>
    <footer>
      <p1>Souvik copy right </p1> <br>
      <p2>Email: Souvik@gmail.com </p2>
    </footer>   
</body>
</html>