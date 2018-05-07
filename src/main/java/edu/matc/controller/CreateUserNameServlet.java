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


@WebServlet(name = "CreateUserNameServlet", urlPatterns = "/signUpNewUser")
public class CreateUserNameServlet extends HttpServlet {

    // TODO DAO user getUserByUser to check if exists so no duplicates
    // TODO Break up server side validation into separate method
    private final Logger logger = LogManager.getLogger(this.getClass());



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String mismatchError = "Password Entries don't match. Try again";
        String missingValueError = "You are missing some Data";

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");
        String gRecaptchaResponse = request.getParameter("g-recaptcha-response");

        logger.info(request.getContextPath());

        if(username == null || password == null || passwordConfirm == null){
            request.setAttribute("missingField",missingValueError );
            response.sendRedirect( request.getContextPath());

        } else if (!password.equals(passwordConfirm)) {
            Boolean bool = !password.equals(passwordConfirm);
            logger.info(bool);
            request.setAttribute("passwordMismatch", mismatchError);
            response.sendRedirect(request.getContextPath());

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

    
    
    
    
    
