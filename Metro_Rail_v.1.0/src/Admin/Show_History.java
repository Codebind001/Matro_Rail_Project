package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Bean.History_Bean;
import DB.dbConnection;

public class Show_History {
	
	public List<History_Bean> get_values() throws ClassNotFoundException, SQLException{
		
		dbConnection obj_dbConnection = new dbConnection();
		Connection connection = obj_dbConnection.get_connection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<History_Bean> list = new ArrayList<History_Bean>();
		
		String query = "select * from ticket_history";
		ps=connection.prepareStatement(query);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			History_Bean obj_History_Bean = new History_Bean();
			obj_History_Bean.setId(rs.getString("id"));
			obj_History_Bean.setSource(rs.getString("source"));
			obj_History_Bean.setDestination(rs.getString("destination"));
			obj_History_Bean.setPrice(rs.getString("price"));
			list.add(obj_History_Bean);
		}
		
		return list;
	}

}
