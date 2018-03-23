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
public class UserRoleRouter extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RouteUserHelper helper = new RouteUserHelper();

        String userType = request.getParameter("userType");

        String url = helper.routeUserByRole(userType);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }
}
    
    
    
    
    
