<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Module 03 LẬP TRÌNH WEB VỚI JAVA</title>
<link rel="stylesheet" type="text/css" href="/javaweb/css/css.css">
</head>
<body>
	<div class="title">
		<div class="container">
			<div class="brand">
				<a href="/javaweb">Module 3</a>
			</div>
		</div>
	</div>
	<div class="sidebar">
		<ul>
			<li><a href="/javaweb/Chapter2/helloworld.html">Hello World</a></li>
			<li><a href="/javaweb/Chapter2/sumtwonumbers.html">Sum Two Numbers</a></li>
			<li><a href="/javaweb/Chapter2/summultinumbers.html">Sum Multiple Numbers</a></li>
			<li><a href="/javaweb/Chapter3/register.jsp">Register</a></li>
			<li><a href="/javaweb/Chapter3/login.jsp">Login</a></li>
			<li><a href="/javaweb/Chapter3/multiplicationtable.jsp">Multiplication Table</a></li>
			<li><a href="/javaweb/upload.html">Upload Image</a></li>
			<li><a href="/javaweb/upload/multi.html">Multiple Upload Image</a></li>
			<li><a href="/javaweb/Chapter3/template.jsp">Template Example</a></li>
			<li><a href="/javaweb/admin/publisher.html">Publisher</a>
			<li><a href="/javaweb/admin/category.html">Category</a></li>
			<li><a href="/javaweb/home.html">Home</a></li>
			<li><a href="/javaweb/auth/register.html">Register</a></li>
			<li><a href="/javaweb/auth/logon.html">Log On</a></li>
			<li><a href="/javaweb/admin/invoice.html">Invoice</a></li>
		</ul>
	</div>
	<div class="main">
		<form method="post" class="form">
			<p>
				<label>Username</label> <input type="text" name="usr">
			</p>
			<p>
				<label>Password</label> <input type="password" name="pwd">
			</p>
			<p>
				<button>Login</button>
			</p>
		</form>
		<c:if test="${pageContext.request.method == 'POST'}">
			<p>Username: ${param.usr}</p>
			<p>Password: ${param.pwd}</p>
		</c:if>
	</div>
</body>
</html>

