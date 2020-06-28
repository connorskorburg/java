<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Dojo</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container p-5 w-50">
		<form action="/createDojo" method=POST>
			<h3>New Dojo</h3> <a href="/ninjas/new" role="button" class="btn btn-primary mb-3">Add Ninja</a>
			<input type="text" class="form-control mb-3" placeholder="Name" name="dojoName">
			<button type="submit" class="btn btn-dark">Create</button>
		</form>
	</div>

</body>
</html>