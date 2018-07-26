<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="request" value="Welcome-Student Achieve!"/>
<c:set var="author" value="JS Caughlin"/>
<c:set var="heading" scope="request" value="Welcome to Student Achieve!!"/>
<c:set var="pageType" scope="session" value="index-page"/>
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
<!--Container Start-->
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
            <form class="border px-2 mx-auto" action="signUpNewUser" method="post" style="width: 600px;">

                <div class="col-sm-12 py-3">
                    <h2 class="text-center">Please Join The Fun</h2>

                </div>
                <!--User Name-->
                <div class="col-sm-12 pb-3 mx-auto">
                    <label for="username" class="sr-only">Enter User Name</label>
                    <input type="text" class="form-control" name="username" id="username"
                           placeholder="Enter User Name" required>
                </div>
                <div class="invalid-feedback">
                    ${userExists}
                </div>

                <!--User Password-->
                <div class="col-sm-12 pb-3 mx-auto">
                    <label for="password" class="sr-only">Enter Password</label>
                    <input type="password" class="form-control" name="password" id="password"
                           placeholder="Password" required>
                </div>

                <!--Password Confirm-->
                <div class="col-sm-12 pb-3 mx-auto">
                    <label for="passwordConfirm" class="sr-only">Confirm Password</label>
                    <input type="password" class="form-control" name="passwordConfirm" id="passwordConfirm"
                           placeholder="Password" required>
                </div>

                <!--Remember Me-->
                <div class="col-sm-12 pb-3">
                    <div class="form-check">
                        <input type="checkbox" class="form-check-input" id="rememberLogin" name="rememberLogin">
                        <label for="rememberLogin" class="form-check-label">Keep Me Logged In!</label>
                    </div>
                </div>

                <!--Deployed AWS RECAPTCHA-->
                <!--
                                <div class="col-sm-9 pb-3">
                                    <div class="g-recaptcha" data-sitekey="6Ldki1YUAAAAAPCVpZy6okQPZoQKsdlVa6mgIO_J"></div>
                                </div>-->


                <div class="col-sm-9 pb-3">
                    <div class="g-recaptcha" data-sitekey="6LcoVTMUAAAAALS8qu7IVM0NiSeXfFddonZJi8Z1"></div>
                </div>

                <div class="col-sm-9 pb-3">
                    <button class="btn btn-primary btn-lg" aria-pressed="false">Sign Up!</button>
                    <button type="button" class="btn btn-info btn-lg" data-target="#userType" data-toggle="modal">
                        Existing User?
                    </button>
                </div>

                <!--Forgot Password-->
                <div class="col-sm-9 pb-3">
                    <button type="button" class="btn btn-warning" data-target="#forgottenPassword" data-toggle="modal">Forgot Password</button>
                </div>

                <!--Server Side Validation Error Message-->
                <div class="invalid-feedback">
                    <span>${missingField}</span>
                    <span>${passwordmismatch}</span>
                </div>
            </form>
        </div>
    </div><!--End Row-->

    <div class="row">
        <div class="modal fade" id="forgottenPassword" role="dialog" aria-labelby="forgottenPassword"
             aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content py-4">
                    <div class="modal-header">
                        <h4 class="modal-title">So You are a KnuckleHead and Forgot Your Password?</h4>
                    </div>
                    <div class="modal-body">
                        <form class="border p-4" action="forgotPassword" method="get">
                            <div class="col-12 pb-3">
                                <input type="email" class="form-control" placeholder="Enter Your Email" name="email">
                            </div>
                            <button class="btn btn-dark btn-large">Submit</button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="modal fade" id="userType" tabindex="-1" role="dialog" aria-labelledby="userType" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content py-4">
                    <div class="modal-header">
                        <h5 class="modal-title">Select User Type and Submit</h5>
                    </div>
                    <div class="modal-body">
                        <form class="border px-4 py-4" action="routeUser" method="get">
                            <div class="col-xs-12">
                                <h4 class="text-center">Select User Type:</h4>
                            </div>
                            <!--User Type Teacher-->
                            <div class="col-xs-12">
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="userType" value="teacher"
                                           id="teacher">
                                    <label class="form-check-label" for="teacher">Teacher</label>
                                </div>
                            </div>

                            <!--User Type Student-->
                            <div class="col-xs-12">
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="userType" value="student"
                                           id="student">
                                    <label class="form-check-label" for="student">Student</label>
                                </div>
                            </div>

                            <!--User Type admin-->
                            <div class="col-xs-12">
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="userType" value="admin"
                                           id="admin">
                                    <label class="form-check-label" for="admin">Admin</label>
                                </div>
                            </div>
                            <div class="col-xs-12 p-2">
                                <button class="btn btn-info">GO!</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div><!--End Row-->


    <jsp:include page="footer.jsp"/>
</div><!--End Container-->

<jsp:include page="javascript-links.jsp"/>
<script type="text/javascript">
    $(document).ready(function () {
        $("#username").change(function () {
            console.log("The text has been changed.");
        });
    });
</script>
</body>
</html>



