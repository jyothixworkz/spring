<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hai</h1>
<h1>Displaying Criminal Details</h1>
	<h2>${size}</h2>
    <h2>${msg}</h2>
	<table border="2">
		<thead>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
				<th>Country</th>
				<th>CriminalType</th>
				<th>NoOfCases</th>
				<th>Alive</th>
				<th>Gender</th>
				<th>International</th>
				<th>Married</th>
				<th>JailTerm</th>
				<th>WifeName</th>
				<th>RightHandName</th>
				<th>LeftHandName</th>
				<th>PrisonName</th>
				<th>NetWorth</th>
			</tr>
			<c:forEach items="${criminalsdetails}" var="dtos">
			<tr>
			<th>${dtos.id}</th>
			<th>${dtos.name}</th>
			<th>${dtos.age}</th>
			<th>${dtos.country}</th>
			<th>${dtos.type}</th>
			<th>${dtos.noOfCase}</th>
			<th>${dtos.alive}</th>
			<th>${dtos.gender}</th>
			<th>${dtos.international}</th>
			<th>${dtos.married}</th>
			<th>${dtos.jailTerm}</th>
			<th>${dtos.wifeName}</th>
			<th>${dtos.rightHand}</th>
			<th>${dtos.leftHand}</th>
			<th>${dtos.jailName}</th>
			<th>${dtos.netWorth}</th>
			</tr>
			</c:forEach>

		</thead>

</body>
</html>