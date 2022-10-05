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
                <c:url value="/jsp/account.jsp" var="account">
                </c:url>

                <c:url value="/jsp/booking.jsp" var="booking">
                </c:url>
                <c:url value="/jsp/contact.jsp" var="contact">
                </c:url>
                <c:url value="/jsp/entertainment.jsp" var="entertainment">
                </c:url>
                <c:url value="/jsp/mainPage.jsp" var="main">
                </c:url>

                <li><a href="<c:out value="${main}"/>">HOME</a></li>
                <li><a href="<c:out value="${account}"/>">PERSONAL ACCOUNT </a></li>
                <li><a href="<c:out value="${booking}"/>">ROOMS</a></li>
                <li><a href="<c:out value="${entertainment}"/>">EAT,DRINK & DANCE</a></li>
                <li><a href="<c:out value="${contact}"/>">CONTACT US</a></li>
            </ul>
        </nav>
    </div>
</header>


<c:out value="${sessionScope.guest.name}"/>
<br>
<br>
<br>
<c:out value="${sessionScope.guest.surname}"/>


<h3>Please fill in information about yourself</h3>
<form method="post" action="/session" class="subform">

    <input type="hidden" name="command" value="info_about_guest"/>
    <input type="hidden" name="user_id" value="${sessionScope.user.id}"/>

    <p>
        <label for="name">Name</label>
        <input class="input-field" type="text" id="name" name="name" placeholder="${sessionScope.guest.name}"/>
    </p>
    <br><br><br>
    <p>
        <label for="surname">Surname</label>
        <input class="input-field" type="text" id="surname" name="surname" placeholder="${sessionScope.guest.surname}"/>
    </p>
    <br>
    <input type="submit" value="Refresh"/>
</form>


<%--Подключаем jQuery--%>
<script src="https://code.jquery.com/jquery-3.6.1.min.js"
        integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ="
        crossorigin="anonymous"></script>

</body>
</html>
