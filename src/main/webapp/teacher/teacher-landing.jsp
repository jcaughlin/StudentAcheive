<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="session" value="Teacher Classroom"/>
<c:set var="heading" scope="session" value="Welcome To Your Classroom"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/7/18
  Time: 4:17 PM
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

        <!--Center Div-->
        <div class="col-lg-10">
            <form class="form border py-4" method="post" action="teacherRouter">

                <div class="col-sm-6">
                    <label for="teacherSelect" class="sr-only">Choose Teacher Portal</label>
                    <select id="teacherSelect" class="form-control" name="teacherChoice">
                        <option value="">Choose Portal</option>
                        <option value="showStudentReports">Class List</option>
                        <option value="createQuiz">Create A New Quiz</option>
                        <option value="upload-quiz">Upload A Quiz</option>
                        <option value="viewOrEditClassPage">My Classroom</option>
                        <option value="complain">Complain About Students</option>
                    </select>
                </div>
                <div class="col-sm-12 py-3">
                    <button class="btn btn-dark ">GO!</button>
                </div>
            </form>

        </div>
    </div> <!--End Row-->


    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





