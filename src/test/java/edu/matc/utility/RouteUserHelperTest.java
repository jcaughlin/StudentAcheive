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
    String teacherurl =  "/teacher/teacher-landing.jsp";
    String adminurl =  "/admin/admin-landing.jsp";
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


    @Test
    void pageRouterTest() {

        String url = helper.pageRouter("calendar");
        logger.info(url);
        String url1 = helper.pageRouter("homeroom");
        logger.info(url1);
        String url2 = helper.pageRouter("lunch");
        logger.info(url2);
        String url3 = helper.pageRouter("contacts");
        logger.info(url3);
        String url4 = helper.pageRouter("newsletter");
        logger.info(url4);
        String url5 = helper.pageRouter("generalinfo");
        logger.info(url5);

        assertEquals("/menu-content/calendar.jsp",url);
        assertEquals("/menu-content/homeroom.jsp",url1);
        assertEquals("/menu-content/lunch.jsp",url2);
        assertEquals("/menu-content/contacts.jsp",url3);
        assertEquals("/menu-content/newsletter.jsp",url4);
        assertEquals("/menu-content/generalinfo.jsp",url5);


    }

    @Test
    void footerLinkRouter() {
        String url = helper.footerLinkRouter("executive-team");
        logger.info(url);
        assertEquals("/footer-content/executive-team.jsp",url);
    }
}

