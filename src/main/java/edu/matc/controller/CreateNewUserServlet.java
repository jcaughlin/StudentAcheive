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


@WebServlet(name = "CreateNewUserServlet", urlPatterns = "/signup")
public class CreateNewUserServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private User user ;
    private UserRole userRole;
    private Address address;
    private GenericDao userDao ;
    private GenericDao addressDao;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        user = new User();
        userRole = new UserRole();
        address = new Address();
        userDao = new GenericDao(User.class);
        addressDao = new GenericDao(Address.class);

        String firstName = request.getParameter("firstName");

        String lastName = request.getParameter("lastName");

        String userName = request.getParameter("username");

        String password = request.getParameter("password");

        String email = request.getParameter("email");

        String userBirthday = request.getParameter("birthday");
        validateAndSetUserBirthday(userBirthday);

        // Binding  Data to the Address Entity
        String streetAddress = request.getParameter("address");

        String unitNumber = request.getParameter("unit");

        String cityName = request.getParameter("city");

        String state = request.getParameter("state");

        String zipcode = request.getParameter("zipCode");

        String areaCode = request.getParameter("areacode");

        String phone = request.getParameter("phone");


        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setUserEmail(email);

        address.setStreetAddress(streetAddress);
        address.setUnitNumber(unitNumber);
        address.setCityName(cityName);
        address.setStateName(state);
        address.setZipCode(zipcode);
        address.setAreaCode(areaCode);
        address.setUserPhoneNumber(phone);

        logger.info(address);

        user.addAddress(address);


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
        logger.info(user.toString());
    }

    private void validateAndSetUserBirthday(String userBirthday) {
        if (!(userBirthday).equals("")) {
            LocalDate birthday = LocalDate.parse(userBirthday);
            logger.info("Birthday?" + birthday);
            user.setUserBirthDate(birthday);
        } else {
            logger.info(userBirthday + "was null and empty");
        }
    }
}
    
    
    
    
    
