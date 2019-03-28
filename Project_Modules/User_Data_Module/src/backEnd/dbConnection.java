package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
	
public Connection get_connection() throws ClassNotFoundException, SQLException{
		
		Connection connection = null;
		
		String url = "jdbc:mysql://localhost:3306/oop_project";
		String uname = "root";
		String pass = "root";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url,uname,pass);
		
		
		return connection;
	}

}


