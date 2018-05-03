package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "CreateUserNameServlet", urlPatterns = "/signUpNewUser")
public class CreateUserNameServlet extends HttpServlet {

    // TODO DAO user getUserByUser to check if exists so no duplicates
    private final Logger logger = LogManager.getLogger(this.getClass());
    private UserDao userDao;


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        String mismatchError = "Password Entries don't match. Try again";
        String userAlreadyExistsMessage = "User Name Already Exists. Please Choose Another";


        String username = request.getParameter("username");
        logger.info("User Name is: " + username);
        String password = request.getParameter("password");
        String passwordConfirm = request.getParameter("passwordConfirm");

        String gRecaptchaResponse = request
                .getParameter("g-recaptcha-response");

        if (!password.equals(passwordConfirm)) {
            request.setAttribute("passwordMismatch", mismatchError);
            response.sendRedirect("/index.jsp");
        } else {

            try {

                List<User> userList = userDao.getUserByProperty(username, "user_name");

                if (userList.size() > 0) {
                    logger.info("User Name Existed");
                    request.setAttribute("usernameAlreadyExists", userAlreadyExistsMessage);
                    response.sendRedirect("/index.jsp");

                } else {
                    request.setAttribute("username", username);
                    request.setAttribute("password", password);

                    String url = "/user-signup.jsp";

                    RequestDispatcher dispatcher =
                            getServletContext().getRequestDispatcher(url);
                    dispatcher.forward(request, response);

                }

            } catch (Exception exception) {
                logger.info("There has been an exception: " + exception);
            }
        }

    }
}


    
    
    
    
    
