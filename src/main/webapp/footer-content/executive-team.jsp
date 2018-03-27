<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Executive Team"/>
<c:set var="heading" scope="session" value="Meet Our Leadership Team"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/22/18
  Time: 3:13 PM
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
            <div class="card">
                <h1 class="card-header mx-auto">Our Executive Team</h1>
                <div class="card-body">
                    <img class="card-img-top" src="images/paul-manafort-roger-stone-lee-atwater.jpg" alt="Executive Team">
                    <p class="card-text text-center"><small class="text-muted">Paul, Rog, Lee</small></p>
                </div>
            </div>
        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





