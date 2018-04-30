package edu.matc.utility;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import edu.matc.entity.Quiz;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Helper Class that for now will work with Servlet to administer a quiz and store  questions and results & results.
 *
 */
public class QuizHelper {

    // #TODO Determine how to handle Upper Bound i.e. ArrayList<Questions>.size();

    private final Logger logger = LogManager.getLogger(this.getClass());

    Map results; //LinkedHashMap


    /**
     * Method Generates a random number to query the database.
     *
     * @return currentQuestionid the id key of the current question to be asked.
     *
     */
    public int getQuestionNumber() {

        int currentQuestionid;
        int totalQuestionNumber;


        Random questionGenerator = new Random();
        currentQuestionid = questionGenerator.nextInt(50);
        logger.info(currentQuestionid);

        return currentQuestionid;
    }




}
