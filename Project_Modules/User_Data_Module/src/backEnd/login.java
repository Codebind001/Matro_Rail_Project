package backEnd;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")

public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
					
			//response.setContentType("text/html");
			String email=request.getParameter("uemail");
			String pass=request.getParameter("upass");
			String query="select * from user where email='"+email+"' and password='"+pass+"'";
		    Connection con = null;
		    PreparedStatement ps = null;
		    dbConnection jdbc=new dbConnection();
	    try {
	    		con = jdbc.get_connection();
	    		ps=con.prepareStatement(query);
	    		ResultSet rs=ps.executeQuery();
	    	
			   CheckEmailAndPassword checkEP= new CheckEmailAndPassword();
			   
			   int validEmail=0;
			   validEmail=checkEP.checkEmail(rs,email);
		  
			   if(validEmail==1)
			   {
				   int validPassword=0;
				   validPassword=checkEP.checkPassword(rs,pass,request);
			  
				   if(validPassword==1)
				   {
					  
					   
					     PrintWriter out = response.getWriter(); 
					     response.sendRedirect("user_home.html");
					   
				   } else {
					   response.sendRedirect("userlogin.html");
				                           
				   }
			   } else {
				   
				   response.sendRedirect("userlogin.html");
			                           
		   }
		  
	    } catch (ClassNotFoundException | SQLException e) {
			
	    	e.printStackTrace();
		}
	    /*finally {
		      try{
			         if(ps!=null)
			         {
			        	 try{
			    	         if(con!=null)
			    	        	 //dbc.ConnectionClose( st,con);
			    	      }catch(Exception se){
			    	         se.printStackTrace();
			    	      }
			         }
			      }catch(Exception se){
			      }
			}*/
		
	    //dbc.ConnectionClose( st,con);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
