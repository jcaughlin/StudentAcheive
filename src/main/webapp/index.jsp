<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" value="Welcome-Student Achieve!"/>
<c:set var="author" value="JS Caughlin"/>
<c:set var="heading" scope="request" value="Existing User Login"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/9/18
  Time: 2:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="head.jsp"/>

<div class="container py-5">

<div class="row">
    <div class="jumbotron text-center">
        <h1>Welcome ${heading}</h1>
    </div>
</div>

    <div class="row">
    <!--Sidebar Menu-->
    <div class="col-lg-2 test-green sideBar">
        <jsp:include page="sidebar-menu.jsp"/>
    </div>

    <!--Center Column-->
    <div class="col-lg-7">
        <!--FORM-->
        <form class="form form-signin mx-auto p5" action="signUpNewUser" method="post">
            <h2 class="form-signin-heading">Please Join The Fun</h2>

            <!--User Name-->
            <div class="form-group">
                <label for="username" class="sr-only">Enter User Name</label>
                <input type="text" class="form-control" name="username" id="username" placeholder="Enter User Name"
                       required="">
            </div>

            <!--User Password-->
            <div class="form-group">
                <label for="password" class="sr-only">Enter Password</label>
                <input type="password" class="form-control" name="password" id="password" placeholder="Password"
                       required="">
            </div>

            <!--Password Confirm-->
            <div class="form-group">
                <label for="passwordConfirm" class="sr-only">Confirm Password</label>
                <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm"
                       placeholder="Confirm Password" required="">
            </div>

            <!--Remember Me-->
            <div class="form-check">
                <label for="rememberLogin" class="form-check-label">
                    <input class="form-check-input" type="checkbox" id="rememberLogin" name="rememberLogin">
                    Keep Me Logged In!</label>
            </div>

            <div class="btn-group">
            <button class="btn btn-lg btn-primary" aria-pressed="false">Sign Up!</button>
                <a href="/login" class="btn btn-lg btn-info">Existing User Login</a>
            </div>
        </form>
    </div>
    </div> <!--End Row-->

    <jsp:include page="footer.jsp"/>

</div><!--End Container-->
</body>
</html>


