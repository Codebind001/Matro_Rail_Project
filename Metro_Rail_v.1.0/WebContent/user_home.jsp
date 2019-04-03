<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Profile</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/user_home.css">
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
  <a href="user_home.html"><i class="fa fa-home"></i></a>
  <a href="user_time_schedule.jsp">TRAIN SCHEDULE</a>
    <a href="farepage.jsp">FARE</a>
  <a style="float:right" href="user_logout" ><i class="fa fa-sign-out"></i></a>
  <a style="float:right" href="#help" ><i class="fa fa-question"></i></a>
  <a style="float:right" href="#settings" ><i class="fa fa-cog fa-fw"></i></a>
  <a style="float:right" href="user_profile.jsp" ><i class="fa fa-user-circle"></i></a>
  
</div>



<div class="bodypart">
<br>

<div class="infopart1">

	<div style="margin-left: 30px;" class="inside-info">
  	<a style="background-color: #cd6155 ;" class="button" href="#profile" >
	<i class="fa fa-ticket"></i></i> <br><br> Buy Ticket </a>
	</div>
  
	<div style="margin-left: 360px;" class="inside-info">
	<a style="background-color: #f1c40f ;" class="button" href="#profile" >
	<i class="fa fa-dollar"></i> <br><br> Balance </a>
	</div>   
  
	<div style="margin-left: 690px;" class="inside-info">
	<a style="background-color: #5499c7 ;" class="button" href="#profile" >
	<i class="fa fa-money"></i> <br><br> Recharge </a>
	</div> 
  
	<div style="margin-left: 1020px;" class="inside-info">
	<a style="background-color: #73c6b6 ;" class="button" href="user_profile.jsp" >
	<i class="fa fa-history"></i> <br><br> History </a>
	</div> 
  
</div>   

</div>


<div class="footer">
<b>
  <a href="#">Terms & Conditions</a> |
  <a href="#">Privacy Policy</a> |
  <a href="#">Contact Us</a>
</b>  
</div>


</body>
</html>