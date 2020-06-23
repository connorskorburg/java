<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New License</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container p-5 w-50">
		<form action="/createLicense" method=POST>
			<h3>New License</h3>
			<select name="person" class="mb-3">
			</select>
			<input type="text" class="form-control mb-3" placeholder="License Number" name="number">
			<input type="text" class="form-control mb-3" placeholder="State" name="state">
			Expiration Date: <input type="date" class="form-control mb-3" name="expirationDate">
			<button type="submit" class="btn btn-primary">Create</button>
		</form>
	</div>
</body>
</html>