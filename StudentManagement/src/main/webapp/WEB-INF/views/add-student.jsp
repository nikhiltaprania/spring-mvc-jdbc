<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <title>Add Student</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/add-student.css"/>
</head>

<body>
<div align="center">
    <h1>Add Student</h1>

    <form:form action="saveStudent" modelAttribute="student" method="post">
        <form:hidden path="studentId"/>

        <label>Name: </label>
        <form:input path="studentName"/> <br>

        <label>Mobile: </label>
        <form:input path="studentMobile"/> <br>

        <label>Country: </label>
        <form:input path="studentCountry"/> <br>

        <input type="submit" value="Submit">
    </form:form>
</div>
</body>

</html>
