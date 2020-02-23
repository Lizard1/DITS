<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/css/menu.css"/>" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<header>
    <a href="/logout">Logout</a>
</header>
<div class="container">
    <div class="row align-items-center justify-content-center">
        <div id="incub" class="col-5">
            <img src="/res/images/human.png">
        </div>

        <div class="col-5">
            <p><a href="<c:url value="/index/statistictest" />">Статистика оп тесту</a></p>
            <p><a href="<c:url value="/index/statseven" />">Статистика по вопросам</a></p>
            <p><a href="<c:url value="/index/statee" />">Статистика пользователей</a></p>
            <p><button class="btn text-white bg-primary" onclick='history.back()'>Назад</button></p>
        </div>
    </div>
</div>
</body>
</html>
