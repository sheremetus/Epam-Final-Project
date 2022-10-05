<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kirja
  Date: 05.09.2022
  Time: 17:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Booking</title>
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
                    <c:param name="name" value="${requestScope.guest.name}"/>
                    <c:param name="surname" value="${requestScope.guest.surname}"/>
                </c:url>

                <c:url value="/jsp/booking.jsp" var="booking">
                    <c:param name="name" value="${requestScope.guest.name}"/>
                    <c:param name="surname" value="${requestScope.guest.surname}"/>
                </c:url>

                <c:url value="/jsp/contact.jsp" var="contact">
                    <c:param name="name" value="${requestScope.guest.name}"/>
                    <c:param name="surname" value="${requestScope.guest.surname}"/>
                </c:url>

                <c:url value="/jsp/entertainment.jsp" var="entertainment">
                    <c:param name="name" value="${requestScope.guest.name}"/>
                    <c:param name="surname" value="${requestScope.guest.surname}"/>
                </c:url>
                <c:url value="/jsp/mainPage.jsp" var="main">
                    <c:param name="name" value="${requestScope.guest.name}"/>
                    <c:param name="surname" value="${requestScope.guest.surname}"/>
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
</body>
</html>
