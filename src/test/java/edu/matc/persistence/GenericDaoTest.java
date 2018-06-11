package edu.matc.persistence;

import edu.matc.entity.RoleName;
import edu.matc.entity.User;
import edu.matc.entity.UserRoles;
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

    UserRoles role;

    @BeforeEach
    void setUp() {
        userDao = new GenericDao(User.class);
        Database database = Database.getInstance();
        database.runSQL( "cleandb.sql");
    }

    @Test
    void insertUser() {
        role = new UserRoles("username",RoleName.PENDING);
        User user = new User("Joe","Smith","username", "password", "joe@email.com",role);
        userDao.insert(user);

        List<User> allUsersList = userDao.getAll();
        logger.info(allUsersList.size());
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
    void getByPropertyLike() {
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void delete() {
    }
}