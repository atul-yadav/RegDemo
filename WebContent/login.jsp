<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="US-ASCII">
<title>Login</title>
<script type="text/javascript">
function validateForm() {
    var x = document.forms["login"]["username"].value;
    if (x == "") {
        alert("User name must be filled out");
        return false;
    }
    var y = document.forms["login"]["password"].value;
    if (y == "") {
        alert("Password must be filled out");
        return false;
    }
}
</script>
</head>
<body>
	<h1>Login</h1>
	<form name = "login" action="atullogin" onsubmit="return validateForm()" method="post">
		<div class="container">
			<label for="uname"><b>Username</b></label> <input type="text"
				placeholder="Enter Username" name="username" required>
		</div>
		<div>
			<label for="psw"><b>Password</b></label> <input type="password"
				placeholder="Enter Password" name="password" required>
		</div>
		<div>
			<label>
				<button type="submit">Login</button>
			</label>
		</div>
		 
		<div>
			<p>
				<strong>fyou are not a member, first register</strong>
			</p>
		</div>
	</form>
	<button type="button" onclick='location.href = "register.jsp"'>Register</button>
</body>
</html>