<%@page contentType="text/html" pageEncoding="UTF-8"
	errorPage="error.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>${message}</title>
</head>
<body>
	<H1>Login</H1>
	<H1>${message}</H1>
	<form name="userForm" action="/StructWebDemo/Login.do" method="post">
		username : <input type="text" name="username" />
		<p>
			password : <input type="password" name="password" />
		<p>
			<input type="submit" />
	</form>
</body>
</html>