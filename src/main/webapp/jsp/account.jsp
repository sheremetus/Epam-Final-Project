<%--
  Created by IntelliJ IDEA.
  User: kirja
  Date: 05.09.2022
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        <%@include file='/css/mainPage.css' %>
    </style>
</head>
<body>
<header>
    <div class="header-container">
        <div class="logo">
            <img src="img/logo.png" alt="logo">
        </div>
        <input type="checkbox" id="menu-checkbox">
        <%--        Тег< nav> предназначен для обозначения основной навигации по сайту.--%>
        <%--        Как правило, этим главное меню, которое является сквозным для всего сайта--%>
        <%--        аттрибут role наиболее четко показывает синтаксическое применение элемента --%>
        <nav role="navigation">
            <label for="menu-checkbox" class="toggle-button"
                   data-open="Menu" data-close="Close onclick">
            </label>
            <ul class="main-menu">
                <li><a href="jsp/mainPage.jsp">HOME</a></li>
                <li><a href="jsp/account.jsp">PERSONAL ACCOUNT </a></li>
                <li><a href="jsp/booking.jsp">ROOMS</a></li>
                <li><a href="jsp/entertainment.jsp">EAT,DRINK & DANCE</a></li>
                <li><a href="jsp/contact.jsp">CONTACT US</a></li>
            </ul>
        </nav>
    </div>
</header>


<h3>Please fill in information about yourself</h3>
<form method="post" action="/session" class="subform">

    <input type="hidden" name="command" value="info_about_guest"/>

    <p>
        <label for="name">Name</label>
        <input class="input-field" type="text" id="name" name="name"/>
    </p>
    <br><br><br>
    <p>
        <label for="surname">Surname</label>
        <input class="input-field" type="text" id="surname" name="surname"/>
    </p>
    <br>
    <input type="submit" value="Refresh"/>
</form>

</body>
</html>
