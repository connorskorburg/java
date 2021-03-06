<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Questions Dashboard</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<div class="container w-50 p-3">
		<h3 class="text-center">Questions Dashboard</h3>
		<table class="table mb-3">
			<thead>
				<th>Questions</th>
			</thead>
			<c:forEach items="${questions}" var="q">
			<tr>
				<td><a href="/questions/<c:out value="${q.id}" />" ><c:out value="${q.question}"/></a></td>
				<td>
					<c:forEach items="${q.tags }" var="t">
						<a href="/tags/<c:out value="${t.id}" />" role="button" class="btn d-inline-block btn-warning font-weight-bold"><c:out value="${t.subject}"/> </a>
					</c:forEach>
				</td>
			</tr>
			</c:forEach>
		</table>
		<a href="/questions/new" role="button" class="btn btn-primary font-weight-bold">New Question</a>
	</div>
</body>
</html>