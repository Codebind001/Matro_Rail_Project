package User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import AutoGenerators.AutoCreateID;
import DB.dbConnection;


public class user_registration {
	
	public void insert_value1(String first_name, String last_name, String email, String mb_number, String password, String activation_code) throws ClassNotFoundException, SQLException{
		 dbConnection obj_DB_Connection = new dbConnection();
		 Connection connection = obj_DB_Connection.get_connection();
		 
		 PreparedStatement ps = null;
		 AutoCreateID obj_AutoCreateID = new AutoCreateID();
		 String user_id = obj_AutoCreateID.createID();
		 String query="insert into users(user_id,first_name,last_name,email,mb_number,password,activation_code) values(?,?,?,?,?,?,?)";
		 ps=connection.prepareStatement(query);
		 ps.setString(1, user_id);
		 ps.setString(2, first_name);
		 ps.setString(3, last_name);	 
		 ps.setString(4, email);
		 ps.setString(5, mb_number);
		 ps.setString(6, password);
		 ps.setString(7, activation_code);
		 ps.executeUpdate();
		 
		 
		 
	}


}
