package edu.matc.controller;

import java.io.IOException;
import java.util.*;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "NewUser", urlPatterns = "/signup")
public class NewUser extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    UserDao dao;
    User user;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        .
        user.setUserName(request.getParameter("username"));
        user.setUserPassword(request.getParameter("password"));

        user.setFirstName(request.getParameter("firstName"));
        user.setLastName(request.getParameter("lastName"));
        user.setStreetAddress(request.getParameter("address"));
        user.setCityName(request.getParameter("city"));
        user.setStateName(request.getParameter("state"));
        user.setUserZipCode(Integer.parseInt(request.getParameter("zipCode")));
        user.setUserEmail(request.getParameter("email"));
        user.setAreaCode(Integer.parseInt(request.getParameter("areaCode")));
        user.setUserPhoneNumber(Integer.parseInt(request.getParameter("phone")));


        String url = "/user-signup.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
