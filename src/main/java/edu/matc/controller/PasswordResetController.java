package edu.matc.controller;

import java.io.IOException;
import java.util.List;

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

        String email = request.getParameter("email");

        List user =  userDao.getUserByProperty(email,"email");

        String url = "index.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


}
    
    
    
    
    
