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
        <div class="col-lg-10 mx-auto">
            <form class="form border p-3" method="post" action="theComplainer">
                <h3 class="text-center pb-3">I Swear We Care So Send a Complaint If You Dare</h3>
                <!-- Complaint Text Area-->

                <div class="form-group row">
                    <div class="col-sm-2 col-form-label">
                        <label for="complaintText" class="font-weight-bold">Lodge Your Complaint:</label>
                    </div>
                    <div class="col-sm-10">
                        <textarea id="complaintText" name="teacherComplaintText"
                                  rows="5" class="w-100"></textarea>
                    </div>
                </div>


                <!--Last Day of School-->
                <div class="form-group row">
                    <div class="col-sm-2 col-form-label">
                        <label for="lastDayOfClass" class="font-weight-bold"">What is the last day of school?:</label>
                    </div>
                    <div class="col-sm-10">
                        <input type="date" name="lastDayOfClass" id="lastDayOfClass" class="form-control">
                    </div>
                </div>
                <!--Submit Buttom-->
                <div class="form-group row">
                    <div class="col-sm-12 pb-3">
                        <button class="btn btn-warning btn-lg ml-2" aria-pressed="false">GO!</button>
                    </div>
                </div>
            </form>

        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





