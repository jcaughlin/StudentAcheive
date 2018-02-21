<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="title"/>
<c:set var="heading" scope="session" value="header"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/19/18
  Time: 11:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="head.jsp"/>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>
    <h1>You are here!</h1>
    <jsp:include page="footer.jsp"/>
</div>


