<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Teacher Complaints"/>
<c:set var="heading" scope="session" value="I Hate My Students"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 4/28/18
  Time: 2:41 PM
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
            <form class="form py-4" method="post" action="theComplainer">

                <!-- Complaint Text Area-->
                <div class="col-sm-6 pb-3">
                    <label for="complaintText">Lodge Your Complaint:</label>
                    <textarea id="complaintText" name="teacherComplaint" rows="5">Lodge Your Complaint</textarea>
                </div>

                <!--Today's Date-->
                <div class="col-sm-6 pb-3">
                    <label for="todaysDate">Today's Date:</label>
                    <input type="date" name="todaysDate" id="todaysDate" class="form-control"/>
                </div>

                <!--Last Day of School-->
                <div class="col-sm-6 pb-3">
                    <label for="lastDayOfClass">What is the last day of school?:</label>
                    <input type="date" name="lastDayOfClass" id="lastDayOfClass" class="form-control">
                </div>
                <!--Submit Buttom-->
                <div class="col-sm-12 pb-3">
                <button class="btn btn-warning">GO!</button>
                </div>
            </form>

        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





