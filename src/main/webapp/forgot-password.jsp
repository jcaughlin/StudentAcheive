<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="title" scope="session" value="Password Reset"/>
<c:set var="heading" scope="session" value="Password Reset Success"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/20/18
  Time: 10:12 AM
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
        <!--Sidebar Menu-->
        <div class="col-lg-2">
            <jsp:include page="sidebar-menu.jsp"/>
        </div><!--Sidebar Column End-->

        <!--Center Column-->

                <div class="col-lg-10 pb-3">
                    <p>${resetConfirmationMessageToUserAgent}</p>
        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="footer.jsp"/>

</div><!--End Container-->

</body>
</html>





