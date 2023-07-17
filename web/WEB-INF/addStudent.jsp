<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 12.05.2023
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Add student</title>
</head>
<body>
<form action="/addStudent" method="post" class="form">
  <input type="text" name="fullName" placeholder="Enter fullName"><br>
  <input type="text" name="age" placeholder="Enter Age"><br>
  <input type="text" name="phoneNumber" placeholder="Enter phoneNumber"><br>
  <button type="submit">Add student</button>
</form>
</body>
</html>
