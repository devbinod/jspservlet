<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 12/10/19
  Time: 7:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<a href="${pageContext.request.contextPath}/studentList">Student List</a>
<form action="${pageContext.request.contextPath}/addStudent" method="post">

    <input type="text" name="firstName" placeholder="first name"/><br/>
    <input type="text" name="lastName" placeholder="last name"/><br/>
    <input type="text" name="address" placeholder="address"/><br/>
    <input type="text" name="phoneNumber" placeholder="phone number"/><br/>
    <input type="submit" value="AddStudent"/>


</form>

</body>
</html>
