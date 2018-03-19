<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="session" value="Student Achieve User Login"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<c:set var="heading" scope="request" value="Existing User Login"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/9/18
  Time: 2:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"/>
<body>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>

    <div class="row">
        <div class="col-sm-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div>
        <div class="col-md-9 offset-md-1">
            <form class="border px-4 pb-2" method="j_security_check" action="login">

                <div class="col-sm-6 pb-3">
                <h2>Please Login</h2>
                </div>


        <div class="col-sm-6 pb-3">
            <label for="username" class="sr-only">Enter User Name</label>
            <input type="text" class="form-control" name="j_username" id="username"
                   placeholder="Enter User Name" required="">
        </div>

        <div class="col-sm-6 pb-3">
            <label for="password" class="sr-only">Enter Password</label>
            <input type="password" class="form-control" name="j_password" id="password" placeholder="Password"
                   required="">
        </div>
                <div class="col-sm-6 pb-3">
            <button class="btn btn-lg btn-success" type="submit">Submit!!</button>
                </div>

        </form>
    </div>
    <div class="col-lg-3"></div>

</div>

<jsp:include page="footer.jsp"/>
</div><!--End Container-->
</body>
</html>


