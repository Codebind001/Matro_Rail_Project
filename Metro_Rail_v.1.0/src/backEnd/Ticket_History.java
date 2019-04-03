package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.dbConnection;

public class Ticket_History {
	
	public void insert_value(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException {
		
		HttpSession session=request.getSession();
		String id=(String)session.getAttribute("user_ID");
		String source = (String) session.getAttribute("sourceStations");
		String destination = (String) session.getAttribute("destinationStations");
		String price = (String) session.getAttribute("price");
		
		dbConnection obj_dbConnection = new dbConnection();
		Connection connection = obj_dbConnection.get_connection();
		PreparedStatement ps = null;

		String query = "insert into ticket_history(id,source,destination,price) values (?,?,?,?)";
		ps=connection.prepareStatement(query);
		ps.setString(1, id);
		ps.setString(2, source);
		ps.setString(3, destination);
		ps.setString(4, price);
		ps.executeUpdate();
	}

}
