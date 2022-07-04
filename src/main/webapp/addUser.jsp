<%--
  Created by IntelliJ IDEA.
  User: kirja
  Date: 30.06.2022
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div >
    <div>
        Please add user
    </div>
    <form method="post" action="/users">
        <label for="login">Login
            <input class="input-field" type="text" id="login" name="login">
        </label>
        <label for="password">Password
            <input class="input-field" type="text" id="password" name="password">
        </label>
        <input type="submit" value="Add user">
    </form>
</div>
</body>
</html>