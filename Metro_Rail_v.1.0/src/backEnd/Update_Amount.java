package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.dbConnection;



public class Update_Amount {
	
	public boolean update_ac_balance(double User_balance, String user_id) throws ClassNotFoundException, SQLException {
		
		dbConnection obj_main_connection = new dbConnection();
		Connection connection = obj_main_connection.get_connection();
		String account_balance = Double.toString(User_balance);
		System.out.println(account_balance );
		System.out.println(user_id );
		if(connection!=null)
			System.out.println("connect");
		PreparedStatement ps = null;
		String query = "update users set account_balance=? where user_id=?";
		ps=connection.prepareStatement(query);
		ps.setString(1, account_balance);
		ps.setString(2, user_id);
		int rs=ps.executeUpdate();
		if(rs!=0) {
			connection.close();
			return true;}
		else
			System.out.println("false");
		connection.close();
		return false;
		
		
		
	}

}
