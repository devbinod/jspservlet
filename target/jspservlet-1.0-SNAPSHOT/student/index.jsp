<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header/header.jsp" %>
<%@ page import="np.com.pantbinod.enumlist.ActionList" %>

<div class="row">
    <a href="${pageContext.request.contextPath}/addStudent?action=${ActionList.ADD.toString()}" class="btn btn-success">
        Add Student
    </a>
</div>

<div class="row">

    <table class="table table-hover table-bordered">
        <thead>
        <th>
            S.N.
        </th>
        <th>
            First Name
        </th>
        <th>
            Last Name
        </th>
        <th>
            Address
        </th>
        <th>
            Phone number
        </th>
        <th>
            Action
        </th>
        </thead>
        <tbody>
        <c:forEach items="${studentList}" var="s">

            <tr>
                <td>
                        ${s.id}
                </td>
                <td>${s.firstName}</td>
                <td>${s.lastName}</td>
                <td>${s.address}</td>
                <td>${s.phoneNumber}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/deleteStudent?action=${ActionList.DELETE.toString()}&id=${s.id}"

                       class="btn btn-danger">Delete</a>

                    <a href="${pageContext.request.contextPath}/updateStudent?action=${ActionList.UPDATE.toString()}&id=${s.id}"

                       class="btn btn-success">Update</a>
                </td>
            </tr>

        </c:forEach>


        </tbody>


    </table>
</div>


<%@include file="../footer/footer.jsp" %>