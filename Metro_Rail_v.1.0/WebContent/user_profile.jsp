
<%@page import="Bean.User_Bean"%>
<%@page import="User.Profile_cls"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Profile</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/user_profile.css">
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
  <a style="float:right" href="user_profile.jsp" ><i class="fa fa-user-circle"></i></a>
  
</div>

<%
	
	Profile_cls obj_Profile_cls = new Profile_cls();
	User_Bean obj_User_Bean = obj_Profile_cls.get_values_of_user(request, response);
	
				
%>



<div class="bodypart">
<br>
<div class="body">

<a href="#" class="button"><b>edit profile</b></a>


<div class="body1">




</div>

<div class="body2">
<br>
<!-- 
<h1></h1>
-->
<h1>Profile</h1>
<br>
	<table>
		<tr> 
			<td> First Name: <%=obj_User_Bean.getFirst_name() %> </td>
		</tr>
		<tr> 
			<td> Last Name: <%=obj_User_Bean.getLast_name() %> </td>
		</tr>
		<tr> 
			<td> Email: <%=obj_User_Bean.getEmail() %> </td>
		</tr>
		<tr> 
			<td> Mobile Number: <%=obj_User_Bean.getMb_number() %> </td>
		</tr>
		<tr> 
			<td> Metro Card Number: <%=obj_User_Bean.getMc_number() %> </td>
		</tr>	
		<tr> 
			<td> Account Balance: <%=obj_User_Bean.getAccount_balance() %> BDT</td>
		</tr>	
	</table>

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