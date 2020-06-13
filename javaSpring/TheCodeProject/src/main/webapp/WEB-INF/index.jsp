<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container text-center p-5 w-25">
	<h4 class="text-danger"><c:out value="${error}" /></h4>
		<h4>What is the Code?</h4>
		<form action="/code" method=POST>
			<input class="form-control mb-3" type="text" name="code">
			<button class="btn btn-dark" type="submit">Try Code</button>
		</form>
	</div>
</body>
</html>