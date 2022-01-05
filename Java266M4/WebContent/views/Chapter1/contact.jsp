<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" class="form">
		<p>
			<label>Full Name</label> <input type="text" name="fullName" />
		</p>
		<p>
			<label>Email</label> <input type="email" name="email" />
		</p>
		<p>
			<label>Gender</label> <select name="gender">
				<option value="0">Male</option>
				<option value="1">Female</option>
			</select>
		</p>
		<p>
			<label>Subject</label> <input type="text" name="subject" />
		</p>
		<p>
			<label>Message</label> <input type="text" name="message" />
		</p>
		<p>
			<button>Send</button>
		</p>
	</form>
</body>
</html>