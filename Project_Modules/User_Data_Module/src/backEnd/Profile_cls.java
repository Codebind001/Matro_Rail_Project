package backEnd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Profile_cls {
	
	public User_Bean get_values_of_user(HttpServletRequest request, HttpServletResponse response) throws IOException, ClassNotFoundException, SQLException {
		
		sessionCreate obj_session = new sessionCreate();
		String iduser = obj_session.checkSession(request, response);
		
		dbConnection jdbc=new dbConnection();
		Connection connection = jdbc.get_connection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		User_Bean obj_User_Bean = new User_Bean();
		
		String query = "select * from user where iduser=?";
		ps=connection.prepareStatement(query);
		ps.setString(1, iduser);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			
			obj_User_Bean.setId(rs.getString("iduser"));
			obj_User_Bean.setFirst_name(rs.getString("first_name"));
			obj_User_Bean.setLast_name(rs.getString("last_name"));
			obj_User_Bean.setEmail(rs.getString("email"));
			obj_User_Bean.setMb_number(rs.getString("mb_number"));
			obj_User_Bean.setUser_name(rs.getString("user_name"));
			obj_User_Bean.setPassword(rs.getString("password"));
			obj_User_Bean.setMc_number(rs.getString("mc_number"));
			
			
		}
		
		return obj_User_Bean;
		
	}

}
