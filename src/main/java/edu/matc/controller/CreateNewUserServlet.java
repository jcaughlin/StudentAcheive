package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import edu.matc.entity.Address;
import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRole;
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
        UserRole userRole = new UserRole();
        Address address = new Address();
        List userAddress = new ArrayList<Address>();
        GenericDao userDao = new GenericDao(User.class);
        GenericDao addressDao = new GenericDao(Address.class);


        String firstName = request.getParameter("firstName");
        logger.debug("User First Name: " + firstName);
        String lastName = request.getParameter("lastName");
        logger.debug("User Last Name: " + lastName);
        String userName = request.getParameter("username");
        logger.debug("User's user name: " + userName);
        String password = request.getParameter("password");
        logger.debug("User's Password: " + password);

        String userBirthday = request.getParameter("birthday");
        logger.debug("User's String Birthday: "+ userBirthday);
        LocalDate birthday = LocalDate.parse(userBirthday);
        logger.debug("User's LocalDate Birthday: " + userBirthday);




        String streetAddress = request.getParameter("address");
        logger.debug("User's Street Address: " + address);
        String unitNumber = request.getParameter("unit");
        logger.debug("Unit #: " + unitNumber);
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




        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setUserEmail(email);
        user.setUserBirthDate(birthday);

        address.setStreetAddress(streetAddress);
        address.setUnitNumber(unitNumber);
        address.setCityName(cityName);
        address.setStateName(state);
        address.setZipCode(zipcode);
        address.setAreaCode(areaCode);
        address.setUserPhoneNumber(phone);
        // userAddress.add(address);

        logger.info("Address Object: " + address);

        userRole.setUserName(userName);
        userRole.setRoleName(RoleName.PENDING);
        user.setUserRole(userRole);
        user.setAddress(userAddress);

        int userId = userDao.insert(user);
        logger.debug("My new user has an ID of " + userId);

        request.setAttribute("user", user);

        String url = "/user-added-confirmation.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
