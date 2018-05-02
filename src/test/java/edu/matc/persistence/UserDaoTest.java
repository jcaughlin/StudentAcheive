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


    @BeforeEach
    public void setUp() {
        user = new User();
        userDao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL( "cleandb.sql");
    }

    @Test
    void insertTest() {
        user = new User("Tom","Smith","tomsmith","password6","tomsmith@gmail.com");
        int id = userDao.insert(user);
        assertNotEquals(0,id);
        User user2 = userDao.getById(id);
        log.info("The retrieve Users last name: " + user2.getLastName());
        assertEquals(user2.getLastName(),"Smith");


    }

    @Test
    void getByIdSuccess() {

        log.info(userDao.getById(3));
        user = userDao.getById(4);
        log.info(user);

        assertEquals("Stone",user.getLastName());
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

        List<User> newList = userDao.getUserByProperty("user_name", "george");
        assertEquals(1,newList.size());


    }

    @Test
    void getUserByPropertyFailTest(){
        List<User> userList = userDao.getUserByProperty("Ulvaeus", "lastName");
        assertEquals(0,userList.size());

    }
}
