<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="<c:url value="/res/css/creationuser.css"/>" rel="stylesheet" type="text/css"/>
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

        <div class="col-5">
            <form:form lang="ru" action="/addnewuser" method="POST">
                <div class="form-group">
                    <p><form:select path="role" class="form-control bg-white text-info" name="role">
                        <option class="bg-white text-info" disabled>Роль</option>
                        <option class="bg-white text-info">Админ</option>
                        <option class="bg-white text-info">Преподаватель</option>
                        <option class="bg-white text-info">Пользователь</option>
                    </form:select></p>
                    <p><form:input path="firstName" class="form-control bg-white text-info" type="text" placeholder="Имя" name="firstname"/></p>
                    <p><form:input path="surname" class="form-control bg-white text-info" type="text" placeholder="Фамилия" name="surname"/></p>
                    <p><form:input path="patronymic" class="form-control bg-white text-info" type="text" placeholder="Отчество" name="patronymic"/></p>
                    <p><form:input path="logIn" class="form-control bg-white text-info" type="text" placeholder="Логин" name="logIn"/></p>
                    <p><form:input path="password" class="form-control bg-white text-info" type="text" placeholder="Пароль" name="password"/></p>
                    <p><form:input path="email" class="form-control bg-white text-info" type="text" placeholder="Почта" name="email"/></p>
                    <p><input class="form-control text-white bg-primary" type="submit" value="Сохранить"/></p>
                </div>
            </form:form>
            <p><button class="btn text-white bg-primary" onclick='history.back()'>Назад</button><p>

        </div>
    </div>
</div>
</body>
</html>
