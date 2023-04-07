<%@page import="client.Client"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>롯데렌터카</title>
<link rel="shortcut icon" href="../resources/images/favicon.ico">
<link rel="stylesheet" href="../resources/reset.css">
<link rel="stylesheet" href="../resources/style.css">
</head>
<body>
	<%
		Client log = (Client) session.getAttribute("log");
	%>
	<header>
		<div id="logo">
			<h1>
				<a href="/"><img src="../resources/images/logo-header.png"
					alt="롯데렌터카 로고 이미지"></a>
			</h1>
		</div>
		<div id="menu">
			<nav>
				<ul>
					<li><a href="#">단기렌터카</a></li>
					<li><a href="#">신차 장기렌터카</a></li>
					<li><a href="#">CAR뮤니티</a></li>
					<li><a href="#">공지사항</a></li>
				</ul>
			</nav>
		</div>
		<div id="side">
			<nav>
				<ul>
					<%if (log != null) {%>
					<li>
						<form method="POST" action="loginPro.jsp">
							<a href="/"> <input type="hidden" name="command"
								value="logout"> 로그아웃
							</a>
						</form>
					</li>
					<li><a href="mypage">마이페이지</a></li>
					<%}
	            		else {%>
					<li><a href="login">로그인</a></li>
					<li><a href="join">회원가입</a></li>
					<%}%>
				</ul>
			</nav>
		</div>
	</header>
</body>
</html>