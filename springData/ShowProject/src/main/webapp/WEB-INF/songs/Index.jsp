<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Songs Home</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<form action="/createSong" method=POST>
			<h3>Create New Song</h3>
			<input type="text" class="form-control mb-3" placeholder="Title" name="title">
			<input type="text" class="form-control mb-3" placeholder="Artist" name="artist">
			<input type="number" class="form-control mb-3" placeholder="Year" name="year">
			<button type="submit" class="btn btn-dark">Submit</button>
		</form>
	</div>
</body>
</html>