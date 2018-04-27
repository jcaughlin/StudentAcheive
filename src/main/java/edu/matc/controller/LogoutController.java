package edu.matc.controller;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "LogoutController", urlPatterns = "/logout")
public class LogoutController extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        logger.info("In the Logout Servlet");

        response.setHeader("Cache-Control", "no-cache, no-store");
        response.setHeader("Pragma","no-cache");


        HttpSession session = request.getSession(false);


        if(session != null) {
            session.invalidate();
        }

        logger.info("The Current Context Path: " + request.getContextPath());

        response.sendRedirect(request.getContextPath());

    }
}
    
    
    
    
    
