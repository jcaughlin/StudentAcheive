package edu.matc.controller;

import java.io.IOException;
import java.util.*;

import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

//#TODO SHOW TEACHERS AND SHOW STUDENTS

@WebServlet(name = "AdminReports", urlPatterns = "/adminReports")
public class AdminReportsController extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url;
        UserDao userDao;
        List users;

        String reportRequested = request.getParameter("reportRequested");
        logger.info(reportRequested);

        if(reportRequested.equals("addUser")) {
            url = "/admin/admin-add-user.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        } else if(reportRequested.equals("showAll")) {
            userDao = new UserDao();
            logger.info("Made It");
            url = "/admin/admin-reports.jsp";

            request.setAttribute("users", userDao.getAllUsers());

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        } else if(reportRequested.equals("")) {
            String errorMessage = "Please Make a Selection";
            request.setAttribute("/errorMessage",errorMessage);
            response.sendRedirect("/admin/admin-landing.jsp");
        }
    }
}
    
    
    
    
    
