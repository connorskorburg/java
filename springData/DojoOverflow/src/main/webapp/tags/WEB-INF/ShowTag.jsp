<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Tag</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
</head>
<body>
	<div class="container w-50 p-3">
		<h2 class="text-center mb-3"><c:out value="${tag.subject}" /></h2>
		<h4 class="mb-3">Questions: 
			<c:forEach items="${tag.questions}" var="q">
				<a href="/questions/<c:out value="${q.id}" />" class="btn mt-1 d-inline-block btn-info font-weight-bold"><c:out value="${q.question}" /></a>
			</c:forEach>
		</h4>
		<a href="/questions" role="button" class="btn btn-warning font-weight-bold p-2 mt-2" >All Questions</a>
	</div>	
</body>
</html>