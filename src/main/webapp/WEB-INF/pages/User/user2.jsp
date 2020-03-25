<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="<c:url value="/res/css/menu.css"/>" rel="stylesheet" type="text/css"/>
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
            <form method="get" action="/user/goToTest">
                <div class="form-group">
                    <p><input class="form-control" type="text" placeholder="Название темы"/></p>
                    <p><input class="form-control" type="text" placeholder="Название теста"/></p>
                    <p><input class="form-control text-white bg-primary" type="submit" name="submit" value="Пройти тестирование"></p>
                </div>
            </form>
            <div class="col-5 justify-content-md-center">
                <button class="btn bg-primary">
                    <a id="alog" href='<c:url value="/user" />' class="text-white">Назад</a>
                </button>
            </div>
        </div>
    </div>
</div>
</body>
</html>
