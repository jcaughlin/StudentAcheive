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

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenericDaoTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    GenericDao userDao;
    UserRole role;

    @BeforeEach
    void setUp() {
        userDao = new GenericDao(User.class);
        Database database = Database.getInstance();
        database.runSQL( "cleandb.sql");
    }

    @Test
    void insertUserTest() {
        role = new UserRole("username",RoleName.PENDING);
        User user = new User("Joe","Smith","username", "password", "joe@email.com",role);
        int number = userDao.insert(user);
        logger.info(number);

        List<User> allUsersList = userDao.getAll();
        logger.info(allUsersList.size());
        assertEquals(9, allUsersList.size());
    }

    @Test
    void insertUserWithAddress(){
        role = new UserRole("newusername", RoleName.PENDING);
        Address userAddress = new Address("555 Antwhere","Madison", "WI", "53502");
        User user = new User("John", "Adams","newusername","password","johnadams@gmail.com",role);
        userDao.insert(user);
        List<User> allUsersList = userDao.getAll();
        logger.info("Size of User List after user with address added", userDao.getAll());
        assertEquals(9, allUsersList.size());

    }

    @Test
    void getById() {
    }   

    @Test
    void getAll() {
       List<User> allUsersList = userDao.getAll();
       logger.info(allUsersList.size());
        assertEquals(8, allUsersList.size());
    }

    @Test
    void getByPropertyEqual() {
    }

    @Test
    void insertUserRoles() {
        role = new UserRole("freduser", RoleName.PENDING);
    }

    @Test
    void getByPropertyLike() {
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void delete() {
    }
}