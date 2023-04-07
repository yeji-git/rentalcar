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
	ClientDao clientDao = ClientDao.getInstance();
	
	String client_id = request.getParameter("client_id");
	String password = request.getParameter("password");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	%>
    <section id="join">
        <h2>롯데렌터카 회원가입</h2>
        <form method="POST" action="../service">
       		<input type="hidden" name="command" value="join">
            <table>
                <tr>
                    <td>아이디</td>
                    <td><input type="text" name="client_id" id="client_id" value="<%=client_id != null ? client_id : "" %> " <%=client_id == null ? "autofocus" : ""%>></td>
                </tr>
                <tr>
                    <td>비밀번호</td>
                    <td><input type="text" name="password" id="password" value="<%=password != null ? password : "" %> " <%=password == null ? "autofocus" : ""%>></td>
                </tr>
                <tr>
                    <td>이름</td>
                    <td><input type="text" name="name" id="name" value="<%=name != null ? name : "" %> " <%=name == null ? "autofocus" : ""%>></td>
                </tr>
                <tr>
                    <td>휴대전화</td>
                    <td><input type="text" name="phone" id="phone" value="<%=phone != null ? phone : "" %> " <%=phone == null ? "autofocus" : ""%>></td>
                </tr>
                <tr>
                    <td>주소</td>
                    <td><input type="text" name="address" id="address" value="<%=address != null ? address : "" %> " <%=address == null ? "autofocus" : ""%>></td>
                </tr>
            </table>
            <div>
            	<input type="button" value="회원가입" onclick="checkValues(form)">
            </div>
        </form>
    </section>
    <script type="text/javascript" src="../resources/validation.js"></script>
    <jsp:include page="footer"></jsp:include>
</body>
</html>