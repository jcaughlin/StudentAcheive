package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "TeacherComplaintServlet", urlPatterns = "/theComplainer")
public class TeacherComplaintServlet extends HttpServlet {

    private final Logger logger = LogManager.getLogger(this.getClass());


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String theResponse = "No One Cares";

        LocalDate today = LocalDate.now();

        String theComplaint = request.getParameter("teacherComplaintText");
        logger.info("the complaint was: " + theComplaint);

        String lastDayOfSchool = request.getParameter("lastDayOfClass");
        LocalDate lastDay = LocalDate.parse(lastDayOfSchool);

        int daysLeftInSchoolYear = today.compareTo(lastDay);
        String daysLeftMessage = "There are " + daysLeftInSchoolYear + "Days Until The End of the Year! So Sorry!";

        request.setAttribute("DaysLeft", daysLeftMessage);
        request.setAttribute("complaintResponse", theResponse);

        String url = "/teacher/teacher-complaint-received.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
