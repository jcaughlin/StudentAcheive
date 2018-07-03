package edu.matc.persistence;

import com.sun.imageio.plugins.common.LZWCompressor;
import edu.matc.entity.Address;

import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class GenericDaoAddressTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao userDao = new GenericDao(User.class);
    private Address address;
    private User user;
    private UserRole userRole;
    private List<Address> addressList = new ArrayList<Address>();


    @Test
    void insertAddressSuccess() {

        address = new Address("259 N Worth Av", "Elgin", "IL", "60123");
        addressList.add(address);
        // userRole = new UserRole("johnsmith", RoleName.PENDING);
        user = new User("John", "Smith", "johnsmith", "mypassword", "john@email.com");
        // user.setUserRole(userRole);
        user.setAddresses(addressList);

        int newUserPrimaryKey = userDao.insert(user);
        logger.info("New Address Primary Key" + newUserPrimaryKey);
        assertNotEquals(0, newUserPrimaryKey);
    }


}
