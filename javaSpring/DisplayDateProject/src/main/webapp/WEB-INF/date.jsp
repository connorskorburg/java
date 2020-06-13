<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Date</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<script src="js/date.js" defer></script>
</head>
<body class="bg-success">
	<div class="container text-center p-5">
		<h1 class="mt-5 text-white font-weight-bold"><fmt:formatDate type = "date" 
         pattern="EEEE" value = "${Date()}" />, the <fmt:formatDate type = "date" 
         pattern="dd" value = "${Date()}" /> of <fmt:formatDate type = "date" 
         pattern="MMMM" value = "${Date()}" />, <fmt:formatDate type = "date" 
         pattern="yyyy" value = "${Date()}" /></h1> 
	</div>
</body>
</html>