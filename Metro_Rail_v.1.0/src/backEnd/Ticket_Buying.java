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

import DB.dbConnection;





@WebServlet("/Ticket_Buying")
public class Ticket_Buying extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mc_number = request.getParameter("MC_number");
		String card_password = request.getParameter("card_password");
		
		String sql = "select * from users where mc_number='"+mc_number+"' and card_password='"+card_password+"'";
		Connection con = null;
		PreparedStatement ps = null;
		dbConnection obj_main_connection = new dbConnection();
		
		PrintWriter out = response.getWriter();
		
		try {
			con = obj_main_connection.get_connection();
			ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			
			Ticket_payment_Confirmation obj_Ticket_payment_Confirmation = new Ticket_payment_Confirmation();
			int validMC_number =0;
			validMC_number=obj_Ticket_payment_Confirmation.checkMC_number(rs, mc_number);
			
			if(validMC_number==1) {
				int validCard_password=0;
				validCard_password = obj_Ticket_payment_Confirmation.check_card_password(rs, card_password, request);
				System.out.println("card number okay.");
				
				if(validCard_password==1) {
					response.sendRedirect("Balance_CheckAnd_Cut");
				}
				else {
					response.sendRedirect("buy_ticket.jsp");
				}
			}
			else {
				System.out.println("card number not okay.");
				response.sendRedirect("buy_ticket.jsp");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
	}

}
