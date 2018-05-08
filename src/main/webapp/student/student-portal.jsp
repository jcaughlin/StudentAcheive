<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Your Student Portal"/>
<c:set var="heading" scope="session" value="Student Portal"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/7/18
  Time: 4:19 PM
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
            <form class="form border py-4" method="post" action="Router">

                <div class="col-sm-6">
                    <label for="studentSelect" class="sr-only">Choose Teacher Portal</label>
                    <select id="studentSelect" class="form-control" name="studentSelect">
                        <option value="">Choose Portal</option>
                        <option value="viewGrades">View Grades</option>
                        <option value="takeQuiz">Take a Quiz</option>
                        <option value="complainAboutTeacher">File a teacher complaint</option>
                    </select>
                </div>
                <div class="col-sm-12 py-3">
                    <button class="btn btn-dark ">GO!</button>
                </div>
            </form>
            <a href="takeQuiz" class="btn btn-primary">Take Quiz</a>
        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





