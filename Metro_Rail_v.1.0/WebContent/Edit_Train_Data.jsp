
<%@page import="Bean.train_bean"%>
<%@page import="Admin.Edit_Train"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<%
		String train_name = request.getParameter("train_name");
		Edit_Train obj_Edit_Train = new Edit_Train();
		train_bean obj_train_bean = obj_Edit_Train.get_value_of_train(train_name);
		
	
	%>

<form action="Edit_Train_Controller">
	Train Name: <input type="text" name="train_name" value="<%=train_name%>"> <br>
	Train Route: <input type="text" name="train_route" value="<%=obj_train_bean.getTrain_route()%>"> <br>
	Train start Time: <input type="text" name="start_time" value="<%=obj_train_bean.getStart_time()%>"> <br>

	<input type="submit">
</form>

</body>
</html>