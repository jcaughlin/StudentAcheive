<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Update User"/>
<c:set var="heading" scope="session" value="Let's Update a User"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 5/8/18
  Time: 9:21 AM
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

        <div class="col-lg-10">
            <c:set var="id" scope="request" value="${user.id}"
            <c:set var="user" scope="request" value="${user}"/>

            <form class="border p-4" method="post" action="adminUpdateUser">
                <h3 class="text-center font-weight-bold mb-3">Update Fields and hit submit</h3>


                <input type="hidden" name="id" value="${user.id}"/>
                <input type="hidden" name="userObject" value="${user}"/>

                <!--First Name-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="firstName">First Name: ${user.firstName}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="firstName" value="${user.firstName}"id="firstName">
                    </div>
                </div>

                <!--Last Name-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="lastName">Last Name ${user.lastName}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="lastName" value=${user.lastName}id="lastName">
                    </div>
                </div>

                <!--Street Address-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="address">Street Address ${user.streetAddress}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="address" value="${user.streetAddress}" id="address">
                    </div>
                </div>

                <!--City-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="city">City ${user.cityName}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="city" value=${user.cityName}"id="city">
                    </div>
                </div>

                <!--State-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="state">State ${user.stateName}:</label>
                    </div>

                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="state" id="state" value="${user.stateName}">
                    </div>
                </div>

                <!--Zip Code-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="state">zipCode ${user.zipCode}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="zipCode" id="zipCode" value="${user.zipCode}:">
                    </div>
                </div>

                <!--Area Code-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="areaCode">zipCode ${user.areaCode}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input id="areaCode" type="text" name="areacode" value=${user.areaCode} class="form-control">
                    </div>
                </div>

                <!--Phone Number-->
                <div class="form-group row">
                    <div class="col-sm-4">
                        <label for="phone">Phone ${user.userPhoneNumber}:</label>
                    </div>
                    <div class="col-sm-8">
                        <input type="text" class="form-control" name="phone" value= "${user.userPhoneNumber}" id="phone">
                    </div>
                </div>

                <!--Update User Role-->
                <div class="form-row">
                    <div class="col-sm-4">
                        <label for="updateUserRole">Update User Role ${user.userRole}:</label>
                    </div>
                    <div class="col-sm-8">
                        <select id="updateUserRole" class="form-control" name="updateUserRole">
                            <option value="teacher">Teacher</option>
                            <option value="student">Student</option>
                            <option value="inactive">Suspend Account</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-success offset-4 my-2">Submit</button>
            </form>
        </div> <!-- End Center Column -->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





