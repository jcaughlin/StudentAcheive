package edu.matc.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "TeacherRouter", urlPatterns = "/teacherRouter")
public class TeacherRouter extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String teacherPortalChoice = request.getParameter("teacherPortalChoice");

        logger.info(teacherPortalChoice);
        String url = routeTeacher(teacherPortalChoice);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    /**
     * @param portalChosen
     * @return The String url for the site that the user has chosen.
     */
    private String routeTeacher(String portalChosen) {
        String url;

        switch (portalChosen) {
            case "createQuiz":
                return "/teacher/teacher-quiz-builder.jsp";

            case "showStudentReport":
                return "teacher/teacher-student-report.jsp";

            case "viewOrEditClassPage":
                return "teacher/teacher-homeroom.jsp";

            case "complainAboutStudents":
                return "teacher/teacher-complain.jsp";

            default:
                return "../error-pages/500.jsp";

        }
    }
}
    
    
    
    
    
