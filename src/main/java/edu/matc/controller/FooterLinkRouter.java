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


@WebServlet(name = "FooterLinkRouter", urlPatterns = "/footerLink")
public class FooterLinkRouter extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RouteUserHelper helper = new RouteUserHelper();

        String pageRequested = request.getParameter("pageRequested");
        logger.info(pageRequested);

        String url = helper.footerLinkRouter(pageRequested);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);

    }

}
    
    
    
    
    
