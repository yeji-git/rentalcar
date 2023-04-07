<%@page import="client.controller.ClientDao"%>
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
	<form method="POST" action="../service">
		<input type="hidden" name="command" value="login">
		<input type="text" name="client_id" placeholder="id">
		<input type="password" name="password" placeholder="password">
		<input type="submit" value="로그인">
	</form>
	<jsp:include page="footer"></jsp:include>
</body>
</html>