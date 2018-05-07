<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="title"/>
<c:set var="heading" scope="session" value="header"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 5/5/18
  Time: 10:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<hr>
<div class="container-fluid">
    <div class="row py-2 d-flex align-items-center antique-white-background">
    <!--<div class="row">-->
        <!--##TODO PRIORITY 2:DETERMINE WHERE TO CHECK FOR SESSION AND IF EXISTS EXCLUDE LOGOUT BUTTON-->


        <div class="col-sm-4 border pt-2">
            <nav class="navbar navbar-expand-sm">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerLeft">
                        <span>
                            <i class="fa fa-bars fa-1x"></i> Business Solution</span>
                </button>
                <div class="collapse navbar-collapse" id="footerLeft">
                    <div class="d-flex flex-column">
                        <h6 class="text-uppercase font-weight-bold d-none"> Business Solutions</h6>
                        <ul class="navbar-nav flex-column list-group">
                            <li>
                                <a href="/">Contact Sales</a>
                            </li>
                            <li>
                                <a href="/">Success Stories</a>
                            </li>
                            <li>
                                <a href="footerLink?pageRequested=executive-team">Executive Team</a>
                            </li>
                            <li>
                                <a href="https://www.scholastic.com/teachers/books/dog-man-by-dav-pilkey/" target="_blank">The Greatest Story of ever!!!</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>


        <div class="col-sm-4 border pt-2">
            <nav class="navbar navbar-expand-sm">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerCenter">
                            <span><i class="fa fa-bars fa-1x"></i> Student Achieve</span>
                </button>
                <div class="collapse navbar-collapse" id="footerCenter">
                    <div class="d-flex flex-column">
                        <h6 class="text-uppercase font-weight-bold d-none">Student Achieve</h6>
                        <address>
                            1009 Winston Way
                            <br> Waunakee WI 53597
                            <br>
                            <abbr title="Phone">P:</abbr> (608) 630-0844
                            <br>
                            <a href="mailto:#">info@studentachieveco.com</a>
                        </address>
                    </div>
                </div>
            </nav>
        </div>



        <div class="col-sm-4 border pt-2">
            <nav class="navbar navbar-expand-sm">
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#footerRight">
                            <span>
                                <i class="fa fa-bars fa-1x"></i> Developers</span>
                </button>

                <div class="collapse navbar-collapse" id="footerRight">
                    <div class="d-flex flex-column">
                        <h6 class="text-uppercase font-weight-bold d-none">Developers</h6>
                        <ul class="navbar-nav flex-column list-group">
                            <li>
                                <a href="/">GitHub</a>
                            </li>
                            <li>
                                <a href="/">Affiliate Program</a>
                            </li>
                            <li>
                                <a href="footerLink?pageRequested=dark-web">Dark Web</a>
                            </li>
                            <li>
                                <a href="footerLink?pageRequested=darkest-web">Darkest Web</a>
                            </li>
                            <li>
                                <a href="https://www.nhl.com/penguins" target="_blank">Liam's Favorite Hockey Team</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </div>
    </div>

        <div class="row d-flex text-center">
            <div class="col-sm-12">
                <p class="text-muted" id="date"><span><i class="fa fa-copyright fa-2x mr-2"></i></span></p>
            </div>
        </div>
</div>







