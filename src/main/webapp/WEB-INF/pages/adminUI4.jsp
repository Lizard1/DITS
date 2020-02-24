<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="<c:url value="/res/css/creationuser.css"/>" rel="stylesheet" type="text/css"/>
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
        <div id="incub" class="col-5">
            <img src="/res/images/human.png">
        </div>
        <div class="col-5">
                <form:form method="POST" action="/user/addnewuser" modelAttribute="formOfUser">
                    <div class="form-group">
                        <p><form:select path="roleFromForm" class="form-control bg-white text-info">
                            <form:options items="${roleList}"/>
                        </form:select></p>
                        <p><form:input path="firstName" class="form-control bg-white text-info" type="text"
                                       placeholder="Имя"/></p>
                        <p><form:input path="lastName" class="form-control bg-white text-info" type="text"
                                       placeholder="Фамилия"/></p>
                        <p><form:input path="patronymic" class="form-control bg-white text-info" type="text"
                                       placeholder="Отчество"/></p>
                        <p><form:input path="login" class="form-control bg-white text-info" type="text"
                                       placeholder="Логин"/></p>
                        <p><form:password path="password" class="form-control bg-white text-info"
                                          placeholder="Пароль"/></p>
                        <p><form:input path="email" class="form-control bg-white text-info" type="text"
                                       placeholder="Почта"/></p>
                        <p><input class="form-control text-white bg-primary" type="submit" value="Сохранить"/></p>
                    </div>
                </form:form>
        </div>
    </div>
</div>
</body>
</html>