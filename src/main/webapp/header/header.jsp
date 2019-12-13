
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${title}</title>
    <style type="text/css">
        <%@include file="../css/bootstrap.min.css"%>
        <%@include file="../css/custom.css"%>
    </style>
</head>
<body>
<header>

    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">SMS</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/students">Student <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/grades">Grade</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Staff</a>
                </li>
            </ul>
        </div>
    </nav>
</header>
<div class="container">

