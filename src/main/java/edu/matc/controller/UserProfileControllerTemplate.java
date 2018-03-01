package edu.matc.controller;

import java.io.IOException;
import edu.matc.utility.RouteUserHelper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "UserProfileControllerTemplate", urlPatterns = "/profile")
public class UserProfileControllerTemplate extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    RouteUserHelper helper;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String url;
        helper = new RouteUserHelper();
        String userType = request.getParameter("userType");

        url = helper.routeUserType(userType);


        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }



    /*private String routeUserType(String userType) {

        switch(userType) {

            case "student":
                return url = "student-profile.jsp";
                break;

            case "teacher":
                return url = "teacher-landing.jsp";
                break;

            case "admin":
                return url = "admin-landing.jsp";
                break;
        }

    }*/

}
    
    
    
    
    
