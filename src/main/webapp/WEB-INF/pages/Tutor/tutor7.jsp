<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="<c:url value="/res/css/tables.css"/>" rel="stylesheet" type="text/css"/>
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
            <table class="container">
                <tr class="row">
                    <th class="col head">Ф.И.О.</th>
                    <th class="col head">Название теста</th>
                    <th class="col head">Пройдено всего</th>
                    <th class="col head">Процент правильных ответов</th>
                </tr>
            <tr class="row">
                <td class="col"></td>
                <td class="col"></td>
                <td class="col"></td>
            </tr>
            <tr class="row">
                <td class="col"></td>
                <td class="col"></td>
                <td class="col"></td>
            </tr>
            <tr class="row">
                <td class="col"></td>
                <td class="col"></td>
                <td class="col"></td>
            </tr>
            <tr class="row">
                <td class="col"></td>
                <td class="col"></td>
                <td class="col"></td>
            </tr>
            <tr class="row">
                <td class="col"></td>
                <td class="col"></td>
                <td class="col"></td>
            </tr>
            </table>
            </p>
            <p>
                <button class="btn bg-primary">
                    <a id="alog" href='<c:url value="/tutor/statis" />' class="text-white">Назад</a>
                </button>
            </p>
        </div>
    </div>
</div>
</body>
</html>
