<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Today's Lunch"/>
<c:set var="heading" scope="session" value="THe Lunch Project"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/6/18
  Time: 11:42 AM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" value="Welcome-Student Achieve!"/>
<c:set var="author" value="JS Caughlin"/>
<c:set var="heading" scope="request" value="to Student Achieve!!"/>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="head.jsp"/>

<body>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>

    <div class="row">
        <!--Sidebar Menu-->
        <div class="col-lg-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div><!--Sidebar Column End-->

        <!--Center Column-->
        <div class="col-lg-10">

            <div class="card mb-3">
                <h1 class="card-title">Walking Tacos</h1>
                <img class="card-img-top" src="images/walkingTacos.jpg" alt="Delicious Walking Tacos">
            <div class="card-block">
                <h4 class="card-title">Walking Tacos</h4>
                <p class="card-text">Tacos You Can Eat When you are walking</p>
            </div>
            </div>

        </div>
       <!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="footer.jsp"/>

</div><!--End Container-->

</body>
</html>





