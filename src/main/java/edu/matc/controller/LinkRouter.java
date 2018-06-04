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


@WebServlet(name = "LinkRouter", urlPatterns = "/linkRouter")
public class LinkRouter extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        final String jspSuffix = ".jsp";

        String pageRequested = request.getParameter("pageRequested");
        String originOfRequest = request.getParameter("origin");

        String filePath = determineFilePath(originOfRequest);

        String url = filePath + pageRequested + jspSuffix;

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    /**
     * @param originOfRequest html element calling  the link.
     * @return filePath of pageRequest
     */
    private String determineFilePath(String originOfRequest) {
        String filePath = "";
        if (originOfRequest.equals("footer")) {
            filePath = "/footer-content/";

        } else if (originOfRequest.equals("sideBarMenu")) {
            filePath = "/menu-content/";
        }

        return filePath;

    }


}
    
    
    
    
    
