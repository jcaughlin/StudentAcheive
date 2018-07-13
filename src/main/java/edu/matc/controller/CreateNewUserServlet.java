package edu.matc.controller;

import edu.matc.entity.Address;
import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.persistence.GenericDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "CreateNewUserServlet", urlPatterns = "/signup")
public class CreateNewUserServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        User user = new User();
        UserRole userRole = new UserRole();
        Address address = new Address();
        List userAdresses = new ArrayList<Address>();
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

        // LocalDate birthday = LocalDate.parse(userBirthday);


        if (!(userBirthday).equals("")) {
            LocalDate birthday = LocalDate.parse(userBirthday);
            user.setUserBirthDate(birthday);
        } else {
            logger.info(userBirthday + "was null and empty");
        }


        String streetAddress = request.getParameter("address");
        String unitNumber = request.getParameter("unit");
        String cityName = request.getParameter("city");
        String state = request.getParameter("state");
        String zipcode = request.getParameter("zipCode");
        String email = request.getParameter("email");
        logger.info("THe email is " + email);
        String areaCode = request.getParameter("areacode");
        String phone = request.getParameter("phone");


        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setUserEmail(email);
        // user.setUserBirthDate(birthday);

        address.setStreetAddress(streetAddress);
        address.setUnitNumber(unitNumber);
        address.setCityName(cityName);
        address.setStateName(state);
        address.setZipCode(zipcode);
        address.setAreaCode(areaCode);
        address.setUserPhoneNumber(phone);

        userAdresses.add(address);

        userRole.setUserName(userName);
        userRole.setRoleName(RoleName.PENDING);

        user.setUserRole(userRole);
        user.setAddresses(userAdresses);
        address.getUser().add(user);


        int userId = userDao.insert(user);
        logger.debug("My new user has an ID of " + userId);

        request.setAttribute("user", user);

        String url = "/user-added-confirmation.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
