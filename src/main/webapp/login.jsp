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

<div class="row">
    <div class="col-lg-2">
        <jsp:include page="sidebar-menu.jsp"/>
    </div>
<div class="col-lg-7">
<div class="wrapper">
    <form class="form-signin" method="post" action="j_security_check">
        <h2 class="form-signin-heading">Please Login</h2>
        <label for="username" class=""sr-only>Enter User Name</label>
        <input type="text" class="form-control" name="j_username" id="username" placeholder="Enter User Name" required="">
        <label for="password" class="sr-only">Enter Password</label>
        <input type="password" class="form-control" name="j_password" id="password" placeholder="Password" required="">
        <button role="button" class="btn-btn-lg btn-success btn-block" type="submit">Submit!!</button>
    </form>
</div>
</div>

</div>

<jsp:include page="footer.jsp"/>

