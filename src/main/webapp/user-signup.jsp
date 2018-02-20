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

<jsp:include page="/head.jsp"/>
<div class="container">

<div class="row">
    <div class="col-sm-2">
        <jsp:include page="sidebar-menu.jsp"></jsp:include>
    </div>
<div class="col-md-10 offset-md-1">
    <span class="anchor" id="formComplex"></span>
    <hr class="my-5">
    <h3>Welcome ${username}! Let's Finish Getting You Registered</h3>

    <form method="post" action="signup">
    <!-- form complex example -->
    <div class="row mt-4">

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
                <option>Pick a state</option>
            </select>
        </div>

        <!--User Zip-->
        <div class="col-sm-3 pb-3">
            <label class="sr-only" for="zipCode">Postal Code</label>
            <input type="text" class="form-control" id="zipCode" placeholder="Zip Code">
        </div>

        <!--User Email-->
        <div class="col-sm-6 pb-3">
            <label class="sr-only" for="email">Email</label>
            <input id="email" type="email" class="form-control" name = "email" placeholder="Enter Email Address">
        </div>

        <!--User Phone Area Code-->
        <div class="col-sm-2 pb-3">
            <label class="sr-only" for="areacode">Three Digit Area Code</label>
            <input id="areacode" type="text" class="form-control" name = "areacode" placeholder="Enter Area Code">
        </div>

        <!--User Phone-->
        <div class="col-sm-4 pb-3">
            <label class="sr-only" for="phone">Phone Number</label>
            <input id="phone" type="text" class="form-control" name = "phone" placeholder="Enter Phone Number">
        </div>
        <button class="btn btn-success">Submit</button>

    </div>
    </form>
</div>

</div>

</div>
<!--/row-->

<hr>



</body>
</html>

