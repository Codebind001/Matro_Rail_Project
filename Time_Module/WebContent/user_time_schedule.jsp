
<%@page import="main.show_train_schedule"%>
<%@page import="main.train_bean"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Time Schedule</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/time_schedule.css">
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
  <a href="user_time_schedule.html">TRAIN SCHEDULE</a>
  <a href="farepage.jsp">FARE</a>
  <a style="float:right" href="#logout" ><i class="fa fa-sign-out"></i></a>
  <a style="float:right" href="#help" ><i class="fa fa-question"></i></a>
  <a style="float:right" href="#settings" ><i class="fa fa-cog fa-fw"></i></a>
  <a style="float:right" href="user_profile.html" ><i class="fa fa-user-circle"></i></a>
  
</div>

<div class="body">

<div class="body1">
<center>
<h3>Time Schedule of MRT Line-6</h3>

<%
		show_train_schedule obj_show_train_schedule = new show_train_schedule();
		List<train_bean> list= obj_show_train_schedule.get_values();
	
		Iterator<train_bean> it_list = list.iterator();
	%>

<table id="schedule">
  <tr>
    <th>Train Name</th>
    <th>Route</th>
    <th>Start Time</th>
  </tr>
  
<%
	while(it_list.hasNext()){
	train_bean obj_train_bean = new train_bean();
	obj_train_bean= it_list.next();
%>
  
  <tr>
    <td><%=obj_train_bean.getTrain_name() %></td>
    <td><%=obj_train_bean.getTrain_route() %></td>
    <td><%=obj_train_bean.getStart_time() %></td>
  </tr>
  
  <%
		}
	%>
  
</table>
</center>


</div>

<div class="body2">
<iframe src="https://www.google.com/maps/d/embed?mid=1RmvxLec2HYUK5KZDd9wz0MgmtbHwRefN" width="100%" height="100%"></iframe>
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