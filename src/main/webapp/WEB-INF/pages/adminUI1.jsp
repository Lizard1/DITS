<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <link href="<c:url value="/res/css/login.css"/>" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>

<div class="container" id="main-container">
    <div class="row justify-content-md-center">
        <div class="col-4">
            <form>
                <div class="form-group align-items-center">
                    <p>
                        <input class="form-control bg-white text-info" type="text" id="login" placeholder="Логин или email" required>
                    </p>
                    <p>
                        <input class="form-control bg-white text-info" type="password" id='password' placeholder="Пароль" required>
                    </p>
                    <p>
                        <input  class="form-control text-white bg-primary" type="submit" name="submit" value="Войти">
                    </p>
                </div>
            </form>
        </div>
    </div>

</div>
</body>
</html>

<%--<c:url value="/account/${account.id}" var="accountId"/>--%>
<%--<a href="${accountId}">Got to account</a>--%>