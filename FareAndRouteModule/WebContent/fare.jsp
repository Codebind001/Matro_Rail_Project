<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.Connection"%>
 <%@ page import="java.sql.ResultSet"%>
 <%@ page import="java.sql.Statement" %>
 <%@ page import="backEnd.dbConnection"%>
 <%@ page import="java.sql.SQLException"%>
 <%@ page import="javax.servlet.http.HttpSession" %>
 
 <%!
    Connection con = null;
 	PreparedStatement ps = null;
    ResultSet rs = null; 
    ResultSet rs2 = null; 
 %>
 <%
    dbConnection db=new dbConnection();
    con=db.get_connection();
    String query="select * from stations";
    ps=con.prepareStatement(query);    
    rs=ps.executeQuery();
 %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#map{
 height:500px;
 width:70%;
 padding:10px;
 margin:auto;
}
</style>
<link rel="stylesheet" href="/maps/documentation/javascript/cgc/demos.css">
<link href="CSS/fair.css" rel="stylesheet" type="text/css"> 
<!--  <script src="Script.js"></script>-->
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="modal">
 <form action="FareCalculation" method="post">
  <h3>Find Fair and Root between two Stations</h3>
  <table>
      <tr> <td><label for="source">Source :</label></td>
           <td> <select required name="source"> 
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
          							  
          						 </select></td></tr>
      <tr> <td> <label for="destination">Destination :</label></td>
           <td><select required name="destination">
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
          							  
          						 </select></td></tr>
   </table>
 <input type="submit" value="Find" onclick="myFunction()">
 </form>
</div>

<%
	DecimalFormat df = new DecimalFormat("#.##");	
%>

<div id="id01" class="modal">                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
    <table class="tab1">
      <tr> <td><label >Source :</label></td>
           <td><output ><%= session.getAttribute("sourceStations")%></output></td></tr>
      <tr> <td> <label >Destination :</label></td>
           <td><output ><%= session.getAttribute("destinationStations") %></output></td></tr>
      <tr> <td> <label >Distance:</label></td>
           <td><output ><%= session.getAttribute("totalDistance")+"   kilometer" %></output></td></tr>
      <tr> <td> <label >Fair :</label></td>
           <td><output ><%=session.getAttribute("totalFair")+"   BDT" %></output></td></tr>
           
      <tr>
      		<br><br><a href="buy_ticket.jsp?Ticket_price=<%=session.getAttribute("totalFair")%>">Buy Ticket</a> <br><br>
      </tr>     
           
  </table>  
</div>
 <div id="map">Map</div>
    <script>
      function initMap() {
        var myLatLng = {lat: -25.363, lng: 131.044};

        // Create a map object and specify the DOM element
        // for display.
        var map = new google.maps.Map(document.getElementById("map"), {
          center: myLatLng,
          zoom: 4
        });

        // Create a marker and set its position.
        var marker = new google.maps.Marker({
          map: map,
          position: myLatLng,
          title: 'Hello World!'
        });
      }

    </script>
    <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBYRJ3K4K8GONsf5ItJfWDzBLJMNZa7Sok&callback=initMap"
        async defer></script>
</body>
</html>