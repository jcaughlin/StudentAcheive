<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="FlashCard Time"/>
<c:set var="heading" scope="session" value="Welcome to your Quiz"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 4/17/18
  Time: 7:43 AM
  To change this template use Preferences | File and Code Templates--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<jsp:include page="../head.jsp"/>

<body>
<div class="container py-2">
    <jsp:include page="../jumbotron.jsp"/>
    <hr>

    <div class="row">
        <p><i class="fas fa-chevron-circle-left"></i></p>

        <div class="col-lg-6 mx-auto">
                <div class="card py-5 my-5">

                    <div class="card-body">
                        <h3 class="card-title">
                            Who was the kid from the Simpson's ?
                        </h3>
                        <form method="post" action="submitAnswer">
                        <div class="form-check pb-2">
                            <input type="radio" class="form-check-input" name="quiz-response" value="firstResponse"
                                   id="firstResponse">
                            <label for="firstResponse" class="form-check-label">A. Bob</label>
                        </div>
                        <div class="form-check pb-2">
                            <input type="radio" class="form-check-input" name="quiz-response" value="secondResponse"
                                   id="secondResponse">
                            <label for="secondResponse" class="form-check-label">B. Ralph</label>
                        </div>
                        <div class="form-check pb-2">
                            <input type="radio" class="form-check-input" name="quiz-response" value="thirdResponse"
                                   id="thirdResponse">
                            <label for="thirdResponse" class="form-check-label">C. Fred</label>
                        </div>
                        <div class="form-check pb-2">
                            <input type="radio" class="form-check-input" name="quiz-response" value="forthResponse"
                                   id="forthResponse">
                            <label for"forthResponse" class="form-check-label">D. Ernesto</label>
                        </div>
                        <div class="pb-2">
                        </div>
                        <button class="btn btn-success" type="submit">GO!</button>
                    </div>
            </form>
            <div class="card-footer">${feedback}</div>
        </div><!--End Card-->
    </div><!--End Column-->

    <p><i class="fas fa-chevron-circle-right"></i></p>

</div>
</div><!--End Row-->

</div><!--End Container-->

</body>
</html>





