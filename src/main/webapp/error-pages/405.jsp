<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Error 405-Method Not Allowed"/>
<c:set var="heading" scope="session" value="Whatever we tried to do. We shouldn't Have!"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/20/18
  Time: 2:37 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../head.jsp"/>

<body>
<div class="container py-2">

    <jsp:include page="../jumbotron.jsp"/>


    <div class="row">
        <div class="col-sm-12">
            <h1 class="text-center">The boss made us (The Server Do Something We Weren't Supposed to DO</h1>
        </div>
    </div>
</div>

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





