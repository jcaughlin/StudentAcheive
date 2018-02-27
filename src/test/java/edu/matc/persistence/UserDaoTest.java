package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.test.util.Database;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.List;


public class UserDaoTest {

    private final Logger log = LogManager.getLogger(this.getClass());


    UserDao userDao;
    User user;
    private String sqlFilePath = "cleandb.sql";

    @BeforeEach
    public void setUp() {
        userDao = new UserDao();
        Database database = Database.getInstance();
        database.runSQL(sqlFilePath);
    }

    @Test
    void insertTest() {
        user = new User("Tom","Smith","tomsmith","password6","tomsmith@gmail.com");
        log.error(user);
        userDao.insert(user);
        User user2 = userDao.getById(0);
        log.debug(user2);
        log.debug(user2.getLastName());
        assertEquals(user2.getLastName(),"Smith");


    }

    @Test
    void getByIdSuccess() {

        log.debug(userDao.getById(3));
        user = userDao.getById(4);
        log.info(user);

        assertEquals(user.getLastName(),"Stone");
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void getUsersByLastName() {
        List<User> userList = userDao.getUsersByLastName("Manafort");
        assertEquals(userList.size(),1);
    }

    @Test
    void delete() {
    }

    @Test
    void getAllUsers() {
        List<User>userList = userDao.getAllUsers();
        assertEquals(userList.size(), 5);
    }
}
