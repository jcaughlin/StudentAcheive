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


@WebServlet(name = "CreateUserNameServlet", urlPatterns = "/signUpNewUser")
public class CreateUserNameServlet extends HttpServlet {

    // TODO query database to make sure no duplicate usernames
    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao userDao = new UserDao();

        logger.info("I am here");
        logger.info("I am here");


        String error = "Password Entries don't match. Try again";


        String username = request.getParameter("username");
        logger.info(username);
        String password = request.getParameter("password");
        logger.info(password);
        String passwordConfirm = request.getParameter("passwordConfirm");
        logger.info(passwordConfirm);


        if (!password.equals(passwordConfirm)) {
            request.setAttribute("passwordmismatch", error);
            response.sendRedirect("/index.jsp");
        } else {


            request.setAttribute("username", username);
            request.setAttribute("password", password);

            String url = "/user-signup.jsp";

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        }

    }

}
    
    
    
    
    