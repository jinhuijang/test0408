<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/pro21/test/memberInfo.do">
		<h1 align="center">회원가입창</h1>
		<table align="center">
			<tr>
				<td width="200"><p align="right">아이디</td>
				<td width="400"><input type="text" name="userID"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">비밀번호</td>
				<td width="400"><input type="password" name="passwd"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이름</td>
				<td width="400"><input type="text" name="name"></td>
			</tr>
			<tr>
				<td width="200"><p align="right">이메일</td>
				<td width="400"><input type="text" name="email"></td>
			</tr>
		</table>
		<input type="submit" value="입력">
	</form>
</body>
</html>