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

<div class="row">
<div class="col-md-10 offset-md-1">
    <span class="anchor" id="formComplex"></span>
    <hr class="my-5">
    <h3>Complex Form Example </h3>

    <form method="post" action="signup">
    <!-- form complex example -->
    <div class="row mt-4">
        <!--User First Name-->
        <div class="col-sm-6 pb-3">
            <label for="firstName">First Name</label>
            <input id="firstName" type="text" class="form-control" name ="firstName">
        </div>

        <!--User Last Name-->
        <div class="col-sm-6 pb-3">
            <label for="lastName">Last Name</label>
            <input type="text" class="form-control" id="lastName" name="lastName">
        </div>

        <!--User City-->
        <div class="col-sm-6 pb-3">
            <label for="city">City</label>
            <input type="text" class="form-control" id="city" name="city">
        </div>

        <!--User State-->
        <div class="col-sm-3 pb-3">
            <label for="state">State</label>
            <select class="form-control" id="state" name="state">
                <option>Pick a state</option>
            </select>
        </div>

        <!--User Zip-->
        <div class="col-sm-3 pb-3">
            <label for="zipCode">Postal Code</label>
            <input type="text" class="form-control" id="zipCode">
        </div>

        <!--User Email-->
        <div class="col-sm-6 pb-3">
            <label for="email">Email</label>
            <input id="email" type="email" class="form-control" name = "email">
        </div>

        <!--User Phone-->
        <div class="col-sm-6 pb-3">
            <label for="phone">Phone Number</label>
            <input id="phone" type="text" class="form-control" name = "phone">
        </div>
        <button class="btn btn-success">Submit</button>

    </div>
    </form>

</div>

</div>
<!--/row-->

<hr>


<!--/col-->
</div>
<!--/row-->
</body>
</html>

