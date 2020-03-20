<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/css/tables.css"/>" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<div class="row nav justify-content-end">
    <div class="col-12"><a class="text-primary" id="logout" href="/logout">Logout</a></div>
</div>
<div class="container">
    <div class="row align-items-center justify-content-center">
        <div id="incub" class="col">
            <img src="/res/images/human.png">
        </div>

        <div class="col">
            <p>
                <h1>Hello</h1>
            <p><a class="menu" href="<c:url value="/admin/creationt"/>">Создать тест</a></p>
            <p><a class="menu" href="<c:url value="/admin/creationu"/>">Создать пользователя</a></p>
            <p><a class="menu" href="<c:url value="/admin/statistic"/>">Статистика</a></p>
            </p>
            <p>
                <button class="btn bg-primary">
                    <a href='<c:url value="/admin/statistic" />' class="text-white">Назад</a>
                </button>
            </p>
        </div>
    </div>
</div>
</body>
</html>