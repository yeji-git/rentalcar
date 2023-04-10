<%@page import="vehicle.Vehicle"%>
<%@page import="vehicle.controller.VehicleDao"%>
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
	String vehicle_number = request.getParameter("vehicle_number");

	VehicleDao vehicleDao = VehicleDao.getInstance();
	Vehicle vehicle = vehicleDao.getVehicleByNumber(vehicle_number);
	
	System.out.println(vehicle_number);
	%>
	<section>
		<h2>예약하기</h2>
		<form method="POST" action="../service">
			<input type="hidden" name="command" value="booking">
			<table>
				<tr>
					<th>차량번호</th>
					<td><%=vehicle_number%></td>
				</tr>
				<tr>
					<th>지점</th>
					<td><%=vehicle.getVenue_id()%></td>
				</tr>
				<tr>
					<th>브랜드</th>
					<td><%=vehicle.getCompany()%></td>
				</tr>
				<tr>
					<th>차종</th>
					<td><%=vehicle.getType()%></td>
				</tr>
				<tr>
					<th>기간</th>
					<td><%=vehicle.getPeriod()%></td>
				</tr>
				<tr>
					<th>가격</th>
					<td><%=vehicle.getMoney()%></td>
				</tr>
				<tr>
					<th>대여일시</th>
					<td><input type="date" name=""><input type="time"></td>
				</tr>
				<tr>
					<th>반납일시</th>
					<td><input type="date"><input type="time"></td>
				</tr>
			</table>
		</form>
		<div>
			<p>총 금액</p>
			<p><%%></p>
		</div>
	</section>
	<jsp:include page="footer"></jsp:include>
</body>
</html>