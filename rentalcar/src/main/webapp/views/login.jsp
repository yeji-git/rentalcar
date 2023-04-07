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
	<form method="POST" action="loginPro.jsp">
		<input type="text" name="id" placeholder="id">
		<input type="password" name="password" placeholder="password">
		<input type="button" value="로그인" onclick="">
	</form>
	<jsp:include page="footer"></jsp:include>
</body>
</html>