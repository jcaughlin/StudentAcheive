package edu.matc.controller;

import edu.matc.entity.User;
import edu.matc.persistence.UserDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;


@WebServlet(name = "ForgotPasswordController", urlPatterns = "/forgotPassword")
public class PasswordResetController extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String resetConfirmationMessageToUserAgent = "Your Account has been retrieved. Check your email for instructions on how to reset your password";

        UserDao userDao = new UserDao();

        String userEmailToSendConfirmation = request.getParameter("email");


        try {

            List<User> user = userDao.getUserByProperty(userEmailToSendConfirmation, "email");
            generateAndSentPasswordResetEmail(userEmailToSendConfirmation);

            String url = "/forgot-password.jsp";

            request.setAttribute("passwordReset", resetConfirmationMessageToUserAgent);

            RequestDispatcher dispatcher =
                    getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);

        } catch (MessagingException exception) {
            logger.info("There has been a messaging exception " + exception);
        }

    }


    private void generateAndSentPasswordResetEmail(String usersEmailAddress) throws MessagingException {

        Session getMailSession;
        MimeMessage message;

        String resetConfirmationMessage = "Test Message. Soon we will actually help you change password";
        String resetEmailSubject = "Reset Password Request Confirmation";
        String gmailId = "jcaughlin@gmail.com";
        String gmailvailidation = "spvpyauravcaqjej";

        Properties javaMailServerProperties = new Properties();

        javaMailServerProperties.put("mail.smtp.port", "587");
        javaMailServerProperties.put("mail.smtp.auth", "true");
        javaMailServerProperties.put("mail.smtp.starttls.enable", "true");
        javaMailServerProperties.put("mail.smtp.host", "smtp.gmail.com");

        getMailSession = Session.getDefaultInstance(javaMailServerProperties, null);
        message = new MimeMessage(getMailSession);
        message.setFrom(new InternetAddress("from-email@gmail.com"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(usersEmailAddress));
        message.setSubject(resetEmailSubject);
        message.setText(resetConfirmationMessage, "text/html");


        Transport transport = getMailSession.getTransport("smtp");
        transport.connect("smtp.gmail.com", gmailId, gmailvailidation);

        transport.close();

    }
}



    
    
    
    
    
