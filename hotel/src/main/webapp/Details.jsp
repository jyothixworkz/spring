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
	<h1>${size }</h1>
	<table border="3">
		<thead>
			<tr>

				<th>ID</th>
				<th>Name</th>
			</tr>
			<c:forEach items="${details }" var="m">

				<tr>

					<th>${m.id }</th>
					<th>${m.name }</th>




				</tr>




			</c:forEach>
	</table>

</body>
</html>