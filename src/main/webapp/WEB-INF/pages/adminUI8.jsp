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
<header>
    <a href="/logout">Logout</a>
</header>
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
                <c:forEach items="${tableDataUser}" var="tableDataUser">
                    <tr class="row">
                        <td class="col">${tableDataUser.user.firstName}</td>
                        <td class="col">${tableDataUser.nameTest}</td>
                        <td class="col">${tableDataUser.countPassed}</td>
                        <td class="col">${tableDataUser.percentPassed}</td>
                    </tr>
                </c:forEach>
            </table>
            </p>
            <p>
                <button class="btn text-white bg-primary" onclick='history.back()'>Назад</button>
            </p>
        </div>
    </div>
</div>
</body>
</html>
