<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, java.util.Collections"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2 class="p-3 ml-4 mt-3">Your Gold: <c:out value="${gold}" /></h2>
	<div class="text-center">
		<div class="wrapper p-3">
			<h3>Farm</h3>
			<p>(earns 10-20 gold)</p>
			<form action="/processActivities" method=POST>
				<input type=hidden name="activity" value="farm">
				<button type="submit" class="btn btn-primary">Find Gold!</button>
			</form>
		</div><div class="wrapper p-3">
			<h3>Cave</h3>
			<p>(earns 5-10 gold)</p>
			<form action="/processActivities" method=POST>
				<input type=hidden name="activity" value="cave">
				<button type="submit" class="btn btn-primary">Find Gold!</button>
			</form>
		</div><div class="wrapper p-3">
			<h3>House</h3>
			<p>(earns 2-5 gold)</p>
			<form action="/processActivities" method=POST>
				<input type=hidden name="activity" value="house">
				<button type="submit" class="btn btn-primary">Find Gold!</button>
			</form>
		</div><div class="wrapper p-3">
			<h3>Casino!</h3>
			<p>(earns/takes 0-50 gold)</p>
			<form action="/processActivities" method=POST>
				<input type=hidden name="activity" value="casino">
				<button type="submit" class="btn btn-primary">Find Gold!</button>
			</form>
		</div>
	</div>
	<h2 class="p-3 ml-4">Activities: </h2>
	<div class="activities p-2">
		<% ArrayList<String> goldDisplay = (ArrayList<String>) session.getAttribute("goldDisplay"); %>
		<% for(int i = goldDisplay.size() - 1; i >= 0; i--){ %>
			<% if(goldDisplay.get(i).indexOf("-") != -1){ %>
				<p class="text-danger"><%= goldDisplay.get(i) %></p>
			<% } %>
			<% if(goldDisplay.get(i).indexOf("-") == -1) { %>
				<p class="text-success"><%= goldDisplay.get(i) %></p>
			<% } %>
		<% } %>
	</div>
</body>
</html>