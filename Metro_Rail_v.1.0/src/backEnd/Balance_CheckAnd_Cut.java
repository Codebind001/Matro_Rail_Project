package backEnd;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import User.sessionCreate;

/**
 * Servlet implementation class Balance_CheckAnd_Cut
 */
@WebServlet("/Balance_CheckAnd_Cut")
public class Balance_CheckAnd_Cut extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		
		/// Get User id from session
		sessionCreate sc = new sessionCreate();
		String iduser= sc.checkSession(request, response);//(String)session.getAttribute("user_ID");
		
		///Get Balance and Ticket price
		HttpSession session=request.getSession();
		String Balence = (String) session.getAttribute("balence");
		String price = (String) session.getAttribute("price");
		//FareCalculation obj_FareCalculation = new FareCalculation();
		//String price = (String) session.getAttribute("totalFair");
		

		double User_balance = Double.parseDouble(Balence);
		double ticket_price = Double.parseDouble(price);
		
		if (User_balance > ticket_price) {
			User_balance = (User_balance - ticket_price);
			Update_Amount obj_Update_Amount = new Update_Amount();
			try {
				boolean check = obj_Update_Amount.update_ac_balance(User_balance, iduser);
				if(check==true) {
					Ticket_History obj_Ticket_History = new Ticket_History();
					obj_Ticket_History.insert_value(request, response);
					response.sendRedirect("get_ticket.jsp");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//response.sendRedirect("get_ticket.jsp");
		}

	}
}
