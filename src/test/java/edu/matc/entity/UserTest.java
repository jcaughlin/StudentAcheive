package edu.matc.entity;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;

@Log4j2
public class UserTest {

    @Test void userConstructorTest() {

        User user = new User("James","Comey","jcomey","password8","jamesbcomey@fbi.gov");

        assertNotNull(user);

        log.info(user);

        log.info("The User is: " + user);
    }


}
