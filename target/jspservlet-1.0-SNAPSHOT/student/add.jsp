<%@include file="../header/header.jsp"%>

    <form action="${pageContext.request.contextPath}/addStudent" method="post">
        <div class="row">
            <div class="col-md-6">
                <label>First Name</label>
                <input type="text" class="form-control" name="firstName"/>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
                <label>Last Name</label>
                <input type="text" class="form-control" name="lastName"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <label>Address</label>
                <input type="text" class="form-control" name="address"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <label>Phone number</label>
                <input type="text" class="form-control" name="phoneNumber"/>
            </div>
        </div>

        <div class="row">
            <div class="col-md-6">
                <input type="submit" class="btn btn-primary" name="Add Student"/>
            </div>
        </div>
    </form>


<%@include file="../footer/footer.jsp"%>