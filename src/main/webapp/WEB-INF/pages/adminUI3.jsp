<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
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

        <form:form  method="POST" action="/common/index/creationt/create" modelAttribute="crForm" class="col-5">
            <div class="form-group">
                <p><input class="form-control" type="text" required list="topics" placeholder="Выберите тему" id="topic" name="topic">
                    <datalist id="topics" name="nameTopic">
                        <c:forEach items="${topicList}" var="topic">
                        <option value="${topic.value}">
                            </c:forEach>
                    </datalist></p>
                <p><input class="form-control" type="text" required list="tests" placeholder="Выберите тест" id="test" name="topic">
                    <datalist id="tests" name="nameTest">
                        <c:forEach items="${testList}" var="test">
                        <option value="${test.value}">
                            </c:forEach>
                    </datalist></p>
                <p><input class="form-control" type="text" required list="questions" placeholder="Выберите вопрос"
                           id="question" name="topic">
                    <datalist id="questions" name="nameQuestion">
                        <c:forEach items="${questionList}" var="question">
                        <option value="${question.value}">
                            </c:forEach>
                    </datalist></p>

                <p><input class="form-control text-white bg-primary" type="submit" name="submit" value="Сохранить"></p>
                <p><button class="btn text-white bg-primary" onclick='history.back()'>Назад</button></p>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>

<%--<select class="form-control" name="topic">--%>
<%--&lt;%&ndash;<form:options items="${topicList}"/>&ndash;%&gt;--%>
<%--<option>Название темы</option>--%>
<%--<option selected value="1">Тема 1</option>--%>
<%--<option value="2">Тема 2</option>--%>
<%--<option value="3">Тема 3</option>--%>
<%--<option value="4">Тема 4</option>--%>
<%--</select>--%>
<%--</p>--%>
<%--<p>--%>
<%--<select class="form-control" name="text">--%>
<%--&lt;%&ndash;<form:options items="${testList}"/>&ndash;%&gt;--%>
<%--<option>Название теста</option>--%>
<%--<option selected value="1">Тест 1</option>--%>
<%--<option value="2">Тест 2</option>--%>
<%--<option value="3">Тест 3</option>--%>
<%--<option value="4">Тест 4</option>--%>
<%--</select>--%>
<%--</p>--%>
<%--<p>--%>
<%--<select class="form-control" name="text">--%>
<%--&lt;%&ndash;<form:options items="${questionList}"/>&ndash;%&gt;--%>
<%--<option>Название вопросов</option>--%>
<%--<option selected value="1">Вопрос 1</option>--%>
<%--<option value="2">Вопрос 2</option>--%>
<%--<option value="3">Вопрос 3</option>--%>
<%--<option value="4">Вопрос 4</option>--%>
<%--</select>--%>
<%--</p>--%>