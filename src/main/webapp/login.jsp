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

<jsp:include page="head.jsp"/>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>

    <div class="row">
        <div class="col-sm-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div>
        <div class="col-md-9 offset-md-1">
            <form class="form mt-5" method="post" action="j_security_check">
                <h2 class="form-signin-heading">Please Login</h2>

                <div class="form-group">
                    <label for="username" class="" sr-only>Enter User Name</label>
                    <input type="text" class="form-control" name="j_username" id="username"
                           placeholder="Enter User Name" required="">
                </div>

                <div class="form-group">
                    <label for="password" class="sr-only">Enter Password</label>
                    <input type="password" class="form-control" name="j_password" id="password" placeholder="Password"
                           required="">
                </div>
                <div class="btn-group" role="group" aria-label="button-group">
                    <button role="button" class="btn btn-lg btn-success" type="submit">Submit!!</button>
                    <a href="/login" class="btn btn-lg btn-info">Existing User Login</a>
                </div>
            </form>
        </div>
        <div class="col-lg-3"></div>

    </div>

    <jsp:include page="footer.jsp"/>
</div>


