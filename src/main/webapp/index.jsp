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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body class="bg">

    <header>
        <a href="#"><img src="img/zeon-gundam-logo.png" class="logo"></a>
        <div class="menu-icons">
            <a href="https://twitter.com" target="_blank"><i class="fa fa-twitter-square fa-2x"></i></a>
            <a href="https://www.pinterest.com" target="_blank"><i class="fa fa-pinterest-square fa-2x"></i></a>
            <a href="https://www.facebook.com" target="_blank"><i id="right-border" class="fa fa-facebook-square fa-2x"></i></a>
            <a href="#"><i class="fa fa-sign-in fa-2x"></i></a>
        </div>
    </header>
    <section class="login-section">
        <div>
            <h1 id="h1-login">CONNECT.BUILD.LEARN</h1>
            <form action="login" method="post" class="login-form">
                <input type="text" name="username" placeholder="USERNAME"><br>
                <input type="password" name="password" placeholder="PASSWORD"><br>
                <input type="submit" value="login">
            </form>
            <form action="signup" method="post" class="signup-btn">
                <input type="submit" value="SIGN UP">
            </form>
        </div>
    </section>
    <footer class="login-footer">
        <h2>PROJECT GUNDAM</h2>
    </footer>
</body>
</html>