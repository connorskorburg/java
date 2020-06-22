<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>All Songs</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
	<h3 class="p-3">All Songs</h3>
	<table class="table">
		<thead class="thead-primary">
			<tr>
				<th>Title</th>
				<th>Artist</th>
				<th>Year</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${songs}" var="song">
			<tr>
				<td><c:out value="${song.title }" /></td>
				<td><c:out value="${song.artist }" /></td>
				<td><c:out value="${song.year }" /></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>