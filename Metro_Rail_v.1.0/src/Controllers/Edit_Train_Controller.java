package Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Admin.Edit_Train;
import Bean.train_bean;


@WebServlet("/Edit_Train_Controller")
public class Edit_Train_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Edit_Train_Controller() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String train_name = request.getParameter("train_name");
		String train_route = request.getParameter("train_route");
		String start_time = request.getParameter("start_time");		
		
		try {
			train_bean obj_train_bean = new train_bean();
			obj_train_bean.setTrain_name(train_name);
			obj_train_bean.setTrain_route(train_route);
			obj_train_bean.setStart_time(start_time);
			
			Edit_Train obj_Edit_Train = new Edit_Train();
			obj_Edit_Train.Update_Train(obj_train_bean);
		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}
		
		response.sendRedirect("time_schedule.jsp");
	}

}
