<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<body>
<h1>Dear Employee, please enter your details</h1>
<br>
<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name" cssStyle="color: firebrick"/>
    <br><br>

    Surname <form:input path="surname"/>
    <form:errors path="surname" cssStyle="color: firebrick"/>

    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary" cssStyle="color: firebrick"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments.keySet()}"/>
    </form:select>
    <br><br>
    Which car do yo want
    <br>
    <form:radiobuttons path="carBrand" items="${employee.carBrands.keySet()}"/>
    <br><br>
    Foreign Language(s):
    <br>
    <form:checkboxes path="languages" items="${employee.languageList.values()}"/>
    <br><br>
    Phone number, start with '9' <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber" cssStyle="color: firebrick"/>
    <br><br>

    <input type="submit" value="OK">

</form:form>

</body>
</html>