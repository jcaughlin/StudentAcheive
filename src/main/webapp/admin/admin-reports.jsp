<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="session" value="Administration Reports"/>
<c:set var="heading" scope="session" value="Adminstration Reports"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/20/18
  Time: 7:17 AM
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
<!--TODO Confirm Delete Modal-->
        <!--Center Column-->
        <div class="col-lg-10">
            <table><caption>Administration Report</caption>
            <thead>
            <tr>
            <th scope="col">Last Name</th>
            <th scope="col">First Name</th>
            <th scope="col">Address</th>
            <th scope="col">State</th>
            <th scope="col">Zip Code</th>
            <th scope="col">Email</th>
            <th scoper="col">Phone Number</th>
            <th scope="col">Registered Date</th>
            <th scope="col">Last Updated</th>
            <th scope="col">Update Profile</th>
            <th scope="col">Delete User</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach var="user" items="${users}">
            <tr scope="row">${user.lastName}</tr>
            <tr scope="row">${user.firstName}</tr>
            <tr scope="row">${user.streetAddress}</tr>
            <tr scope="row">${user.cityName}</tr>
            <tr scope="row">${user.stateName}</tr>
            <tr scope="row">${user.zipCode}</tr>
            <tr scope="row">${user.userEmail}</tr>
            <tr scoper="row">(${user.areaCode})${user.userPhoneNumber}</tr>
            <tr scope="row">${user.userCreatedDate}</tr>
            <tr scope="row">${user.userLastUpdated}</tr>
            <tr scope="row"><a href="placeholder" class="btn btn-primary btn-sm">Update</a></tr>
            <tr scope="row"><a href="placeholder" class="btn btn-warning btn-sm">Remove</a></tr>
                </c:forEach
            </tbody>
                </table>


        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="footer.jsp"/>

</div><!--End Container-->
<script>
    $(document).ready(function() {
        $('#adminReport').dataTable();
    } );
</script>

</body>
</html>





