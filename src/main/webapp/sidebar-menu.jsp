<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/13/18
  Time: 6:32 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" %>

<!--##TODO PRIORITY 2:DETERMINE WHERE TO CHECK FOR SESSION AND IF EXISTS EXCLUDE LOGOUT BUTTON-->
<nav class="navbar navbar-expand-sm">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#sideMenu">
        <span><i class="fa fa-bars fa-1x"></i> Menu</span>
    </button>

    <div class="collapse navbar-collapse" id="sideMenu">
        <ul class="navbar-nav flex-column list-group font-weight-bold">
            <li><a href="linkRouter?origin=sideBarMenu&pageRequested=calendar" class="list-group-item list-group-item-action">Academic Calendar</a></li>
            <li><a href="linkRouter?origin=sideBarMenu&pageRequested=homeroom" class="list-group-item list-group-item-action">Teacher's Homeroom</a></li>
            <li><a href="linkRouter?origin=sideBarMenu&pageRequested=lunch" class="list-group-item list-group-item-action">What's for Lunch?</a></li>
            <li><a href="linkRouter?origin=sideBarMenu&pageRequested=contacts" class="list-group-item list-group-item-action">School Contacts</a></li>
            <li><a href="linkRouter?origin=sideBarMenu&pageRequested=newsletter" class="list-group-item list-group-item-action">Newsletter</a></li>
            <li><a href="linkRouter?origin=sideBarMenu&pageRequested=generalinfo" class="list-group-item list-group-item-action">General Information</a></li>

            <c
            <c:if test = "{pageType ne 'index-page'}">
                <log:info message="${myException}" />
                <li><a href="logout" class="list-group-item list-group-item-action">Log Out</a></li>
                <p>Taco</p>
            </c:if>

        </ul>
    </div>
</nav>




