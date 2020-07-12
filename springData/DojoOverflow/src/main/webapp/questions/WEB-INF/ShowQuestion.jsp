<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Question</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/main.css">
</head>
<body>
	<div class="container w-50 p-3">
		<h2 class="text-center mb-3"><c:out value="${question.question}" /></h2>
		<h4 class="mb-3">Tags: 
			<c:forEach items="${question.tags}" var="t">
				<span><c:out value="${t.subject}" /></span>
			</c:forEach>
		</h4>
		<div class="left p-2">
			<table class="table">
				<thead>
					<h4>Answers</h4>
				</thead>
			</table>		
		</div><div class="right p-2">
			<h4>Add your answer: </h4>
			<form action="/addAnswer" method=POST>
				<input type="hidden" name="question_id" value="<c:out value="${question.id}" />">
				<textarea name="answer" placeholder="Answer" class="form-control mb-2"></textarea>
				<button type="submit" class="btn btn-info">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>