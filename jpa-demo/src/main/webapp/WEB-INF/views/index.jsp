<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://unpkg.com/mvp.css">
    <style>
        table {
            width: 100%;
        }
    </style>
</head>
<body>
<header>
    <h1>Students</h1>
</header>
<main>
    <form method="post">
        <label>First name <input name="firstName" required/></label>
        <label>Last name <input name="lastName" required/></label>
        <label>Group <input name="group" required/></label>
        <label>Birth date <input name="birthDate" type="date" required/></label>
        <input type="submit">
    </form>
    <hr/>
    <table>
        <thead>
        <tr>
            <th>Id</th>
            <th>Fist name</th>
            <th>Last name</th>
            <th>Group</th>
            <th>Birth date</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${students}" var="student">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.firstName}</td>
                    <td>${student.lastName}</td>
                    <td>${student.group}</td>
                    <td><fmt:formatDate value="${student.dateOfBirth}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</main>
</body>
</html>
