package edu.matc.controller;

import java.io.IOException;
import java.util.*;
import edu.matc.entity.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "CreateUserServlet", urlPatterns = "/createUser")
public class CreateUserServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();

        String url = "createUser";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
