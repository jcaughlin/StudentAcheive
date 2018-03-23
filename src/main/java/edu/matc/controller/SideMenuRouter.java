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


@WebServlet(name = "LinkRouterServlet", urlPatterns = "/link")
public class SideMenuRouter extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        RouteUserHelper routeUser = new RouteUserHelper();

        String pageRequested = request.getParameter("pageRequested");

        String url = routeUser.pageRouter(pageRequested);
        logger.info(url);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

}
    
    
    
    
    
