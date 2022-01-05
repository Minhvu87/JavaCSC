<%@ tag language="java" pageEncoding="UTF-8"%>
<%@attribute name="title" required="true"%>
<%@attribute name="content" required="true" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title}</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/css.css">
</head>
<body>
	<div class="title">
		<div class="container">
			<div class="brand">
				<a href="${pageContext.request.contextPath}"> MODULE 3: LẬP
					TRÌNH WEB VỚI JAVA </a>
			</div>
		</div>
	</div>
	<div class="sidebar">
		<ul>
			<li><a href="/javaweb/Chapter2/helloworld.html">Hello World</a></li>
			<li><a href="/javaweb/Chapter2/sumtwonumbers.html">Sum Two Numbers</a></li>
			<li><a href="/javaweb/Chapter2/summultinumbers.html">Sum Multiple Numbers</a></li>
			<li><a href="register.jsp">Register</a></li>
			<li><a href="login.jsp">Login</a></li>
			<li><a href="multiplicationtable.jsp">Multiplication Table</a></li>
			<li><a href="/javaweb/upload.html">Upload Image</a></li>
			<li><a href="/javaweb/upload/multi.html">Multiple Upload Image</a></li>
			<li><a href="template.jsp">Template Example</a></li>
			<li><a href="/javaweb/admin/publisher.html">Publisher</a>
			<li><a href="/javaweb/admin/category.html">Category</a></li>
			<li><a href="/javaweb/home.html">Home</a></li>
			<li><a href="/javaweb/auth/register.html">Register</a></li>
			<li><a href="/javaweb/auth/logon.html">Log On</a></li>
			<li><a href="/javaweb/admin/invoice.html">Invoice</a></li>
		</ul>
	</div>
	<div class="main">
		<jsp:invoke fragment="content" />
	</div>
</body>
</html>