package edu.matc.controller;

import java.io.IOException;
import java.util.List;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "ForgotPasswordController", urlPatterns = "/forgotPassword")
public class PasswordResetController extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        UserDao userDao = new UserDao();
        String passwordResetConfirmationMessage = "Your Account has been retrieved. Check your email for instructions on how to reset your password";

        String email = request.getParameter("email");

        try {

            List<User> user = userDao.getUserByProperty(email, "email");

            String url = "/forgot-password.jsp";

            request.setAttribute("passwordReset", passwordResetConfirmationMessage);

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } catch (Exception exception) {
            logger.info(exception);
        }
    }


}
    
    
    
    
    
