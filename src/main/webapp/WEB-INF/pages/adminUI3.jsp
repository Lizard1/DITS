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

        <form:form method="POST" action="/common/index/creationt/create" modelAttribute="crForm" class="col-5">
            <div class="form-group">
                <p><form:input path="topicFromCrFrom" class="form-control" type="text" list="topics" placeholder="Выберите тему"/>
                    <datalist id="topics">
                        <c:forEach items="${topicList}" var="topicFromCrFrom">
                        <option value="${topicFromCrFrom.value.name}">
                            </c:forEach>
                    </datalist>
                </p>
                <p><form:input path="testFromCrForm" class="form-control" type="text" list="tests" placeholder="Выберите тест"/>
                    <datalist id="tests">
                        <c:forEach items="${testList}" var="testFromCrForm">
                        <option value="${testFromCrForm.value.name}">
                            </c:forEach>
                    </datalist>
                </p>
                <p><form:input path="questionFromCrForm" class="form-control" type="text" list="questions" placeholder="Выберите вопрос"/>
                    <datalist id="questions">
                        <c:forEach items="${questionList}" var="questionFromCrForm">
                        <option value="${questionFromCrForm.value.description}">
                            </c:forEach>
                    </datalist>
                </p>

                <p><input class="form-control text-white bg-primary" type="submit" name="submit" value="Сохранить"></p>
                <p>
                    <button class="btn text-white bg-primary" onclick='history.back()'>Назад</button>
                </p>
            </div>
        </form:form>
    </div>
</div>
</body>
</html>