package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import edu.matc.entity.Address;
import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "AdminUpdateUserServlet", urlPatterns = "/adminUpdateUser")
public class AdminUpdateUserServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // #TODO TRY ${user} or fix this as it will create another user
        UserDao userDao = new UserDao();
        Address address = new Address();
        User user = new User();
        user = userDao.getById(Integer.parseInt(request.getParameter("id")));

        String firstName = request.getParameter("firstName");
        logger.info("User First Name: " + firstName);
        if(firstName != null) {
            user.setFirstName(firstName);
        }
        
     
        String lastName = request.getParameter("lastName");
        logger.info("User Last Name: " + lastName);
        if(lastName != null) {
            user.setLastName(lastName);
        }
        
        String userName = request.getParameter("username");
        logger.info("User's user name: " + userName);
        if(userName != null) {
            user.setUserName(userName);
        }

        String password = request.getParameter("password");
        logger.info("User's Password: " + password);
        if(password != null) {
            user.setUserPassword(password);
        }

        String streetAddress = request.getParameter("address");
        logger.info("User's Street Address: " + streetAddress);
        if(address != null) {
            address.setStreetAddress(streetAddress);
        }

        String cityName = request.getParameter("city");
        logger.info("User's City: " + cityName);
        if(cityName != null) {
            address.setCityName(cityName);
        }

        String state = request.getParameter("state");
        logger.info("User's State: " + state);
            if(state != null) {
                address.setStateName(state);
            }

        String zipcode = request.getParameter("zipCode");
        logger.info("User Zip Code: " + zipcode);
        if(zipcode != null) {
            address.setZipCode(zipcode);
        }

        String email = request.getParameter("email");
        logger.info("User's Email: " + email);
        if(email != null) {
            user.setUserEmail(email);
        }

        String areaCode = request.getParameter("areacode");
        logger.info("User's Area Code: " + areaCode);
        if(areaCode != null) {
            address.setAreaCode(areaCode);
        }

        String phone = request.getParameter("phone");
        logger.info("User's Phone: " + phone);
        if(phone != null) {
            address.setUserPhoneNumber(phone);
        }

        String userBirthday = request.getParameter("birthday");
        LocalDate birthday = LocalDate.parse(userBirthday);
        if(birthday != null) {
            user.setUserBirthDate(birthday);
        }

        userDao.saveOrUpdate(user);

        String url = "/admin/admin-deleteuser-success.jsp";

        try {
            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } catch (IOException exception) {

            response.sendRedirect("/admin/admin-update-user.jsp");
        } catch (ServletException exception) {

        }
    }

}
    
    
    
    
    
