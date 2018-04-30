package edu.matc.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QuizHelperTest {

    private final Logger logger = LogManager.getLogger(this.getClass());

    @BeforeEach

    @Test
    void getQuestionNumber() {

        int count = 1;

        while(count <= 50) {
            QuizHelper helper = new QuizHelper();
            int currentNumber = helper.getQuestionNumber();
            logger.info("The current number: " + currentNumber);
            assertTrue(currentNumber < 50, "Current Number is less than 50");
            logger.info("Test Number: " + count);
            ++count;
        }
    }
}