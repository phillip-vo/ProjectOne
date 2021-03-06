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
    <link rel="stylesheet" href="css/signup.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

%>
<header>
    <div class="welcome-logo">
        <a href="index.jsp"><img src="img/zeon-gundam-black.png" class="logo"></a>
    </div>
    <div class="menu-icons">
        <a href="https://twitter.com" target="_blank"><i class="fa fa-twitter-square fa-2x"></i></a>
        <a href="https://www.pinterest.com" target="_blank"><i class="fa fa-pinterest-square fa-2x"></i></a>
        <a href="https://www.facebook.com" target="_blank"><i id="right-border" class="fa fa-facebook-square fa-2x"></i></a>
        <a href="index.jsp"><i class="fa fa-sign-in fa-2x"></i></a>
    </div>
</header>
<section class="signup-section">
    <form action="signup" method="post" class="signup-form">
        <div>
            <h1>REGISTER</h1>
            <p>PLEASE FILL IN THIS FORM TO CREATE AN ACCOUNT.</p>
            <input type="text" name="name" placeholder="NAME"><br>
            <input type="text" name="email" placeholder="EMAIL"><br>
            <input type="text" name="username" placeholder="USERNAME"><br>
            <input type="password" name="password" placeholder="PASSWORD"><br>
        </div>
        <div>
            <p>ALREADY HAVE AN ACCOUNT? <a href="index.jsp">SIGN IN</a></p>
        </div>
        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
        <button type="submit" class="signup-btn">SIGN UP</button>
    </form>
    <img src="img/gundam-signup.png" alt="https://aaltomies.files.wordpress.com/2016/02/li8a02ey.jpg" class="signup-image">
</section>

<footer class="login-footer signup-footer">
    <h2>PROJECT GUNDAM</h2>
</footer>
</body>
</html>