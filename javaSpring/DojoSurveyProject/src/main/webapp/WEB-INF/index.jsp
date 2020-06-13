<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="css/index.css">
</head>
<body class="bg-dark">
	<div class="p-5">
		<form action="/processSurvey" method=POST>
			<span class="text-white">Your Name: </span>
			<h5 class="text-danger font-weight-bold"><c:out value="${error}" /></h5>
			<input class="form-control mb-3" type="text" name="name">
			<span class="text-white">Dojo Location: </span>
			<select class="form-control mb-3" name="location">
				<option value="San Jose, CA">San Jose, CA</option>
				<option value="Arlington, VA">Arlington, VA</option>
				<option value="Bellevue, WA">Bellevue, WA</option>
				<option value="Boise, ID">Boise, ID</option>
				<option value="Chicago, IL">Chicago, IL</option>
				<option value="Dallas, TX">Dallas, TX</option>
				<option value="Los Angeles, CA">Los Angeles, CA</option>
				<option value="Oakland, CA">Oakland, CA</option>
				<option value="Orange County, CA">Orange County, CA</option>
				<option value="Seattle, WA">Seattle, WA</option>
				<option value="Silicon Valley, CA">Silicon Valley, CA</option>
				<option value="Tulsa, OK">Tulsa, OK</option>
				<option value="Online">Online</option>
			</select>
			<span class="text-white">Favorite Language: </span>
			<select class="form-control mb-3" name="language">
				<option value="Python">Python</option>
				<option value="Java">Java</option>
				<option value="C">C</option>
				<option value="JavaScript">JavaScript</option>
				<option value="Ruby">Ruby</option>
				<option value="PHP">PHP</option>
				<option value="C++">C++</option>
			</select>
			<span class="text-white">Comment(optional): </span>
			<textarea name="comment" class="mb-3 form-control"></textarea>
			<button type="submit" class="btn btn-light">Submit</button>
		</form>
	</div>

</body>
</html>