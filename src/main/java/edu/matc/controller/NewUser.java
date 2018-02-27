package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;

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

    UserDao userDao = new UserDao();
    User user;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        logger.debug(firstName);
        String lastName = request.getParameter("lastName");
        logger.debug(lastName);
        String userName = request.getParameter("username");
        logger.debug(userName);
        String password = request.getParameter("password");
        logger.debug(password);
        String address = request.getParameter("address");
        logger.debug(address);
        String cityName = request.getParameter("city");
        logger.debug(cityName);
        String state = request.getParameter("state");
        logger.debug(state);
        Integer zipcode = (Integer.parseInt(request.getParameter("zipCode")));
        logger.debug(zipcode);
        String email = request.getParameter("email");
        logger.debug(email);
        String areaCode = request.getParameter("areaCode");
        logger.debug(areaCode);
        String phone = request.getParameter("phone");
        logger.debug(phone);
        String userBirthday = request.getParameter("birthday");
        logger.debug(userBirthday);
        LocalDate birthday =  LocalDate.parse(userBirthday);
        logger.debug(birthday);
        Part userPhotoFilePart = request.getPart("userPhoto");
        // String userPhotolink = processImageFile(userPhotoFilePart);






        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setUserName(userName);
        user.setUserPassword(password);
        user.setStreetAddress(address);
        user.setCityName(cityName);
        user.setStateName(state);
        user.setZipCode(zipcode);
        user.setUserEmail(email);
        user.setAreaCode(areaCode);
        user.setUserPhoneNumber(phone);
        user.setUserBirthDate(birthday);
        // user.setLinkToUserProfilePhoto(userPhotolink);

        int userId = userDao.insert(user);
        logger.debug("My new user has an ID of " + userId);

        String url = "/user-signup.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

   /* private String processImageFile(Part imageFilePart) {
        //TODO Decide where images will be stored
        //TODO Validate maximum image size
        //TODO Use Google API
        String userPhotoFilePath = "../Test";

        String fileName = getFileName(imageFilePart);
        String userPhotoLink = userPhotoFilePath + fileName;
        return userPhotoLink;
    }



    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : part.getHeader("content-disposition").split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(
                        content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }*/

}
    
    
    
    
    
