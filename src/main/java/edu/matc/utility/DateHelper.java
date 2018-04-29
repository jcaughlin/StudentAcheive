package edu.matc.utility;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;



public class DateHelper {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public int daysFromToday(LocalDate dateToCompare){

        LocalDate today = LocalDate.now();
        logger.info(today);

        long daysFromToday;

        daysFromToday = today.until(dateToCompare, ChronoUnit.DAYS);

        int days = (int)daysFromToday;

        return days;

    }
}

