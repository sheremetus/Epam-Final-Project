<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.epam.hotel.bean.User" %><%--
  Created by IntelliJ IDEA.
  User: kirja
  Date: 01.09.2022
  Time: 17:10
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
                <li><a href="mainPage.jsp">HOME</a></li>
                <li><a href="account.jsp">PERSONAL ACCOUNT </a></li>
                <li><a href="booking.jsp">ROOMS</a></li>
                <li><a href="entertainment.jsp">EAT,DRINK & DANCE</a></li>
                <li><a href="contact.jsp">CONTACT US</a></li>
            </ul>
        </nav>
    </div>
</header>


<c:out value="${requestScope.user.login}"/>


<%--Подключаем jQuery--%>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"
        integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
        crossorigin="anonymous"></script>

</body>
</html>
