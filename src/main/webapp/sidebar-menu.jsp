<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/13/18
  Time: 6:32 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<nav class="navbar navbar-toggleable-md">


    <!-- Collapse button -->
    <button class="navbar-toggler d-block d-sm-none" type="button" data-toggle="collapse" data-target="#sideBarMenu"
            aria-controls="sideBarMenu"
            aria-expanded="false" aria-label="Toggle navigation"><span class="dark-blue-text">Menu <i
            class="fa fa-bars fa-1x"></i></span></button>

    <!-- Collapsible content -->
    <div class="collapse navbar-collapse" id="sideBarMenu" role="navigation">


        <ul class="navbar-nav font-weight-bold">

        <li class="nav-item">

            <a href="link?pageRequested=calendar" class="list-group-item ">Academic Calendar</a>

        </li>

        <a href="link?pageRequested=homeroom" class="list-group-item ">Teacher's Homeroom</a>

        <a href=link?pageRequested=lunch" class="list-group-item ">What's for Lunch?</a>

        <a href=link?pageRequested=contacts" class="list-group-item">School Contacts</a>

        <a href=link?pageRequested=newsletter" class="list-group-item ">Newsletter</a>

        <a href=link?pageRequested=generalinfo" class="list-group-item ">General Information</a>
        </ul>
    </div>

</nav>




