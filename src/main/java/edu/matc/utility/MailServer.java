package edu.matc.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.Session;
import java.io.IOException;
import java.util.Properties;

/**
 *
 */
public class MailServer {

    private Properties properties;
    Session session = Session.getDefaultInstance(properties);
    private final Logger logger = LogManager.getLogger(this.getClass());


    public MailServer() {
       loadProperties();
    }



    private void loadProperties() {
        properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/javamail.properties"));
        } catch (IOException ioException) {

        } catch (Exception e) {

        }

    }

}
