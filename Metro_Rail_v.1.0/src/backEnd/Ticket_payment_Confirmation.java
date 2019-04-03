package backEnd;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import Bean.Balence_Bean;


public class Ticket_payment_Confirmation {
	
	public int checkMC_number(ResultSet rs, String Enter_MC_Number) throws SQLException {
		
		while(rs.next()) {
			String mc_number;
			mc_number = rs.getString(8);
			if(mc_number.equals(Enter_MC_Number)) {
				return 1;
			}
		}
		
		return 0;
		
	}
	
	public int check_card_password(ResultSet rs, String Enter_Card_Password, HttpServletRequest request) throws SQLException {
		
		String card_password;
		card_password = rs.getString(9);
		if(card_password.equals(Enter_Card_Password)) {
			
			String balence = rs.getString(10);
			HttpSession session=request.getSession();
			session.setAttribute("balence", balence);
			
			return 1;
			
		}
		return 0;
		
	}

}
