<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>New Ninja</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container p-5 w-50">
		<form action="/createNinja" method=POST>
			<span class="h3">New Ninja</span> <a href="/dojos/new" role="button" class="btn btn-sm btn-success mb-1">Add Dojo</a>
			<p>Dojo:</p> 
			<select name="dojo_id" class="form-control mb-3">
			<c:forEach items="${dojos}" var="dojo">	
				<option value="<c:out value="${dojo.id}" />"><c:out value="${dojo.name}" /></option>
			</c:forEach>
			</select>
			<input type="text" class="form-control mb-3" placeholder="First Name" name="firstName">
			<input type="text" class="form-control mb-3" placeholder="Last Name" name="lastName">
			<input type="text" class="form-control mb-3" placeholder="Age" name="age">
			<button type="submit" class="btn btn-dark">Create</button>
		</form>
	</div>
</body>
</html>