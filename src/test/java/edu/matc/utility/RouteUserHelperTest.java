package edu.matc.utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RouteUserHelperTest {


    private final Logger logger = LogManager.getLogger(this.getClass());

    RouteUserHelper helper;

    String studentUrl = "/student/student-portal.jsp";
    String teacherurl =  "/teacher/teacher-portal.jsp";
    String adminurl =  "/admin/admin-portal.jsp";
    String errorurl = "/error-pages/error-page/500.jsp";

    @BeforeEach
    void setUp() {
        helper = new RouteUserHelper();
    }

    @Test
    void routeUserByRoleTest() {

        String student = helper.routeUserByRole("student");
        String teacher = helper.routeUserByRole("teacher");
        String admin = helper.routeUserByRole("admin");
        String error = helper.routeUserByRole("error");

        assertEquals(studentUrl,student);
        assertEquals(teacherurl,teacher);
        assertEquals(adminurl,admin);
        assertEquals(errorurl,error);
    }




}

