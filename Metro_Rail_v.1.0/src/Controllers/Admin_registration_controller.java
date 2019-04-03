package Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.Admin_Register;

@WebServlet("/Admin_registration_controller")
public class Admin_registration_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ad_first_name = request.getParameter("fname");
		String ad_last_name = request.getParameter("lname");
		String ad_email = request.getParameter("email");
		String ad_mb_number = request.getParameter("mb");
		String ad_designation = request.getParameter("dg");
		String ad_password = request.getParameter("pass");
		
		
		try {
			Admin_Register obj_Admin_Register = new Admin_Register();
			boolean insert = obj_Admin_Register.insert_value(ad_first_name, ad_last_name, ad_email, ad_mb_number, ad_designation, ad_password);
			if(insert==true) {
				response.sendRedirect("admin.html");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
