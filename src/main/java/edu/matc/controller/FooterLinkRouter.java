package edu.matc.controller;

import java.io.IOException;
import java.util.*;

import edu.matc.utility.RouteUserHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "FooterLinkRouter", urlPatterns = "/footerLink")
public class FooterLinkRouter extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RouteUserHelper helper = new RouteUserHelper();

        String pageRequested = request.getParameter("pageRequested");

        String url = helper.footerLinkRouter(pageRequested);

        logger.info(url);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}
    
    
    
    
    
