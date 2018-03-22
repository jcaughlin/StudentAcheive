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


@WebServlet(name = "AdminDelete", urlPatterns = "/adminDelete")
public class AdminDelete extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    UserDao userDao = new UserDao();
    User user;
    User user2;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");

        logger.info(id);

        int useridToDelete = Integer.parseInt(id);

        logger.info(useridToDelete);
        user = userDao.getById(useridToDelete);

        int currentid = user.getId();

        logger.info("getId for current is: " + currentid);


        logger.info("test");
        userDao.delete(user);

        logger.info(user2 = userDao.getById(currentid));

        if(user2 == null) {

            logger.info(useridToDelete);

            String url = "/admin/admin-delete-results.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } else {

            String url = "/admin/admin-delete-failure.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);


        }
    }
}
    
    
    
    
    
