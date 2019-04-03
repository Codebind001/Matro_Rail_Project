package Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.dbConnection;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String query = "select * from admin where ad_email='" + email + "' and ad_password='" + pass + "'";
		Connection con = null;
		PreparedStatement ps = null;
		dbConnection jdbc = new dbConnection();

		try {
			con = jdbc.get_connection();
			ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			AdminEmailAndPasswordCheck checkEP = new AdminEmailAndPasswordCheck();

			int validEmail = 0;
			validEmail = checkEP.checkEmail(rs, email);

			if (validEmail == 1) {
				int validPassword = 0;
				validPassword = checkEP.checkPassword(rs, pass, request);

				if (validPassword == 1) {
					response.sendRedirect("admin_page.jsp");

				} else {
					response.sendRedirect("adminlogin.html");

				}
			} else {

				response.sendRedirect("adminlogin.html");

			}

			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
