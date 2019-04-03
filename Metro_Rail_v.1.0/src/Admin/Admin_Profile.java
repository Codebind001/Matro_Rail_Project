package Admin;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Admin_Bean;
import DB.dbConnection;


public class Admin_Profile {

	public Admin_Bean get_value_of_admin(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
		
		sessionCreate obj_session = new sessionCreate();
		String id_admin = obj_session.checkSession(request, response);
		
		dbConnection jdbc=new dbConnection();
		Connection connection = jdbc.get_connection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		Admin_Bean obj_Admin_Bean = new Admin_Bean();
		
		String query = "select * from admin where id_admin=?";
		ps=connection.prepareStatement(query);
		ps.setString(1, id_admin);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			
			obj_Admin_Bean.setId_admin(rs.getString("id_admin"));
			obj_Admin_Bean.setAd_first_name(rs.getString("ad_first_name"));
			obj_Admin_Bean.setAd_last_name(rs.getString("ad_last_name"));
			obj_Admin_Bean.setAd_email(rs.getString("ad_email"));
			obj_Admin_Bean.setAd_mb_number(rs.getString("ad_mb_number"));
			obj_Admin_Bean.setAd_password(rs.getString("ad_password"));
			obj_Admin_Bean.setAd_designation(rs.getString("ad_designation"));
		}
		return obj_Admin_Bean;
		
	}
}
