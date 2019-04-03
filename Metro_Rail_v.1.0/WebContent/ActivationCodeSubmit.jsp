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


<div class="body">
<div class="contain">
<br>
<form action="" target="" method="POST">
<center>
<br><br><br>
<table action="ActivityCodeChecker" method="post">
	<tr>
	<td>Enter Your Email :</td>
	<td><input type="text" placeholder="Email" name="email">
	</td></tr>

	<tr>
	<td>Enter Activity Code :</td>

	<td><input type="text" placeholder="Activity Code" name="acode">
	</td></tr>
</table>	
	
	<br><br>
	
	<input class="btn" type="submit" name="" value="Submit">
	
	</center>
	</form>

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