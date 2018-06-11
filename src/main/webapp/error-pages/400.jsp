<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Error 400-Bad Request"/>
<c:set var="heading" scope="session" value="400 Error"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/3/18
  Time: 5:47 PM
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
            <h1 class="text-center">Bad Request</h1>
        </div>
        <div class="col-sm-12">
            ${requestScope['javax.servlet.error.message']}
        </div>
    </div>
</div>


<jsp:include page="../footer.jsp"/>

