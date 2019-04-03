<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Admin</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/Signup.css">
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


<div class="regpart" style="background-image: url('img/RV.jpg');"  >
<div class="reg-box">
    <h1>Create A New Admin Account</h1>
	
	<form action="Admin_registration_controller" target="" method="POST">
	
	<div class="textbox">
	<i class="fa fa-user" aria-hidden="true"></i>
	<input type="text" placeholder="Enter Admin frist name" name="fname" value="">
	</div>
	
	<div class="textbox">
	<i class="fa fa-user" aria-hidden="true"></i>
	<input type="text" placeholder="Enter Admin last name" name="lname" value="">
	</div>
	
	<div class="textbox">
	<i class="fa fa-envelope" aria-hidden="true"></i>
	<input type="email" placeholder="Enter Admin email" name="email" value="">
	</div>
	
	<div class="textbox">
	<i class="fa fa-mobile" aria-hidden="true"></i>
	<input type="text" placeholder="Enter Admin mobile number" name="mb" value="">
	</div>
	
	<div class="textbox">
	<i class="fa fa-user-circle" aria-hidden="true"></i>
	<input type="text" placeholder="Enter Admin Designaion" name="dg" value="">
	</div>
	
	<div class="textbox">
	<i class="fa fa-lock" aria-hidden="true"></i>
	<input type="password" placeholder="Enter a Password" name="pass" value="">
	</div>
	
	<div class="textbox">
	<i class="fa fa-lock" aria-hidden="true"></i>
	<input type="password" placeholder="Re-type password" name="" value="">
	</div>
	
	<input class="btn" type="submit" name="" value="Add Admin">
	</form>

</div></div>


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