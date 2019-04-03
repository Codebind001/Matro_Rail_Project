<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Admin</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/admin.css">
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
  <a href="admin_page.jsp"><i class="fa fa-home"></i></a>
  <a style="float:right" href="Admin_logout" ><i class="fa fa-sign-out"></i></a>
  <a style="float:right" href="admin_profile.jsp" ><i class="fa fa-user-circle"></i> Admin</a>
  
</div>

<div class="body">
<br>


<div class="infopart1">

	<div style="margin-left: 30px;" class="inside-info">
  	<a style="background-color: #9c640c ;" class="button" href="#profile" >
	<i class="fa fa-ticket"></i></i> <br><br> Update Fare</a>
	</div>
  
	<div style="margin-left: 360px;" class="inside-info">
	<a style="background-color: #8e44ad  ;" class="button" href="add_admin.jsp" ><i class="fa fa-plus"></i>
	<i class="fa fa-user"></i> <br><br> Add New Admin </a>
	</div>   
  
	<div style="margin-left: 690px;" class="inside-info">
	<a style="background-color: #e59866 ;" class="button" href="show_ticket_history.jsp" >
	<i class="fa fa-hourglass-start"></i> <br><br> History</a>
	</div> 
  
	<div style="margin-left: 1020px;" class="inside-info">
	<a style="background-color: #5499c7 ;" class="button" href="time_schedule.jsp" >
	<i class="fa fa-subway"></i></i> <br><br> Update Rought / Train </a>
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