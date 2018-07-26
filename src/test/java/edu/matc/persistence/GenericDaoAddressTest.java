package edu.matc.persistence;

import edu.matc.entity.Address;
import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class GenericDaoAddressTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao userDao = new GenericDao(User.class);
    GenericDao addressDao = new GenericDao(Address.class);
    private Address address;
    private User user;
    private UserRole userRole;
    private List<Address> addressList;
    // private Set<Address> addressList = new HashSet<Address>();


    @Test
    void insertAddressSuccess() {

        address = new Address("259 N Worth Av", "Elgin", "IL", "60123");

        // userRole = new UserRole("johnsmith", RoleName.PENDING);
        user = new User("John", "Smith", "johnsmith", "mypassword", "john@email.com");
        // user.setUserRole(userRole);
        user.addAddress(address);
       // addressDao.insert(address);

    }

    @Test
    void addUserWithAddressSuccess(){
        user = new User("John", "Smith", "johnsmith", "mypassword", "john@email.com");
        userRole = new UserRole("johnsmith", RoleName.PENDING);
        user.setUserRole(userRole);

        address = new Address("259 N Worth Av", "Elgin", "IL", "60123");

        user.addAddress(address);

        int number = userDao.insert(user);
        logger.info("New User's ID: " + number);





    }


}
