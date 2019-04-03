package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import AutoGenerators.AutoCreateID;
import DB.dbConnection;

public class Admin_Register {
	
	public boolean insert_value(String ad_first_name, String ad_last_name,String ad_email, String ad_mb_number, String ad_designation,String ad_password) throws ClassNotFoundException, SQLException {
		
		dbConnection obj_db = new dbConnection();
		Connection connection = obj_db.get_connection();
		
		PreparedStatement ps = null;
		
		AutoCreateID obj_AutoCreateID = new AutoCreateID();
		
		String id_admin = obj_AutoCreateID.createID();
		
		String query="insert into admin(id_admin,ad_first_name,ad_last_name,ad_email,ad_mb_number,ad_password,ad_designation) values(?,?,?,?,?,?,?)";
		ps=connection.prepareStatement(query);
		ps.setString(1, id_admin);
		ps.setString(2, ad_first_name);
		ps.setString(3, ad_last_name);
		ps.setString(4, ad_email);
		ps.setString(5, ad_mb_number);
		ps.setString(6, ad_password);
		ps.setString(7, ad_designation);
		ps.executeUpdate();
		
		return true;
		
		
	}
}
