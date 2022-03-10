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

    if(session.getAttribute("username") == null) {
        response.sendRedirect("index.jsp");
    }
%>
<h1>Welcome ${username}</h1>

<a href="videos.jsp">Videos here</a><br>

<form action="logout">
    <input type="submit" value="logout">
</form>
</body>
</html>