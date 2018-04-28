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

        String theComplaint = request.getParameter("teacherComplaint");


        String todayDate = request.getParameter("todaysDate");
        LocalDate today = LocalDate.parse(todayDate);

        String lastDayOfSchool = request.getParameter("lastDayOfClass");
        LocalDate lastDay = LocalDate.parse(lastDayOfSchool);

        int DaysLeftInSchoolYear= today.compareTo(lastDay);
        logger.info("Days Left in School");

        request.setAttribute("complaintResponse", theResponse);

        String url = "teacher-complaint-received.jsp";

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
    
    
    
    
    
