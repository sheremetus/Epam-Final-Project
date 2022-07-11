<%--
  Created by IntelliJ IDEA.
  User: kirja
  Date: 12.07.2022
  Time: 01:01
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Верстка на float</title>
    <style>
        <%@include file='/css/mainPage.css' %>
    </style>
</head>
<body>
<dir class="wrapper">
    <header>
        <nav class="clear">
            <ul>
                <li><a href="#">Главная</a></li>
                <li><a href="#">Личный кабинет</a></li>
                <li><a href="#">Заказать комнату</a></li>
                <li><a href="#">Оплата проживания</a></li>
                <li><a href="#">Контакты</a></li>
            </ul>
        </nav>
        <h1>Здравствуйте ! ${Login}  </h1>
    </header>
    <div class="content-wrapper">
        <!-- первая левая боковая панель берем все в тег aside-->
        <aside class="sidebar1">
            <h2>Боковая панель 1</h2>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor. </p>
            <h3>Второстепенный заголовок</h3>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. </p>
            <h3>Второстепенный заголовок</h3>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. </p>
        </aside>
        <!-- основной контент -->
        <article class="main">
            <h2>Название</h2>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor. Suspendisse vitae quam lorem, in
                tempus velit. Sed vitae ante quis felis fringilla condimentum.</p>
            <p>Aenean orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor. </p>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor. Suspendisse vitae quam lorem, in
                tempus velit. Sed vitae ante quis felis fringilla condimentum. </p>
            <h3>Подзаголовок</h3>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor. Suspendisse vitae quam lorem, in
                tempus velit. Sed vitae ante quis felis fringilla condimentum. </p>
            <h3>Подзаголовок</h3>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor. Suspendisse vitae quam lorem, in
                tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean orci ante, venenatis non
                adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus imperdiet, nunc sem pharetra
                mi, vel faucibus elit risus id tortor. Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante
                quis felis fringilla condimentum. Aenean orci ante, venenatis non adipiscing vitae, fringilla et neque.
                In pharetra, eros imperdiet luctus imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor.
                Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tor</p>
        </article>

        <!-- вторая правая боковая панель -->
        <aside class="sidebar2">
            <h2>Боковая панель 2 </h2>
            <ul>
                <li>Aenean orci ante</li>
                <li>Venenatis non adipiscing vita</li>
                <li> Fringilla et neque</li>
                <li>Aenean orci ante</li>
                <li>Venenatis non adipiscing vita</li>
                <li> Fringilla et neque</li>
            </ul>
            <p>Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla condimentum. Aenean
                orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros imperdiet luctus
                imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor.Suspendisse vitae quam lorem, in
                tempus velit. </p>
            <p>Sed vitae ante quis felis fringilla condimentum. Aenean orci ante, venenatis non adipiscing vitae,
                fringilla et neque. In pharetra, eros imperdiet luctus imperdiet, nunc sem pharetra mi, vel faucibus
                elit risus id tortor.Suspendisse vitae quam lorem, in tempus velit. Sed vitae ante quis felis fringilla
                condimentum. Aenean orci ante, venenatis non adipiscing vitae, fringilla et neque. In pharetra, eros
                imperdiet luctus imperdiet, nunc sem pharetra mi, vel faucibus elit risus id tortor.</p>
        </aside>
    </div>
    <footer>
        <p>Lorem Ipsum - это текст-"рыба", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной
            "рыбой" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую
            коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только
            успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн.</p>
        <p>Контакты: <a href="mailto:nobody@nowhere.com">e-mail@here.com</a></p>
    </footer>
</dir>
</body>
</html>
