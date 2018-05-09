package edu.matc.controller;

import java.io.IOException;


import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "AdminAdministration", urlPatterns = "/adminAction")
public class AdminAdministration extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    UserDao userDao = new UserDao();
    User user;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String userId = request.getParameter("id");
        int userIdToBeModified = Integer.parseInt(userId);
        String actionChosen = request.getParameter("actionChosen");

        logger.info("Action Requested: " + actionChosen);
        user = userDao.getById(userIdToBeModified);

        logger.info(userId);


        if(actionChosen.equals("updateUser")) {
            request.setAttribute("user", user);
            String url = "/admin/admin-update-user.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        } else if(actionChosen.equals("deleteUser")) {

            String deleteSuccess = "User has been deleted";
            userDao.delete(user);


            logger.info("Delete");
            request.setAttribute("deleteSuccess", deleteSuccess);
            response.sendRedirect("/admin/admin-reports.jsp");

        } else {
            String noChoiceRecorded = "Your selection was not recorded. Please try again.";
            request.setAttribute("actionFailed", noChoiceRecorded);
            response.sendRedirect("/admin/admin-reports.jsp");
        }


    }
}
    
    
    
    
    
