package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;

import edu.matc.entity.Address;
import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRoles;
import edu.matc.persistence.GenericDao;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "CreateNewUserServlet", urlPatterns = "/signup")
public class CreateNewUserServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();
        UserRoles userRole = new UserRoles();
        Address address = new Address();
        GenericDao userDao = new GenericDao(User.class);


        String firstName = request.getParameter("firstName");
        logger.debug("User First Name: " + firstName);
        String lastName = request.getParameter("lastName");
        logger.debug("User Last Name: " + lastName);
        String userName = request.getParameter("username");
        logger.debug("User's user name: " + userName);
        String password = request.getParameter("password");
        logger.debug("User's Password: " + password);
        String streetAddress = request.getParameter("address");
        logger.debug("User's Street Address: " + address);
        String cityName = request.getParameter("city");
        logger.debug("User's City: " + cityName);
        String state = request.getParameter("state");
        logger.debug("User's State: " + state);
        String zipcode = request.getParameter("zipCode");
        logger.debug("User Zip Code: " + zipcode);
        String email = request.getParameter("email");
        logger.debug("User's Email: " + email);
        String areaCode = request.getParameter("areacode");
        logger.debug("User's Area Code: " + areaCode);
        String phone = request.getParameter("phone");
        logger.debug("User's Phone: " + phone);
        String userBirthday = request.getParameter("birthday");
        logger.debug("User's String Birthday: "+ userBirthday);
        LocalDate birthday = LocalDate.parse(userBirthday);
        logger.debug("User's LocalDate Birthday: " + birthday);



        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        userRole.setUserName(userName);
        user.setUserPassword(password);
        /*address.setStreetAddress(streetAddress);
        address.setCityName(cityName);
        address.setStateName(state);
        address.setZipCode(zipcode);
        address.setUserEmail(email);
        address.setAreaCode(areaCode);
        address.setUserPhoneNumber(phone);
        address.setUserBirthDate(birthday);*/

        userRole.setUserName(userName);
        userRole.setRoleName(RoleName.PENDING);
        user.setUserRole(userRole);

        int userId = userDao.insert(user);
        logger.debug("My new user has an ID of " + userId);

        request.setAttribute("user", user);

        String url = "/user-added-confirmation.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
