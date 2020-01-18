<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>

<head>
    <title>Spring MVC Form Handling</title>
    <meta charset="UTF-8">
    <%@ page isELIgnored="false" %>
</head>

<body>

${DataFromForm.role}
${DataFromForm.name}
${DataFromForm.surname}
${DataFromForm.patronymic}
${DataFromForm.logIn}
${DataFromForm.password}
${DataFromForm.email}
</body>
</html>