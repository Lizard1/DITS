<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<link href="<c:url value="/res/css/creationmenu.css"/>" rel="stylesheet" type="text/css"/>--%>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<div class="container">
    <div class="row align-items-center justify-content-center">
    <div id="incub" class="col-5">
        <img src="/res/images/human.png">
    </div>

    <form class="col-5">
        <div class="form-group">
            <p>
                <form:select path="topicName" class="form-control" name="topic">
                    <form:options items="${topicList}"/>
                    <%--<option>Название темы</option>--%>
                    <%--<option selected value="1">Тема 1</option>--%>
                    <%--<option value="2">Тема 2</option>--%>
                    <%--<option value="3">Тема 3</option>--%>
                    <%--<option value="4">Тема 4</option>--%>
                </form:select>
            </p>
            <p>
                <form:select path="testName" class="form-control" name="text">
                    <form:options items="${testList}"/>
                    <%--<option>Название теста</option>--%>
                    <%--<option selected value="1">Тест 1</option>--%>
                    <%--<option value="2">Тест 2</option>--%>
                    <%--<option value="3">Тест 3</option>--%>
                    <%--<option value="4">Тест 4</option>--%>
                </form:select>
            </p>
            <p>
                <form:select path="nameQuestion" class="form-control" name="text">
                    <form:options items="${questionList}"/>
                    <%--<option>Название вопросов</option>--%>
                    <%--<option selected value="1">Вопрос 1</option>--%>
                    <%--<option value="2">Вопрос 2</option>--%>
                    <%--<option value="3">Вопрос 3</option>--%>
                    <%--<option value="4">Вопрос 4</option>--%>
                </form:select>
            </p>
            <p><input class="form-control text-white bg-primary" type="submit" name="submit" value="Сохранить"></p>
            <p><button class="btn text-white bg-primary" onclick='history.back()'>Назад</button></p>

        </div>
    </form>
    </div>
</div>
</body>
</html>
