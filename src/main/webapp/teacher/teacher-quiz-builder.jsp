<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" scope="session" value="Teacher Quiz Builder"/>
<c:set var="heading" scope="session" value="Quiz Builder"/>
<c:set var="author" scope="session" value="JS Caughlin"/>
<%--
  Created by IntelliJ IDEA.
  User: josephcaughlin
  Date: 4/13/18
  Time: 4:47 PM
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
        <!--Sidebar Menu-->
        <div class="col-lg-2">
            <jsp:include page="../sidebar-menu.jsp"/>
        </div><!--Sidebar Column End-->

        <!--Center Column-->
        <div class="col-lg-10">
            <div class="card">
                <h4 class="card-title text-center">Quiz Outlet</h4>
                <div class="card-body">
                    <ul class="list-group">
                        <div class="row p-2">
                            <div class="col-sm-8">
                                <li class="list-group-item">Name Of Quiz</li>
                            </div>
                            <div class="col-sm-4">
                                <button class="btn btn-link">REMOVE</button>
                            </div>
                        </div>
                        <div class="row p-2">
                            <div class="col-sm-8">
                                <li class="list-group-item">Name Of Quiz</li>
                            </div>
                            <div class="col-sm-4">
                                <button class="btn btn-link">REMOVE</button>
                            </div>
                        </div>
                        <div class="row p-2">
                            <div class="col-sm-8">
                                <li class="list-group-item">Name Of Quiz</li>
                            </div>
                            <div class="col-sm-4">
                                <button class="btn btn-link">REMOVE</button>
                            </div>
                        </div>
                    </ul>
                    <div class="row p-2">

                        <label for="quizName" class="font-weight-bold">Add a New Quiz:
                            <input type="text" class="form-control" id="quizName"/>
                        </label>
                        </div>
                <div class="row p-2">
                    <div class="offset-sm-3 col-sm-4">
                        <button class="btn btn-outline-success">Add New Quiz</button>
                    </div>
                    </div>
                </div>
            </div>


            <form method="post" class="border p-4" action="createQuiz">
                <div class="col-lg-12">
                    <h1 class="display-4">Let's Create a Quiz!</h1>
                </div>

                <div class="col-sm-9 pb-3">
                    <label for="question" class="sr-only">Enter Question</label>
                    <input type="text" class="form-control" id="question" name="question" placeholder="Enter Question">
                </div>

                <div class="col-sm-9 pb-3">
                    <label for="correctAnswer" class="sr-only">Enter the Correct Answer</label>
                    <input type="text" class="form-control" id="correctAnswer" name="correctAnswer"
                           placeholder="Enter the Correct Answer">
                </div>

                <div class="col-sm-9 pb-3">
                    <label for="wrongAnswerA" class="sr-only">Enter a Wrong Answer</label>
                    <input type="text" class="form-control" id="wrongAnswerA" name="wrongAnswerA"
                           placeholder="Enter Wrong Answer">
                </div>

                <div class="col-sm-9 pb-3">
                    <label for="wrongAnswerB" class="sr-only">Enter Another Wrong Answer</label>
                    <input type="text" class="form-control" id="wrongAnswerB" name="wrongAnswerB"
                           placeholder="Enter Wrong Answer">
                </div>

                <div class="col-sm-9 pb-3">
                    <label for="wrongAnswerC" class="sr-only">Enter One Last Wrong Answer</label>
                    <input type="text" class="form-control" id="wrongAnswerC" name="wrongAnswerC"
                           placeholder="Enter Wrong Answer">
                </div>
                <div class="col-sm-6 pb-3">
                    <button class="btn btn-info">Submit!</button>
                    <button class="btn btn-success">I'm Done</button>
                </div>

            </form>

        </div><!--Center Column End-->
    </div> <!--End Row-->

    <jsp:include page="../footer.jsp"/>

</div><!--End Container-->

</body>
</html>





