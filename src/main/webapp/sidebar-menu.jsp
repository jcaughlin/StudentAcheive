<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/13/18
  Time: 6:32 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<nav class="navbar navbar-expand-sm">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#sideMenu">
        <span><i class="fa fa-bars fa-1x"></i> Menu</span>
    </button>

    <div class="collapse navbar-collapse" id="sideMenu">
        <ul class="navbar-nav flex-column list-group font-weight-bold">
            <li><a href="link?pageRequested=calendar" class="list-group-item list-group-item-action">Academic Calendar</a></li>
            <li><a href="link?pageRequested=homeroom" class="list-group-item list-group-item-action">Teacher's Homeroom</a></li>
            <li><a href="link?pageRequested=lunch" class="list-group-item list-group-item-action">What's for Lunch?</a></li>
            <li><a href="link?pageRequested=contacts" class="list-group-item list-group-item-action">School Contacts</a></li>
            <li><a href="link?pageRequested=newsletter" class="list-group-item list-group-item-action">Newsletter</a></li>
            <li><a href="link?pageRequested=generalinfo" class="list-group-item list-group-item-action">General Information</a></li>
        </ul>
    </div>
</nav>




