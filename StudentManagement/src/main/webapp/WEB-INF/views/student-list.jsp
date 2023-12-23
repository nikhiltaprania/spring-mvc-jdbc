<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>All Students</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/student-list.css"/>
</head>

<body>
<div align="center">
    <h1>Student Management</h1>
    <form action="showAddPage">
        <input type="submit" value="ADD">
    </form>

    <table border="1">
        <thead>
        <tr>
            <td>Student Id</td>
            <td>Student Name</td>
            <td>Student Mobile</td>
            <td>Student Country</td>
            <td>Update Student</td>
            <td>Delete Student</td>
        </tr>
        </thead>

        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.studentId}</td>
                <td>${student.studentName}</td>
                <td>${student.studentMobile}</td>
                <td>${student.studentCountry}</td>
                <td><a href="updateStudent?userId=${student.studentId}" style="color: green">UPDATE</a></td>
                <td><a href="deleteStudent?userId=${student.studentId}" style="color: red"
                       onclick="if(!confirm('Are You sure to remove student with id = ${student.studentId}?')) return false">DELETE</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>