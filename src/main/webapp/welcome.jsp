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
<h1>Welcome ${name}</h1>

<form action="search" method="post">
    Enter model#: <input type="text" name="model" placeholder="model#">
    <input type="submit" value="search">
</form>
<br>
<form action="logout">
    <input type="submit" value="logout">
</form>
</body>
</html>