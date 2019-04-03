
<%@page import="java.text.DecimalFormat"%>
<%@page import="DB.dbConnection"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Fare</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="CSS_File/fare.css">
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
  <a style="float:right" href="#logout" ><i class="fa fa-sign-out"></i></a>
  <a style="float:right" href="#help" ><i class="fa fa-question"></i></a>
  <a style="float:right" href="#settings" ><i class="fa fa-cog fa-fw"></i></a>
  <a style="float:right" href="user_profile.jsp?User_name=<%=session.getAttribute("username")%>" ><i class="fa fa-user-circle"></i></a>
  
</div>

 <%!
    Connection con = null;
 	PreparedStatement ps = null;
    ResultSet rs = null; 
    ResultSet rs2 = null; 
 %>
 <%
 	dbConnection db = new dbConnection();
    con=db.get_connection();
    String query="select * from stations";
    ps=con.prepareStatement(query);    
    rs=ps.executeQuery();
 %>


<form action="FareCalculation" target="" method="POST">

	Select source station:
	<div class="textbox">
	<i class="fa fa-plus-circle" aria-hidden="true"></i>
	<div class="box">

		<select required name="source"> 
		<option selected value="">Select Option</option>
           <%
        		   if(rs!=null)
        		   {
        		 	  try {
        		 			 while(rs.next())
        		 				{  
        		 				   out.println(" <option value=\""+rs.getInt(1)+"\">"+rs.getString(2)+"</option>");					
        		 				}
        		 		} catch (SQLException e) {
        		 			
        		 			e.printStackTrace();
        		 		}
        		   }
           rs.close();
           %>
		
		</select>
	</div>
	</div>

	
		Select Destination station:
	<div class="textbox">
	<i class="fa fa-minus-circle" aria-hidden="true"></i>
	<div class="box">

			<select required name="destination">
			<option selected value="">Select Option</option>
           <%
           		   rs2=ps.executeQuery();
        		   if(rs2!=null)
        		   {
        		 	  try {
        		 			 while(rs2.next())
        		 				{  
        		 				   out.println(" <option value=\""+rs2.getInt(1)+"\">"+rs2.getString(2)+"</option>");					
        		 				}
        		 		} catch (SQLException e) {
        		 			
        		 			e.printStackTrace();
        		 		}
        		   }
        		   rs2.close();
           
           %>
		</select>
	</div>
	</div>
	<br>
	<input class="btn" type="submit" name="" value="Get Fare">
	</form>
	
	<div id="id01" class="modal">                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    <table class="tab1">
    
 	  <tr> <td><label >Source :</label></td>
           <td><output ><%= session.getAttribute("sourceStations")%></output></td></tr>
      <tr> <td> <label >Destination :</label></td>
           <td><output ><%= session.getAttribute("destinationStations") %></output></td></tr>
      <tr> <td> <label >Distance:</label></td>
      <%
      		DecimalFormat df = new DecimalFormat("#.##");
      		String distance = df.format(session.getAttribute("totalDistance"));    
      %>
           <td><output ><% out.println(distance); %> Kilometer</output></td></tr>
      <tr> <td> <label >Fair :</label></td>
           <td><output ><%=session.getAttribute("totalFair")+"   BDT" %></output></td></tr>
 	  <br>	
        
	  </table>
	  <tr>
      		<a class="button" href="buy_ticket.jsp?Ticket_price=<%=session.getAttribute("totalFair")%>">Buy Ticket</a> <br><br>
      </tr>  
	</div>
	
	<div class="footer">
		<b>
		  <a href="#">Terms & Conditions</a> 
		  <a href="#">Privacy Policy</a> 
		  <a href="#">Contact Us</a>
		</b>  
	</div>
	
	
	
</body>
</html>