<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title"  value="Welcome-Student Achieve!"/>
<c:set var="author" value="JS Caughlin"/>
<c:set var="heading" value="Existing User Login"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/9/18
  Time: 2:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="head.jsp"/>

<div class="row align-items-center">
    <div class="col-lg-2 sideBar">
        <jsp:include page="sidebar-menu.jsp"/>

    </div>
    <div class="col-lg-7">
        <form class="form form-signin border" action="/newUser" method="post">

            <h2 class="form-signin-heading">Please Join The Fun</h2>
            <label for="username" class="sr-only">Enter User Name</label>
            <input type="text" class="form-control" name="username" id="username" placeholder="Enter User Name"
                   required="">
            <label for="password" class="sr-only">Enter Password</label>
            <input type="password" class="form-control" name="password" id="password" placeholder="Password"
                   required="">
            <label for="passwordConfirm" class="sr-only">Confirm Password</label>
            <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm"
                   placeholder="Confirm Password" required="">

            <button role="button" class="btn-btn-lg btn-primary btn-block" type="submit">Login</button>
            <a href="login">Current User Sign In</a>
        </form>

    </div>
    <div class="col-lg-3"></div>
</div>
<!--End Row-->


<jsp:include page="footer.jsp"/>


