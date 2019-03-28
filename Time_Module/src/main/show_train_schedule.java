package main;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class show_train_schedule {
	
	public List<train_bean> get_values() throws ClassNotFoundException, SQLException{
		dbConnection obj_db = new dbConnection();
		Connection connection = obj_db.get_connection();
		System.out.println("in show train");
		PreparedStatement ps = null;
		ResultSet rs = null;
		 
		List<train_bean> list = new ArrayList<train_bean>();
		
		String query = "select * from train_schedule";
		ps=connection.prepareStatement(query);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			train_bean obj_train_bean = new train_bean();
			obj_train_bean.setTrain_name(rs.getString("train_name"));
			obj_train_bean.setTrain_route(rs.getString("train_route"));
			obj_train_bean.setStart_time(rs.getString("start_time"));
			list.add(obj_train_bean);
		}
		
		return list;
	}

}
