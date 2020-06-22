<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="javax.servlet.http.HttpSession"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import = "com.connorskorburg.showproject.services.SongService" %>
<%@ page import = "com.connorskorburg.showproject.models.Song" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Your New Song</title>
	<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
</head>
<body>
<div class="text-center">
	<div class="container ml-5 py-3 d-inline-block">
		<h3>Title: <c:out value="${song.title}"/></h3>
		<h3>Artist: <c:out value="${song.artist}"/></h3>
		<h3>Year: <c:out value="${song.year}"/></h3>
	</div>
	<div class="container ml-5 p-3 d-inline-block">
		<form action="updateSong" class="d-inline-block" method=POST>
			<input class="form-control mb-3" name="title" placeholder="Title" value=<c:out value="${song.title }" />>
			<input class="form-control mb-3" name="artist" placeholder="Artist" value=<c:out value="${song.artist }" />>
			<input class="form-control mb-3" name="year" placeholder="Year" value=<c:out value="${song.year }" />>
			<input type="hidden" name="id" value=<c:out value="${song.id }" />>
			<button type="submit" class="btn btn-block btn-dark">Update</button>
		</form>
	</div><div class="container ml-5 d-inline-block">
		<form action="deleteSong" class="d-inline-block" method=POST>
			<input type="hidden" name="id" value=<c:out value="${song.id }" />>
			<button type="submit" class="btn btn-block btn-danger">Delete</button>
		</form>
	</div>
</div>
</body>
</html>