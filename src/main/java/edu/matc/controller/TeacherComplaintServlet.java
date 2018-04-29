package edu.matc.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

import edu.matc.utility.DateHelper;
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

        DateHelper dateHelper = new DateHelper();
        String theComplaint = request.getParameter("teacherComplaintText");
        logger.info("the complaint was: " + theComplaint);

        String lastDayOfSchool = request.getParameter("lastDayOfClass");
        LocalDate lastDate = LocalDate.parse(lastDayOfSchool);

        int daysLeftInSchoolYear = dateHelper.daysFromToday(lastDate);

        String theResponse = "Too Bad!!! There are  " + daysLeftInSchoolYear + " Days Left In the School Year And No One Cares";

        request.setAttribute("complaintResponse", theResponse);

        String url = "/teacher/teacher-complaint-received.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
