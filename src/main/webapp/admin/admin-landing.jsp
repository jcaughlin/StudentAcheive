<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Admin Page"/>
<c:set var="heading" scope="session" value="The Admin Page"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/7/18
  Time: 4:20 PM
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
            <h2 class="col-sm-9 py-3">Choose Report</h2>
            <form "border px-4 pb-2"method="get" action="/adminReports">
            <div class="col-sm-9 pb-3">
                <label for="adminReport" class="sr-onlu">Choose Report Type</label>
                <select class="form-control" id="adminReport" name="reportRequested">
                    <option value="">Choose Report</option>
                    <option value="addUser">Add New User</option>
                    <option value="showAll">Show All</option>
                    <option value="students">Students Reports</option>
                    <option value="teachers">Teacher Reports</option>
                </select>
            </div>
            <div class="col-sm-9 pb-3">
                ${errorMessage}
            </div>
            <div class="col-sm-9 pb-3">
            <button class="btn btn-primary btn-large">Go!</button>
            </div>
            </form>

        </div><!--Center Column End-->
    </div> <!--End Row-->
    <div class="row">
        <div class="col-lg-10 col-lg-offset-2">

        </div>
    </div>

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





