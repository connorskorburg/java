<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Category</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link href="/css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="container p-5 w-50">
		<h2><c:out value="${category.name}"/></h2>
		<div class="left">
			<h5>Products</h5>
		</div>
		<div class="right">
			<h5>Add Product: </h5>
			<form action="/addProduct" method=POST>
				<select name="product_id" class="form-control mb-3">
					<c:forEach items="${products}" var="prod">
						<option value="<c:out value="${prod.id}"/>" class="form-control mb-3"><c:out value="${prod.name}"/></option>
					</c:forEach>
				</select>
				<button type="submit" class="btn btn-primary mb-3">Add</button>
			</form>
		</div>
	</div>
</body>
</html>