<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Product</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link href="/css/style.css" type="text/css" rel="stylesheet">
</head>
<body>
	<div class="container p-5 w-50">
		<h2><c:out value="${product.name}"/></h2>
		<div class="left">
			<h5>Categories</h5>
			<ul>
			<c:forEach items="${prod_categories}" var="p_cat">
				<li><c:out value="${p_cat.name }"/></li>
			</c:forEach>
			</ul>
		</div>
		<div class="right">
			<h5>Add Category: </h5>
			<form action="/addCategoryToProduct" method=POST>
				<select name="category_id" class="form-control mb-3">
					<c:forEach items="${categories}" var="cat">
						<option value="<c:out value="${cat.id}"/>" class="form-control mb-3"><c:out value="${cat.name}"/></option>
					</c:forEach>
				</select>
				<input type="hidden" name="product_id" value="<c:out value="${product.id}"/>">
				<button type="submit" class="btn btn-primary mb-3">Add</button>
			</form>
		</div>
	</div>
</body>
</html>