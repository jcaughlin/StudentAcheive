package edu.matc.utility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;


import static org.junit.jupiter.api.Assertions.*;


class DateHelperTest {
    private final Logger logger = LogManager.getLogger(this.getClass());

    DateHelper dateHelper;

    @BeforeEach
    void setUp() {
        dateHelper = new DateHelper();
    }

    @Test
    void daysFromToday() {

        DateHelper helper = new DateHelper();

        LocalDate today = LocalDate.now();
        LocalDate comparisonDate = today.plusDays(7);



        int days = helper.daysFromToday(comparisonDate);

        assertEquals(7,days);

        logger.info("The difference in day: " + days);

    }
}