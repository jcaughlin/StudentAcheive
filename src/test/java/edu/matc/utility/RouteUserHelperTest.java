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
    void routeUserByRoleTest() {
        RouteUserHelper routeHelper = new RouteUserHelper();
        String student = routeHelper.routeUserByRole("student");
        String teacher = routeHelper.routeUserByRole("teacher");
        String admin = routeHelper.routeUserByRole("admin");
        String error = routeHelper.routeUserByRole("error");

        assertEquals(student, studentUrl);
        assertEquals(teacher, teacherurl);
        assertEquals(admin, adminurl);
        assertEquals(error, errorurl);
    }


    @Test
    void pageRouterTest() {
        RouteUserHelper routeUserHelper = new RouteUserHelper();

        String url = routeUserHelper.pageRouter("calendar");
        logger.info(url);
        String url1 = routeUserHelper.pageRouter("homeroom");
        logger.info(url1);
        String url2 = routeUserHelper.pageRouter("lunch");
        logger.info(url2);
        String url3 = routeUserHelper.pageRouter("contacts");
        logger.info(url3);
        String url4 = routeUserHelper.pageRouter("newsletter");
        logger.info(url4);
        String url5 = routeUserHelper.pageRouter("generalinfo");
        logger.info(url5);

        assertEquals("menu-content/calendar.jsp",url);
        assertEquals("menu-content/homeroom.jsp",url1);
        assertEquals("menu-content/lunch.jsp",url2);
        assertEquals("menu-content/contacts.jsp",url3);
        assertEquals("menu-content/newsletter.jsp",url4);
        assertEquals("menu-content/generalinfo.jsp",url5);


    }
}

