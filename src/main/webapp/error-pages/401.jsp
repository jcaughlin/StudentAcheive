<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Error 401-Unauthorized"/>
<c:set var="heading" scope="session" value="header"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 3/3/18
  Time: 5:42 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:include page="partials/head.jsp"/>

<jsp:include page="partials/header.jsp"/>

<!-- Your Content Goes Here -->

<jsp:include page="1"/>

<jsp:include page="partials/footer.jsp"/>

