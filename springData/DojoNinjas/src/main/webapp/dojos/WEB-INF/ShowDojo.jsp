<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Dojo</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container p-5 w-50">
		<h2><c:out value="${dojo.name}" /> Location Ninjas</h2> <a href="/dojos/new" role="button" class="btn btn-light mb-3">Add Dojo</a> <a href="/ninjas/new" role="button" class="btn btn-primary mb-3">Add Ninja</a>
		<table class="table text-center">
			<thead>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
			</thead>
			<c:forEach items="${ninjas}" var="ninja">
			<tr>
				<td><c:out value="${ninja.firstName }"/></td>
				<td><c:out value="${ninja.lastName }" /></td>
				<td><c:out value="${ninja.age}" /></td>
			</tr>
			</c:forEach>
		</table>
	</div> 
</body>
</html>