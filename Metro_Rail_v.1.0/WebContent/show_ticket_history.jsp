<%@page import="Bean.History_Bean"%>
<%@page import="java.util.*"%>
<%@page import="Admin.Show_History"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>History</title>
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
  <a href="admin_page.jsp"><i class="fa fa-home"></i></a>
  <a href="time_schedule.jsp">TRAIN SCHEDULE</a>
  <a style="float:right" href="Admin_logout" ><i class="fa fa-sign-out"></i></a>
  <a style="float:right" href="#help" ><i class="fa fa-question"></i></a>
  <a style="float:right" href="#settings" ><i class="fa fa-cog fa-fw"></i></a>
  <a style="float:right" href="admin_profile.jsp" ><i class="fa fa-user-circle"></i></a>
  
</div>

<div class="body">

<div class="body1">
<center>
<h3>History</h3>

<%
	Show_History obj_Show_History = new Show_History();
	List<History_Bean> list = obj_Show_History.get_values();
	
	Iterator<History_Bean> it_list = list.iterator();
		
	%>

<table id="schedule">
  <tr>
    <th>User ID</th>
    <th>Source</th>
    <th>Destination</th>
    <th>Price</th>
  </tr>
  
<%
	while(it_list.hasNext()){
		History_Bean obj_History_Bean = new History_Bean();
		obj_History_Bean=it_list.next();
	
%>
  
  <tr>
    <td><%=obj_History_Bean.getId() %></td>
    <td><%=obj_History_Bean.getSource() %></td>
    <td><%=obj_History_Bean.getDestination() %></td>
    <td><%=obj_History_Bean.getPrice() %></td>
  </tr>
  
  <%
		}
	%>
  
</table>
</center>


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