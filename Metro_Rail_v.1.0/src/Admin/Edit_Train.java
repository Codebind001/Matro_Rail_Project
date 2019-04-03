package Admin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.train_bean;
import DB.dbConnection;

public class Edit_Train {
	
	public train_bean get_value_of_train(String train_name) throws ClassNotFoundException, SQLException {
		dbConnection obj_db = new dbConnection();
		Connection connection = obj_db.get_connection();
		
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		train_bean obj_train_bean = new train_bean();
		String query = "select * from train_schedule where train_name=?";
		ps=connection.prepareStatement(query);
		ps.setString(1, train_name);
		rs=ps.executeQuery();
		
		while(rs.next()) {
			obj_train_bean.setTrain_name(rs.getString("train_name"));
			obj_train_bean.setTrain_route(rs.getString("train_route"));
			obj_train_bean.setStart_time(rs.getString("start_time"));
			
		}
		return obj_train_bean;
	}
	
	public void Update_Train(train_bean obj_train_bean) throws ClassNotFoundException, SQLException {
		
		dbConnection obj_db = new dbConnection();
		Connection connection = obj_db.get_connection();
		
		PreparedStatement ps = null;
		
		String query = "update train_schedule set train_route=?, start_time=? where train_name=?";
		ps=connection.prepareStatement(query);
		ps.setString(1, obj_train_bean.getTrain_route());
		ps.setString(2, obj_train_bean.getStart_time());
		ps.setString(3, obj_train_bean.getTrain_name());
		
		ps.executeUpdate();
	}

}
