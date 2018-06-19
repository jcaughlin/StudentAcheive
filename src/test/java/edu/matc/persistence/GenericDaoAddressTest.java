package edu.matc.persistence;

import edu.matc.entity.Address;

import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRole;
import edu.matc.test.util.Database;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;


public class GenericDaoAddressTest {

    private final Logger logger = LogManager.getLogger(this.getClass());
    GenericDao addressDao = new GenericDao(Address.class);
    private Address address;
    private User user;

    @BeforeEach
    void setUp(){
        Database database = Database.getInstance();
    }

 /*   @Test
    void insertAddressTest(){
        address = new Address("259 N Worth Av", "Elgin", "IL", "60123");
        UserRoles role = new UserRoles("johnsmith", RoleName.PENDING);
        user = new User("John", "Smith", "johnsmith","mypassword", "john@email.com",role, address);
        int newUserPrimaryKey = addressDao.insert(address);
        logger.info("New Address Primary Key" + newUserPrimaryKey);
        assertNotEquals(0,newUserPrimaryKey);


    }*/
}
