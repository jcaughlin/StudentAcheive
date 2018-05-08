package edu.matc.utility;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * Utility Class that Determines number of days from today
 *
 * @author josephcaughlin
 */
public class DateHelper {

    private final Logger logger = LogManager.getLogger(this.getClass());

    /**
     * Days from today int.
     *
     * @param dateToCompare the date to compare
     * @return the days
     */
    public int daysFromToday(LocalDate dateToCompare){

        LocalDate today = LocalDate.now();
        logger.info(today);

        long daysFromToday;

        daysFromToday = today.until(dateToCompare, ChronoUnit.DAYS);

        int days = (int)daysFromToday;

        return days;

    }
}

