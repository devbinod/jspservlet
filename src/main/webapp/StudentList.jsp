<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: developer
  Date: 12/10/19
  Time: 7:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/addStudent">Add Student</a>

    <table width="100%" border="1">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Address</th>
            <th>Phone number</th>
            <th>Action</th>
        </tr>

        <c:forEach items="${studentList}" var="s">

            <tr>
                <td>${s.id}</td>
                <td>${s.firstName}</td>
                <td>${s.lastName}</td>
                <td>${s.address}</td>
                <td>${s.phoneNumber}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/deleteStudent?id=${s.id}">
                        Delete
                    </a>
                    <a href="${pageContext.request.contextPath}/updateStudent?id=${s.id}">
                        Update
                    </a>
                </td>
            </tr>
        </c:forEach>


    </table>

</body>
</html>
