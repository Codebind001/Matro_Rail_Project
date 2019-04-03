
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title></title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/email.css">
</head>
<body>

<div class="header">
  <div class="header1">
  <img class="logo" src="img/jU14FTa.jpg" alt="Metro Rail" width="100" height="100">
  </div>
  
  <div class="header2">
  <h1 class="heading">Track Taker</h1>
  </div>
  
</div>

<div class="topnav">
  <a href="user_home.jsp"><i class="fa fa-home"></i></a>
  <a href="user_time_schedule.jsp">TRAIN SCHEDULE</a>
  <a href="farepage.jsp">FARE</a>
  <a style="float:right" href="user_logout" ><i class="fa fa-sign-out"></i></a>
  <a style="float:right" href="#help" ><i class="fa fa-question"></i></a>
  <a style="float:right" href="#settings" ><i class="fa fa-cog fa-fw"></i></a>
  <a style="float:right" href="user_profile.jsp?User_name=<%=session.getAttribute("username")%>" ><i class="fa fa-user-circle"></i></a>
  
</div>


<div class="body">
<div class="contain">
<br>
<br>
<br>
<br>
<br>
<center> Your QR Ticket Save In Gallery. </center>

</div></div>


<div class="footer">
<b>
  <a href="#">Terms & Conditions</a> |
  <a href="#">Privacy Policy</a> |
  <a href="#">Contact Us</a>
</b>  
</div>


</body>
</html>