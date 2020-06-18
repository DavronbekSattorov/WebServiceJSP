<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Questionnaire</title>
</head>
<body>

<form action="SimpleServlet" method="post">

		<p>(*)- it means mandatory</p>
		Name: <input type="text" name="uname" width="30" /> Surname: <input
			type="text" name="sname" width="30" />

		<p>Who is a largest Web services provider?</p>
		<input type="checkbox" name="provider" value="Amazon">Amazon<br>
		<input type="checkbox" name="provider" value="Microsoft">Microsoft<br>
		<br>

		<p>
			Give an example of the industry that uses web services for
			innovations.(*) : <input type="text" name="question1" />
		</p>
		<br>
		<p style="color: red;">${errorMessage1}</p>
		<p>
			Give a short description of how web services are used in companies -
			you should base your answer on a real life story.(*) : <input
				type="text" name="question2" />
		</p>
		<br>
		<p style="color: red;">${errorMessage2}</p>




		Select File:<input type="file" name="fname" /><br />
		<p>
			<input type="submit" value="submit" />
		</p>

	</form>
	<p style="color: red;">${errorMessage3}</p>
	<br>
	<h5>
		Server current time:
		<%=new java.util.Date()%></h5>

</body>
</html>