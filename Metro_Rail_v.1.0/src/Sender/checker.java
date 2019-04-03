package Sender;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.dbConnection;


public class checker {
	
	public boolean check(String email, String activation_code) throws ClassNotFoundException, SQLException {
		
		String sql = "select * from users where email=? and activation_code=?";
		dbConnection obj_DB_Connection = new dbConnection();
		Connection connection = obj_DB_Connection.get_connection();
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, email);
		ps.setString(2, activation_code);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			return true;
		}
		
		return false;
	}

}
