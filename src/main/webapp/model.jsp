<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>PROJECT GUNDAM</title>
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.min.css"
    />
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/normalize/7.0.0/normalize.min.css"
    />
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
            href="https://fonts.googleapis.com/css2?family=Teko:wght@400;500;600;700&display=swap"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="css/welcome.css">
    <link rel="stylesheet" href="css/model.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body class="bg-model">
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

    if(session.getAttribute("name") == null) {
        response.sendRedirect("index.jsp");
    }
%>
    <header>
        <div class="welcome-logo">
            <a href="#"><img src="img/zeon-gundam-black.png" class="logo"></a>
            <h1 id="h1-welcome">WELCOME, ${name}</h1>
        </div>
        <div class="menu-icons">
            <a href="https://twitter.com" target="_blank"><i class="fa fa-twitter-square fa-2x"></i></a>
            <a href="https://www.pinterest.com" target="_blank"><i class="fa fa-pinterest-square fa-2x"></i></a>
            <a href="https://www.facebook.com" target="_blank"><i id="right-border" class="fa fa-facebook-square fa-2x"></i></a>
            <form action="logout">
                <button type="submit" class="logout-btn">
                    <i class="fa fa-sign-in fa-2x"></i>
                </button>
            </form>
        </div>
    </header>
    <section class="model-section">
        <div class="model-info">
            <h1>${gname}</h1>
            <p><strong>MODEL:</strong> ${model}</p>
            <p><strong>PILOT:</strong> ${pilot}</p>
            <p><strong>DESCRIPTION:</strong></p>
            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit,<br>
                exercitation ullamco laboris dolore eu fugiat nulla officia<br>
                deserunt mollit anim id est laborum.</p>
            <p><strong>UPLOADED BY USER:</strong> ${user}</p>

            <a href="welcome.jsp" class="back-btn"><i class="fa fa-arrow-circle-left fa-lg"></i></a>
        </div>
        <img src="img/gundam/${model}.jpg" class="gundam-image">
    </section>

    <footer class="welcome-footer">
        <h2>PROJECT GUNDAM</h2>
    </footer>
</body>
</html>