<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>
<h2>User Information</h2>
<form:form method="POST" action="addUsermod">

    <p><form:label path="username">User Name</form:label>
       <form:input path="username"/>
    </p>
    <p><form:label path="password">Password</form:label>
       <form:password path="password"/>
    </p>
    <p><form:label path="address">Address</form:label>
       <form:textarea path="address" rows="5" cols="30"/>
    </p>
    <p><form:label path="receivePaper">Subscribe Newsletter</form:label>
       <form:checkbox path="receivePaper"/>
    </p>
    <p><form:label path="favoriteFrameworks">Favorite Web Frameworks</form:label>
       <form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks"/>
    </p>
    <p><form:label path="gender">Gender</form:label>
       <form:radiobutton path="gender" value="M" label="Male"/>
       <form:radiobutton path="gender" value="F" label="Female"/>
    </p>
    <p><form:label path="favoriteNumber">Favorite Number</form:label>
       <form:radiobuttons path="favoriteNumber" items="${numbersList}"/>
    </p>
    <p><form:label path="country">Country</form:label>
       <form:select path="country">
       <form:option value="NONE" label="Select"/>
       <form:options items="${countryList}"/>
       </form:select></p>
    <p><input type="submit" value="Submit"/></p>

</form:form>
</body>
</html>