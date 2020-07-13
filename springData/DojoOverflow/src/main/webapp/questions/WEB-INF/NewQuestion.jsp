<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>New Questions</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="/css/main.css">
</head>
<body>
	<div class="container w-50 p-3">
		<form action="/createQuestion" method="POST">
			<h3>What is your question?</h3>
			<textarea class="form-control mb-3" placeholder="Question" name="question"></textarea>
			<input onkeyup="this.value = this.value.toLowerCase();" type="text" class="form-control mb-3" placeholder="Tags" name="tags">
			<button type="submit" class="btn btn-primary d-inline-block font-weight-bold">Submit</button>
			<a href="/questions" role="button" class="btn btn-success font-weight-bold" >All Questions</a>
		</form>
	</div>
</body>
</html>