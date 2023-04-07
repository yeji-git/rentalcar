<%@page import="client.Client"%>
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
	<%
	Client log = (Client) session.getAttribute("log");
	%>
    <section id="join">
        <h2><%=log.getName()%> 님 환영합니다.</h2>
        <form method="POST" action="../service">
       		<input type="hidden" name="command" value="mypage">
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="client_id" id="client_id" value="<%=log.getClient_id()%>"></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="text" name="password" id="password" value="<%=log.getPassword()%>"></td>
                </tr>
                <tr>
                    <td>이름</td>
                    <td><input type="text" name="name" id="name" value="<%=log.getName()%>"></td>
                </tr>
                <tr>
                    <td>휴대전화</td>
                    <td><input type="text" name="phone" id="phone" value="<%=log.getPhone()%>"></td>
                </tr>
                <tr>
                    <td>주소</td>
                    <td><input type="text" name="address" id="address" value="<%=log.getAddress()%>"></td>
                </tr>
            </table>
            <div>
            	<input type="button" value="수정">
            </div>
        </form>
    </section>
    <script type="text/javascript" src="../resources/validation.js"></script>
    <jsp:include page="footer"></jsp:include>
</body>
</html>