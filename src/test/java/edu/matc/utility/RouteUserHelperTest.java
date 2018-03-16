package edu.matc.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RouteUserHelperTest {


    private final Logger logger = LogManager.getLogger(this.getClass());

    String studentUrl = "student-portal.jsp";
    String teacherurl =  "teacher-landing.jsp";
    String adminurl =  "admin-landing.jsp";
    String errorurl = "error-page/500.jsp";

    @BeforeEach
    void setUp() {

    }

    @Test
    void routeUserTypeTest() {
        RouteUserHelper routeHelper = new RouteUserHelper();
        String student = routeHelper.routeUserType("student");
        String teacher = routeHelper.routeUserType("teacher");
        String admin = routeHelper.routeUserType("admin");
        String error = routeHelper.routeUserType("error");

        assertEquals(student, studentUrl);
        assertEquals(teacher, teacherurl);
        assertEquals(admin, adminurl);
        assertEquals(error, errorurl);
    }
}

