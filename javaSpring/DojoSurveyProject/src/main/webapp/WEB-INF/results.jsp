<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Results</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="css/index.css">
</head>
<body class="bg-dark">
	<div class="p-5">
		<div id="results">
			<h1 class="text-info">Results</h1>
			<h3 class="text-white">Name: <span class="text-secondary"><c:out value="${name}" /></span></h3>
			<h3 class="text-white">Dojo Location: <span class="text-secondary"><c:out value="${location}" /></span></h3>
			<h3 class="text-white">Favorite Language: <span class="text-secondary"><c:out value="${language}" /></span></h3>
			<h3 class="text-white">Comment: <span class="text-secondary"><c:out value="${comment}" /></span></h3>
			<a role=button href="/" class="btn btn-light">Go Back</a>
		</div>
	</div>
</body>
</html>