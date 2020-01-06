<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/css/menu.css"/>" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<div class="container">
    <div class="row align-items-center justify-content-center">
        <div id="incub" class="col-5">
            <img src="/res/images/human.png">
        </div>

        <div id="menu" class="col-5">
            <p>
                <a href="<c:url value="/common/index/creationt" />">Создать тест</a>
            </p>
            <p>
                <a href="<c:url value="/common/index/creationu"/>">Создать пользователя</a>
            </p>
            <p>
                <a href="<c:url value="/common/index/statistic"/>">Статистика</a>
            </p>
            <p><button class="btn text-white bg-primary" onclick='history.back()'>Назад</button></p>
        </div>
    </div>

</div>
</body>
</html>
