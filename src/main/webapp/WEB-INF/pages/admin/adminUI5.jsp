<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/css/menu.css"/>" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<div class="row nav justify-content-end">
    <div class="col-12"><a class="text-primary" id="logout" href="/logout">Logout</a></div>
</div>
<div class="container">
    <div class="row align-items-center justify-content-center">
        <div id="incub" class="col-5">
            <img src="/res/images/human.png">
        </div>

        <div class="col-5">
            <p><a class="menu" href="<c:url value="/stat/statistictest" />">Статистика по тесту</a></p>
            <p><a class="menu" href="<c:url value="/stat/statseven" />">Статистика по вопросам</a></p>
            <p><a class="menu" href="<c:url value="/stat/statee" />">Статистика пользователей</a></p>
            <p>
                <button class="btn bg-primary">
                    <a id="back" href='<c:url value="/admin/menu"/>' class="text-white">Назад</a>
                </button>
            </p>
        </div>


    </div>
</div>
</body>
</html>
