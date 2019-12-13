<%@include file="../header/header.jsp"%>
<%@page import="np.com.pantbinod.enumlist.ActionList" %>
<form action="${pageContext.request.contextPath}/addGrade" method="post">
    <input type="hidden" name="action" value="${ActionList.ADD.toString()}"/>
    <div class="row">
        <div class="col-md-6">
            <label>Grade</label>
            <input type="text" class="form-control" name="name"/>
        </div>
    </div>

    <div class="row">
        <div class="col-md-6">
            <input type="submit" class="btn btn-primary" name="Add Grade"/>
        </div>
    </div>
</form>


<%@include file="../footer/footer.jsp"%>