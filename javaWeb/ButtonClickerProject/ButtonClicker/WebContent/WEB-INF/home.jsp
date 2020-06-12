<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Button Clicker</title>
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<% Integer count = (Integer) session.getAttribute("count"); %>
	<div class="container-fluid text-center p-5">
		<a href="/ButtonClicker/Home" role="button" class="btn btn-dark my-3">Click Me!</a>
		<h3>You have clicked me <%= count %> times!</h3>
	</div>
</body>
</html>