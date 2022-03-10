<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>welcome</title>
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

    if(session.getAttribute("name") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<h1>${gname}</h1>
<p>Model: ${model}</p>
<p>Pilot: ${pilot}</p>
<img src="img/${model}.png">

<form action="logout">
    <input type="submit" value="logout">
</form>
<a href="welcome.jsp">Back</a>
</body>
</html>