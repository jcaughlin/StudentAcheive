<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="session" value="New User Sign Up"/>
<c:set var="heading" scope="session" value="Register Yourself"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/19/18
  Time: 9:31 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!--TODO Improve Validation Now behaves different by browser-->
<!--TODO birthday input sucks-->

<jsp:include page="head.jsp"/>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>

    <div class="row">
        <div class="col-sm-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div>
        <div class="col-md-9 offset-md-1">
            <h3>Welcome ${username}! Let's Finish Getting You Registered</h3>

            <!--Start of form-->
            <form class="border p-4" method="post" id="needs-validation" action="signup">
                <!-- form complex example -->
                <div class="row mt-4">

                    <input type="hidden" name="password" value="${password}">
                    <input type="hidden" name="username" value="${username}">

                    <!--User First Name-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="firstName">First Name</label>
                        <input id="firstName" type="text" class="form-control" name="firstName"
                               placeholder="First Name" required>
                        <div class="invalid-feedback">
                            Yes we really want to know your name
                        </div>
                    </div>

                    <!--User Last Name-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="lastName">Last Name</label>
                        <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Last Name" required>
                        <div class="invalid-feedback">
                            Again, We want to know who you are!
                        </div>
                    </div>

                    <!--User Address-->
                    <div class="col-sm-9 pb-3">
                        <label class="sr-only" for="address">Enter User Address</label>
                        <input type="text" class="form-control" id="address" name="address"
                               placeholder="Street Address">
                    </div>
                    <div class="col-sm-3 pb-3">
                        <label class="sr-only" for="unit">APT/UNIT</label>
                        <input type="text" class="form-control" id="unit" name="unit" placeholder="Unit #">
                    </div>


                    <!--User City-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="city">City</label>
                        <input type="text" class="form-control" id="city" name="city" placeholder="City">
                    </div>

                    <!--User State-->
                    <div class="col-sm-3 col-2 pb-3">
                        <label class="sr-only" for="state">State</label>
                        <select class="form-control" id="state" name="state">
                            <option value="">Pick a state</option>
                            <jsp:include page="state-list.jsp"/>
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
                        <input id="email" type="email" class="form-control" name="email"
                               placeholder="Enter Email Address" aria-describedby="email-required" required>
                        <div class="invalid-feedback">
                            An Email Address is Required.
                        </div>
                    </div>

                    <!--User Phone Area Code-->
                    <div class="col-sm-2 pb-3">
                        <label class="sr-only" for="areacode">Three Digit Area Code</label>
                        <input id="areacode" type="text" class="form-control" name="areacode" placeholder="(xxx)">
                    </div>

                    <!--User Phone-->
                    <div class="col-sm-4 pb-3">
                        <label class="sr-only" for="phone">Phone Number</label>
                        <input id="phone" type="text" class="form-control" name="phone"
                               placeholder="Enter Phone Number">
                    </div>
                    <!--User Birthday-->
                    <div class="col-sm-6 pb-3">
                        <div class="form-group">
                            <label class="sr-only" for="birthday">Enter your birthday</label>
                            <input id="birthday" type="date" class="form-control" name="birthday">
                            <!-- <i class="fas fa-calendar"></i>-->
                        </div>
                    </div>

                    <!--School Name-->
                    <div class="col-sm-6 pb-3">
                        <label class="sr-only" for="school">Select School</label>
                        <select class="form-control" id="school" name="school">
                            <option value="">Choose School</option>
                            <option value="prairie">Prairie Elementary</option>
                            <option value="main">Main High School</option>
                        </select>
                    </div>

                    <!--Submit Button-->
                    <div class="col-sm-12 pb-3">
                        <button class="btn btn-success">Submit</button>
                    </div>

                </div>
            </form>
        </div>

    </div>
    <!--/row-->
    <jsp:include page="footer.jsp"/>
</div>
<script>
    (function () {
        "use strict";
        window.addEventListener("load", function () {
            var form = document.getElementById("form-validation");
            form.addEventListener("submit", function (event) {
                if (form.checkValidity() == false) {
                    event.preventDefault();
                    event.stopPropagation();
                }
                form.classList.add("was-validated");
            }, false);
        }, false);
    }());
</script>
</body>
</html>



