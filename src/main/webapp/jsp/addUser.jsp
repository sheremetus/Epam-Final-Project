<%--
  Created by IntelliJ IDEA.
  User: kirja
  Date: 30.06.2022
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        <%@include file='/css/registration.css' %>
    </style>
</head>

<body>
<div>
    <h1>Please sign in or sign up!</h1>
    <form method="post" action="/session" class="subform">

        <input type="hidden"  name="command" value="registration"/>

        <p>
            <label for="login-up">Login</label>
            <input class="input-field" type="text" id="login-up" name="login"/>
        </p>
        <p>
            <label for="password-up">Password</label>
            <input class="input-field" type="text" id="password-up" name="password"/>
        </p>
        <input type="submit" value="Sign up" />
    </form>

    <br><br>


    <form method="post" action="/session" class="subform">


            <input type="hidden"  name="command" value="authorization"/>
        <p>
            <label for="login">Login</label>
            <input class="input-field" type="text" id="login" name="login"/>
        </p>
        <p>
            <label for="password">Password</label>
            <input class="input-field" type="text" id="password" name="password"/>
        </p>

        <input type="submit" value="Sign in"/>
    </form>
</div>
</body>
</html>