<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Ninja Gold</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<h2 class="p-3 ml-4 mt-3">Your Gold: </h2>
	<div class="text-center">
		<div class="wrapper p-3">
			<h3>Farm</h3>
			<p>(earns 10-20 gold)</p>
			<a role=button href="/addFarm" class="btn btn-primary">Find Gold!</a>
		</div><div class="wrapper p-3">
			<h3>Cave</h3>
			<p>(earns 5-10 gold)</p>
			<a role=button href="addCave" class="btn btn-primary">Find Gold!</a>
		</div><div class="wrapper p-3">
			<h3>House</h3>
			<p>(earns 2-5 gold)</p>
			<a role=button href="addHouse" class="btn btn-primary">Find Gold!</a>
		</div><div class="wrapper p-3">
			<h3>Casino!</h3>
			<p>(earns/takes 0-50 gold)</p>
			<a role=button href="addCasino" class="btn btn-primary">Find Gold!</a>
		</div>
	</div>
	<h2 class="p-3 ml-4">Activities: </h2>
	<div class="activities p-2">
		
	</div>
</body>
</html>