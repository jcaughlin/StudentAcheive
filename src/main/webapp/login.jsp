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
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"/>
<body>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>

    <div class="row">
        <!--Sidebar Menu-->
        <div class="col-sm-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div>

        <!--Main Section-->
        <div class="col-md-9 offset-md-1">

            <!--Form-->
            <form class="border p-4" method="POST" action="j_security_check">

                <div class="col-sm-6 pb-3">
                    <h1 class="display-4">Please Login</h1>
                </div>

                <!--User Name-->
                <div class="col-sm-6 pb-3">
                    <label for="username" class="sr-only">Enter User Name</label>
                    <input type="text" class="form-control" name="j_username" id="username"
                           placeholder="Enter User Name" required="">
                </div>

                <!--User Password-->
                <div class="col-sm-6 pb-3">
                    <label for="password" class="sr-only">Enter Password</label>
                    <input type="password" class="form-control" name="j_password" id="password" placeholder="Password"
                           required="">
                </div>

                <!--Submit Button-->
                <div class="col-sm-6 pb-3">
                    <input class="btn btn-lg btn-success" type="submit" value="Submit!!">
                </div>

            </form>
        </div>
    </div><!--End Row-->
    <jsp:include page="footer.jsp"/>
</div><!--End Container-->
</body>
</html>


