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

<!--TODO Separate Reports for Students and Teachers
<!--TODO Report option and Servlet/DAO for PENDING USERS
<!--TODO Update User Form-->
<!DOCTYPE html>
<html lang="en">

<jsp:include page="../head.jsp"/>

<body>
<script>
    $(document).ready(function(){
        $('#adminUserReport').dataTable();
    });
</script>
<div class="container py-2">
    <jsp:include page="../jumbotron.jsp"/>
    <hr>

    <div class="row">
        <!--Sidebar Menu-->
<!--TODO Confirm Delete Modal-->
        <!--Center Column-->
        <div class="col-lg-12">
            <table id="adminUserReport" class="table table-striped table-bordered"><caption>Administration Report</caption>
                <thead>
                <tr scope="row">
                    <th scope="col">User ID</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Address</th>
                    <th scope="col">City</th>
                    <th scope="col">State</th>
                    <th scope="col">Zip Code</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone Number</th>
                    <th scope="col">Role Name</th>
                    <th scope="col">Registered Date</th>
                    <th scope="col">Last Updated</th>
                    <th scope="col">Update Profile</th>
                    <th scope="col">Delete User</th>
                 </tr>
            </thead>

            <c:forEach var="user" items="${users}">
                <tr scope="row">
                    <td>${user.id}</td>
                    <td>${user.lastName}</td>
                    <td>${user.firstName}</td>
                    <td>${user.streetAddress}</td>
                    <td>${user.cityName}</td>
                    <td>${user.stateName}</td>
                    <td>${user.zipCode}</td>
                    <td>${user.userEmail}</td>
                    <td>(${user.areaCode}) ${user.userPhoneNumber}</td>
                    <td>${user.userRole}</td>
                    <td>${user.userCreatedDate}</td>
                    <td>${user.userLastUpdated}</td>
                    <td><a href="adminUpdateUser?id=${user.id}" class="btn btn-primary btn-sm">Update</a></td>
                    <td><a href="adminDeleteUser?id=${user.id}" class="btn btn-warning btn-sm">Remove</a></td>
                </tr>
            </c:forEach>
            </table>
        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





