package edu.matc.utility;

import java.util.List;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
// #TODO Not Functional
/**
 * The type Validation helper.
 *
 * @author josephcaughlin
 */
public class ValidationHelper {

    /**
     * Check if user exists boolean.
     *
     * @param username the username
     * @return the boolean
     */
    public Boolean checkIfUserExists(String username){
        UserDao userDao = new UserDao();
        List<User> userNameQueried;

        userNameQueried = userDao.getUserByProperty(username, "user_name");


        if(userNameQueried.size() == 0){
           return false;
        } else {
            return true;
        }
    }



}
