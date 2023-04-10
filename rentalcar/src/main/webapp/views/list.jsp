<%@page import="vehicle.Vehicle"%>
<%@page import="vehicle.controller.VehicleDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.Connection"%>
<%@page import="util.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<jsp:include page="header"></jsp:include>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
		VehicleDao vehicleDao = VehicleDao.getInstance();
		ArrayList<Vehicle> list = vehicleDao.getVehicleAll();
	%>
    <section id="join">
        <h2>롯데렌터카 단기렌터카</h2>
        <table border="1">
			<thead>
				<tr>
					<td>차량번호</td>
					<td>지점</td>
					<td>브랜드</td>
					<td>차종</td>
					<td>기간</td>
					<td>가격</td>
				</tr>
			</thead>
			<%
			for (Vehicle vehicle : list) {
			%>
			<tr>
				<td><a href="booking?vehicle_number=<%=vehicle.getVehicle_number()%>"><%=vehicle.getVehicle_number()%></a></td>
				<td><%=vehicle.getVenue_id()%></td>
				<td><%=vehicle.getCompany()%></td>
				<td><%=vehicle.getType()%></td>
				<td><%=vehicle.getPeriod() %></td>
				<td><%=vehicle.getMoney() %></td>
			</tr>
			<%
			}
			%>
			<tbody>

			</tbody>
		</table>
    </section>
    <jsp:include page="footer"></jsp:include>
</body>
</html>