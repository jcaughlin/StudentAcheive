<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" value="Welcome-Student Achieve!"/>
<c:set var="author" value="JS Caughlin"/>
<c:set var="heading" scope="request" value="to Student Achieve!!"/>
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
        <!--Sidebar Menu-->
        <div class="col-lg-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div>

        <!--Center Column-->
        <div class="col-lg-10">
            <!--FORM-->
            <form class="border px-4 pb-2" id="signup" action="signUpNewUser" method="post">

                <h2 class="col-sm-9 py-3">Please Join The Fun</h2>

                <!--User Name-->
                <div class="col-sm-9 pb-3">
                    <label for="username" class="sr-only">Enter User Name</label>
                    <input type="text" class="form-control" name="username" id="username" placeholder="Enter User Name"
                           required="">
                </div>

                <!--User Password-->
                <div class="col-sm-9 pb-3">
                    <label for="password" class="sr-only">Enter Password</label>
                    <input type="password" class="form-control" name="password" id="password" placeholder="Password"
                           required="">
                </div>

                <!--Password Confirm-->
                <div class="col-sm-9 pb-3">
                    <label for="passwordConfirm" class="sr-only">Confirm Password</label>
                    <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm"
                           placeholder="Confirm Password" required="">
                </div>

                <!--Remember Me-->
                <div class="col-sm-9 pb-3">
                    <label for="rememberLogin" class="form-check-label">
                        <input type="checkbox" id="rememberLogin" name="rememberLogin">
                        Keep Me Logged In!</label>
                </div>

                <!--Button Group-->
                <div class="col-sm-9 pb-3">

                    <button class="btn btn-primary btn-lg" aria-pressed="false">Sign Up!</button>

                    <a href="login" class="btn btn-info btn-lg">Existing User?</a>
                </div>
            </form>

            <div id="userTypeForm" style="display-none">
                <div class="col-sm-6 pb-3">

                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="userType" value="teacher" id="teacher">
                        <label class="form-check-label" for="teacher">Teacher</label>
                    </div>

                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="userType" value="student" id="student">
                        <label class="form-check-label" for="student">Student</label>
                    </div>

                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="userType" value="admin" id="admin">
                        <label class="form-check-label" for="admin">Admin</label>
                    </div>

                    <a href="routeUser" class="btn btn-info btn-lg">GO!</a>

                </div>
            </div>
            <div>${passwordmismatch}</div>
        </div>
    </div> <!--End Row-->
    
    <jsp:include page="footer.jsp"/>
</div><!--End Container-->
</body>
</html>



