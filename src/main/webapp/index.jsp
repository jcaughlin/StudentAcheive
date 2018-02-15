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

<div class="row">
    <h1>${message}</h1>
</div>

<div class="row">
    <div class="col-lg-2 test-green sideBar">
        <jsp:include page="sidebar-menu.jsp"/>

    </div>
    <div class="col-lg-7 test-blue">
        <form class="form form-signin border mx-auto" action="/newUser" method="post">

            <h2 class="form-signin-heading">Please Join The Fun</h2>

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

            <div class="form-group">
                <label for="passwordConfirm" class="sr-only">Confirm Password</label>
                <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm"
                       placeholder="Confirm Password" required="">
            </div>

            <div class="form-check form-check-inline">
                <label for="rememberLogin" class="form-check-label">
                <input class="form-check-input" type="checkbox" id="rememberLogin" name="rememberLogin">
                Keep Me Logged In!</label>
            </div>


        <button type="button" class="btn btn-lg btn-primary" data-toggle="button" aria-pressed="false">Login</button>


            <p><a href="login">Current User Sign In</a></p>

        </form>

        <div id="modalform" style="display:none">
        <h1>It Works</h1>
        <label for="searchBox">Search</label>
        <input type="search"id="searchBox"/>
"
    </div>

    </div>
    <div class="col-lg-3">

    </div>
</div>
<!--End Row-->



<jsp:include page="footer.jsp"/>


