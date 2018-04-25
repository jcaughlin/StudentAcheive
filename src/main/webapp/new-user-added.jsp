<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="User Added"/>
<c:set var="heading" scope="session" value="Welcome To Student Achieve"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/19/18
  Time: 11:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"/>
<body>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>
    <div class="row">
        <div class="col-lg-12">
            <h1 class="text-center">Welcome: ${user.userName} to Student Achieve!!!</h1>
        </div>
    </div><!--End Row-->

    <div class="row">
        <div class="col-lg-12">
            <h3>Please Confirm Your Registration info</h3>
        </div>
    </div><!--End Row-->


    <div class="row">
        <div class="col-lg-12">
            <h4 class="text-center">Account is currently pending</h4>
        </div>
    </div><!--End Row-->

    <div class="row">
        <div class="col-lg-12">
            <table class="table table-striped table-bordered">
                <caption>User Signup Confirmation</caption>
                <thead>
                <tr scope="row">
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Address</th>
                    <th scope="col">City</th>
                    <th scope="col">State</th>
                    <th scope="col">Zip Code</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone Number</th>
                </tr>
                </thead>

                <tr scope="row">
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.streetAddress}</td>
                    <td>${user.cityName}</td>
                    <td>${user.stateName}</td>
                    <td>${user.zipCode}</td>
                    <td>${user.userEmail}</td>
                    <td>(${user.areaCode}) ${user.userPhoneNumber}</td>
                </tr>
            </table>
        </div>
    </div><!--End Row-->

    <div class="row">

        <div class="col-sm-12">
            <form class="py-3" action="uploadPhoto" method="post" enctype="multipart/form-data">
                <h1 class="text-center">Would You Like to Upload a Profile Photo</h1>
                <div class="custom-file">
                    <input type="file" class="custom-file-input" id="customFile">
                    <label class="custom-file-label" for="customFile">Choose file</label>
                </div>
            </form>
        </div>
    </div>

    <jsp:include page="footer.jsp"/>
</div><!--End of Container-->
</body>
</html>


