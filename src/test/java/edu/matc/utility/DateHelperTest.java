package edu.matc.utility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

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

        LocalDate christmas = LocalDate.of(2018,Month.DECEMBER,25);

        int days = helper.daysFromToday(christmas);

        assertEquals(240,days);

        logger.info("The difference in day: " + days);

    }
}