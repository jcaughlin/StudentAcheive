package edu.matc.persistence;

import edu.matc.entity.User;
import edu.matc.test.util.Database;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class UserDaoTests {

    private final Logger logger = LogManager.getLogger(this.getClass());
    private List<User> userList;
    private UserDao dao;
    private User user;
    private String sql = "usertest.sql";

    @BeforeEach
    public void setUp() {

        dao = new UserDao();

        Database database = Database.getInstance();
        database.runSQL(sql);
    }

    @Test
    void insert() {
    }

    @Test
    void getById() {
    }

    @Test
    void getAll() {
    }

    @Test
    void saveOrUpdate() {
    }

    @Test
    void getUsersByLastName() {
    }

    @Test
    void delete() {
    }
}
