<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>CheckerBoard</title>
	<link rel=stylesheet href="Checkerboard.css">
</head>
<body>
	<% String width = request.getParameter("width"); %>
	<% String height = request.getParameter("height"); %>
	<div class="container">
		<h1>Checkerboard: <%= width%>W X <%=height %>H</h1>
		<table class="container">
		<% for(int i = 0; i < Integer.parseInt(height); i++) { %>
				<tr> 
				<% for(int x = 0; x < Integer.parseInt(width); x++) { %>
					<% if(i % 2 == 0){%>
						<% if(x % 2 == 0){%>
						 	<td class="tb-data blue"></td>						
						<% } %>
						<% if(x % 2 == 1) {%>
							<td class="tb-data green"></td>
						<% } %>
					<% } %>
					<% if(i % 2 == 1){%>
						<% if(x % 2 == 0){%>
							<td class="tb-data green"></td>
						<% } %>
						<% if(x % 2 == 1) {%>
						 	<td class="tb-data blue"></td>						
						<% } %>
					<% } %>
				<% } %>
				</tr>
		<% } %>
		</table>
	</div>
</body>
</html>