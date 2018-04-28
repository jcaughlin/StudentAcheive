package edu.matc.controller;

import edu.matc.utility.RouteUserHelper;
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

        RouteUserHelper routeUser = new RouteUserHelper();

        String teacherPortalChoice = request.getParameter("teacherChoice");

        logger.info("The Portal Chosen Was:" + teacherPortalChoice);


        String url = routeUser.routeTeacher(teacherPortalChoice);

        logger.info(url);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


}
    
    
    
    
    
