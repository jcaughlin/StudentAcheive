package edu.matc.controller;

import java.io.IOException;
import edu.matc.utility.RouteUserHelper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "RouteUserController", urlPatterns = "/routeUser")
public class RouteUserController extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userType = request.getParameter("userType");

        if (userType.equals("admin")) {

            String url = "/admin/admin-landing.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        } else if(userType.equals("student")) {

            String url = "/student/student-portal.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);

            dispatcher.forward(request, response);
        } else if(userType.equals("teacher")) {

            String url = "/teacher/teacher-landing.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } else {

            String url = "/lunch-calendar.jsp";

            logger.info("made it");


            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

    }
}
    
    
    
    
    
