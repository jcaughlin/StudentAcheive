package edu.matc.utility;

import java.util.List;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;

public class ValidationHelper {

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
