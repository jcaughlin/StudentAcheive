<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="User Added"/>
<c:set var="heading" scope="session" value="Welcome To Student Achieve"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 2/19/18
  Time: 11:19 PM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<jsp:include page="head.jsp"/>
<body>
<div class="container py-2">
    <jsp:include page="jumbotron.jsp"/>
    <hr>
    <div class="row pb-2">
        <div class="col-lg-12">
            <h1 class="text-center">Welcome: ${user.userName}</h1>
        </div>
    </div><!--End Row-->

    <div class="row">
        <div class="col-lg-12">
            <h3 class="text-center">Please Confirm Your Registration info</h3>
        </div>
    </div><!--End Row-->


    <div class="row">
        <div class="col-lg-12">
            <table class="table table-striped table-bordered">
                <thead>
                <tr scope="row">
                    <th scope="col">User Name</th>
                    <th scope="col">First Name</th>
                    <th scope="col">Last Name</th>
                    <th scope="col">Email Address</th>
                    <th scope="col">User Status</th>
                    <th scope="col">D.O.B.</th>
                 <!--   <th scope="col">Addresses</th>-->



                </tr>
                </thead>
                <tr scope="row">
                    <td>${user.userName}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.userEmail}</td>
                    <td>${user.userRole.roleName}</td>
                    <td>${user.userBirthDate}</td>
                    <!--<td>${user.addresses}</td> -->
                </tr>
            </table>
        </div>
    </div><!--End Row-->
<div class="row">
    <div class="col-sm-9 pb-3">
        <button class="btn btn-primary btn-lg" aria-pressed="false">No</button>
        <button type="button" class="btn btn-info btn-lg" data-target="#uploadPhoto" data-toggle="modal">
            Upload Photo?!
        </button>
    </div>
</div>

    <div class="row">
        <div class="modal fade" id="uploadPhoto" role="dialog" aria-labelby="uploadPhoto" aria-hidden="true">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content py-4">
                    <div class="modal-header">
                        <h4 class="modal-title">Let's Upload A Photo!</h4>
                    </div>
                    <div class="modal-body">
                        <form class="py-3" action="uploadFile" method="post" enctype="multipart/form-data">

                            <!--Upload Photo-->
                            <div class="pb-4 col-sm-6 mx-auto">
                                <div class="custom-file">
                                    <input type="file" class="custom-file-input" id="customFile">
                                    <label class="custom-file-label" for="customFile">Choose file</label>
                                </div>
                            </div>

                            <!--Buttons-->
                            <div class="pb-2 col-sm-6 offset-3">
                                <button type="submit" class="btn btn-success" data-target="#uploadPhoto" data-toggle="modal">GO!</button>
                                <button type="button" class="btn btn-warning" id="no-image-selected">NO!</button>
                            </div>
                            <div class="pb-2 col-sm-6">
                                <small class="form-text text-muted">${uploadFailedMessage}</small>
                            </div>
                            <div id="confirmMessage">

                            </div>
                        </form>

                    </div>
                </div>
            </div>
        </div>
    </div>

    <jsp:include page="footer.jsp"/>
    <jsp:include page="javascript-links.jsp"/>
</div><!--End of Container-->
</body>
</html>


