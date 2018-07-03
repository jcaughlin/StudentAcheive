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
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;
import java.util.List;


public class UserDaoTest {

    private final Logger log = LogManager.getLogger(this.getClass());

    User user;
    UserDao userDao;
    Address address;


    @BeforeEach
    public void setUp() {
        address = new Address();

        userDao = new UserDao();


        /*Database database = Database.getInstance();
        database.runSQL( "cleandb.sql");*/
    }

    @Test
    void insertTest() {
        List<Address> addressList = new ArrayList<Address>();
        address = new Address("259 N Worth Av", "Elgin", "IL", "60123");
        addressList.add(address);
        UserRole userRole = new UserRole("freddiesmith",RoleName.PENDING);
        log.info("User Role: " + userRole.toString());
        user = new User("Tom","Smith","freddiesmith","password6","tomsmith@gmail.com", userRole);
        user.setAddresses(addressList);
        log.info("User: " + user.toString());
        int id = userDao.insert(user);
        log.info("User's id is " + id);
        assertNotEquals(0,id);

    }

    @Test
    void getByIdSuccess() {

        log.info(userDao.getById(20));
        user = userDao.getById(20);
        log.info(user.toString());

        // assertEquals("Stone",user.getLastName());
    }

    @Test
    void saveOrUpdate() {
        String newLastName = "Putin";
        User updatedUser = userDao.getById(4);
        updatedUser.setLastName(newLastName);
        userDao.saveOrUpdate(updatedUser);
        User retrievedUser = userDao.getById(4);
        assertEquals(newLastName,retrievedUser.getLastName());

    }

    @Test
    void getUsersByLastName() {
        List<User> userList = userDao.getUsersByLastName("Manafort");
        assertEquals(userList.size(),1);
    }

    @Test
    void delete() {
        userDao.delete(userDao.getById(2));
        assertNull(userDao.getById(2));
    }

    @Test
    void getAllUsers() {
        log.info("The current size of the userlist it: " + userDao.getAllUsers().size());
        List<User>userList = userDao.getAllUsers();
        assertEquals(8, userList.size());
    }

    @Test
    void getUserByPropertyTest() {
        List<User> userList = userDao.getUserByProperty("Manafort", "lastName");
        assertEquals(1,userList.size());

        List<User> newList = userDao.getUserByProperty("george", "userName");
        assertEquals(1,newList.size());


    }


}
