<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Gundam Club</title>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
            href="https://fonts.googleapis.com/css2?family=Teko:wght@400;500;600;700&display=swap"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="css\styles.css">
    <script
            src="https://kit.fontawesome.com/8615f597a8.js"
            crossorigin="anonymous"
    ></script>
</head>
<body>
<header>
    <nav class="nav">
        <ul>
            <li><a href="#">Events</a></li>
            <li><a href="#">Forums</a></li>
            <li>
                <a href="#" class="logo"><img src="img/logo-transparent.png" alt="logo" /></a>
            </li>
            <li><a href="#">Models</a></li>
            <li><a href="#">About</a></li>
        </ul>
    </nav>
</header>
<section class="main-section">
    <div class="circle-background">
        <img src="img/gundam-unicorn-transparent.png" alt="gundam unicorn" class="main-img"/>
    </div>
    <div class="login-field">
        <form action="login" method="post">
            Enter username: <input type="text" name="username"><br>
            Enter password: <input type="password" name="password"><br>
            <input type="submit" value="login">
        </form>
    </div>
</section>
<footer>

</footer>

</body>
</html>