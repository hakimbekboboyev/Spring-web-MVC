<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Codemylove
  Date: 5/13/2023
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Student</title>
</head>
<body>
<h1>Studentlar</h1>
<a href="/addStudent">Add</a>

<table border="glass">
    <tr>
        <th>Id</th>
        <th>Full Name</th>
        <th>Age</th>
        <th>Phone Number</th>
    </tr>



    <c:forEach items="${students}" var="student">
        <tr>
            <th>${student.id}</th>
            <th>${student.fullName}</th>
            <th>${student.age}</th>
            <th>${student.phoneNumber}</th>



        </tr>
    </c:forEach>
</table>

</body>
</html>
