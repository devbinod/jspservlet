<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 12/10/19
  Time: 7:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
</head>
<body>

    User Login Form 2

    <a href="${pageContext.request.contextPath}/addStudent">Add Student</a>

<form action="${pageContext.request.contextPath}/goto" method="get">
    <input type="text" name="use rname"/>
    <input type="text" name="password"/>
    <input type="submit" value="Login"/>

</form>

</body>
</html>
