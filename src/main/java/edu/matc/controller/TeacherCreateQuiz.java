package edu.matc.controller;

import java.io.IOException;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "TeacherCreateQuiz", urlPatterns = "/createQuiz")
public class TeacherCreateQuiz extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theQuestion = request.getParameter("question");
        String correctAnswer = request.getParameter("correctAnswer");
        String firstWrongAnswer = request.getParameter("wrongAnswerA");
        String secondWrongAnswer = request.getParameter("wrongAnswerB");
        String thirdWrongAnswer = request.getParameter("wrongAnswerC");

        logger.info(theQuestion);
        logger.info(correctAnswer);
        logger.info(firstWrongAnswer);
        logger.info(secondWrongAnswer);
        logger.info(thirdWrongAnswer);




        String url = "/teacher/teacher-quiz-created.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
