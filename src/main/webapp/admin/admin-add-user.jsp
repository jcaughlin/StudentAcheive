<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="session" value="Administration Add User"/>
<c:set var="heading" scope="session" value="Admin Add User"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/20/18
  Time: 5:25 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../head.jsp"/>

<body>
<div class="container py-2">
    <jsp:include page="../jumbotron.jsp"/>
    <hr>

    <div class="row">
        <!--Sidebar Menu-->
        <div class="col-lg-2">
            <jsp:include page="../sidebar-menu.jsp"/>
        </div><!--Sidebar Column End-->

        <!--Center Column-->
        <div class="col-lg-10">
            <!--Start of form-->
            <form class="border px-4 pb-2" method="post" action="signup">
                <!-- form complex example -->
                <div class="row mt-4">

                    <!--User Name-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="username">User Name</label>
                        <input id="username" type="text" class="form-control" name ="username" placeholder="Create User Name">
                    </div>


                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="password">Create Temporary Password</label>
                        <input id="password" type="password" class="form-control" name="password" placeholder="Create Temporary Password">
                    </div>

                    <!--User First Name-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="firstName">First Name</label>
                        <input id="firstName" type="text" class="form-control" name ="firstName" placeholder="First Name">
                    </div>

                    <!--User Last Name-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="lastName">Last Name</label>
                        <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name">
                    </div>

                    <div class="col-sm-12 pb-3">
                        <label class="sr-only" for="address">Enter User Address</label>
                        <input type="text" class="form-control" id="address" name="address" placeholder="Enter Your Street Address">
                    </div>

                    <!--User City-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="city">City</label>
                        <input type="text" class="form-control" id="city" name="city" placeholder="Enter The Name of your city">
                    </div>

                    <!--User State-->
                    <div class="col-sm-3 pb-3">
                        <label class="sr-only" for="state">State</label>
                        <select class="form-control" id="state" name="state">
                            <option value="">Pick a state</option>
                            <jsp:include page="../state-list.jsp"/>
                        </select>
                    </div>

                    <!--User Zip-->
                    <div class="col-sm-3 pb-3">
                        <label class="sr-only" for="zipCode">Postal Code</label>
                        <input type="text" class="form-control" id="zipCode" name="zipCode" placeholder="Zip Code">
                    </div>

                    <!--User Email-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="email">Email</label>
                        <input id="email" type="email" class="form-control" name = "email" placeholder="Enter Email Address">
                    </div>

                    <!--User Phone Area Code-->
                    <div class="col-sm-2 pb-3">
                        <label class="sr-only" for="areacode">Three Digit Area Code</label>
                        <input id="areacode" type="text" class="form-control" name = "areacode" placeholder="(xxx)">
                    </div>

                    <!--User Phone-->
                    <div class="col-sm-4 pb-3">
                        <label class="sr-only" for="phone">Phone Number</label>
                        <input id="phone" type="text" class="form-control" name = "phone" placeholder="Enter Phone Number">
                    </div>
                    <!--User Phone-->
                    <div class="col-sm-4 pb-3">
                        <label class="sr-only" for="birthday">Enter your birtday</label>
                        <input id="birthday" type="date" class="form-control" name = "birthday" placeholder="Enter Phone Number">
                    </div>

                    <div class="col-sm-4 pb-3">
                        <label for="userPhoto">Example file input</label>
                        <input type="file" name="userPhoto" class="form-control-file" id="userPhoto">
                        <small class="form-text text-muted">
                            Upload User Photo
                        </small>
                    </div>
                    <div class="col-sm-12 pb-3">
                        <button class="btn btn-success">Submit</button>
                    </div>

                </div>
            </form>

        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





