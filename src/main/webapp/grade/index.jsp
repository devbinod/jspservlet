<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header/header.jsp" %>
<%@ page import="np.com.pantbinod.enumlist.ActionList" %>

<div class="row">
    <a href="${pageContext.request.contextPath}/addGrade?action=${ActionList.ADD.toString()}" class="btn btn-success">
        Add Grade
    </a>
</div>

<div class="row">

    <table class="table table-hover table-bordered">
        <thead>
        <th>
            S.N.
        </th>
        <th>
            Grade
        </th>

        <th>
            Action
        </th>
        </thead>
        <tbody>
        <c:forEach items="${gradeList}" var="g">

            <tr>
                <td>
                        ${g.id}
                </td>
                <td>${g.name}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/deleteGrade?action=${ActionList.DELETE.toString()}&id=${g.id}"

                       class="btn btn-danger">Delete</a>

                    <a href="${pageContext.request.contextPath}/updateGrade?action=${ActionList.UPDATE.toString()}&id=${g.id}"

                       class="btn btn-success">Update</a>
                </td>
            </tr>

        </c:forEach>


        </tbody>


    </table>
</div>


<%@include file="../footer/footer.jsp" %>