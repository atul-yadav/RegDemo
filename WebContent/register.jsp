<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Reg Form</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="atulregister" method="post">
			<table style="with: 50%">
				<tr>
					<td>name</td>
					<td><input type="text" name="nm" /></td>
				</tr>
				<tr>
					<td>userName</td>
					<td><input type="text" name="u1" /></td>
				</tr>
				<tr>
					<td>password</td>
					<td><input type="password" name="pass" /></td>
				</tr>
					<tr>
					<td>mobile.No</td>
					<td><input type="text" name="mobile" /></td>
				</tr>
			  </table>
			<input type="submit" value="Submit" /></form><a href="login.jsp">Login</a>
</body>
</html>