<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>${manoj}</h1>
	<table border="2">
		<tr>
			<th>ID</th>
			<th>name</th>

		</tr>
		<c:forEach items="${man}" var="man">
			<tr>
				<th>${man.id }</th>
				<th>${man.name }</th>

			</tr>


		</c:forEach>


	</table>
</body>
</html>