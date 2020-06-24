<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Person</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container p-5 w-50">
		<h2 class="text-center"><c:out value="${person.firstName}" /> <c:out value="${ person.lastName }" /></h2>
		<h5>License Number: <c:out value="${license.number}" /> </h5>
		<h5>State: <c:out value="${license.state}" /> </h5>
		<h5>Expiration Date:
		 <fmt:formatDate type = "date" 
         pattern="MM" value = "${license.expirationDate}" />/<fmt:formatDate type = "date" pattern="dd" value = "${license.expirationDate}" />/<fmt:formatDate type = "date" 
         pattern="yyyy" value = "${license.expirationDate}" /></h5>
	</div>
</body>
</html>