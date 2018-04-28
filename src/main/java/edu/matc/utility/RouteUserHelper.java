package edu.matc.utility;

/**
 * Utility Class to assist Servlets in routing links and menus.
 * @author josephcaughlin
 */
public class RouteUserHelper {

    /**
     * Assists Login Servlet in routing Users based on their userole.
     *
     * @param userRole The String value role of the user as submitted via the login form.
     * @return the string url of the jsp requested.
     */
    public String routeUserByRole(String userRole) {

        String urlRequested;

        switch (userRole) {

            case "student": urlRequested = "/student/student-portal.jsp";
            break;

            case "teacher": urlRequested = "/teacher/teacher-landing.jsp";
            break;

            case "admin": urlRequested = "/admin/admin-landing.jsp";
            break;

            default: urlRequested = "/error-pages/error-page/500.jsp";
            }
            return urlRequested;
    }

    /**
     * Page router string.
     *
     * @param pageRequested the page requested
     * @return the string
     */
    public String pageRouter(String pageRequested) {
        String jspSuffix = ".jsp";
        String filePath = "/menu-content/";

        String url = filePath + pageRequested + jspSuffix;

        return url;

    }

    public String footerLinkRouter(String pageRequested) {
        String jspSuffix = ".jsp";

        String filePath = "/footer-content/";

        String url = filePath + pageRequested + jspSuffix;

        return url;

    }

    /**
     * Method Takes the String value of the url requested from the teacher-landing.jsp
     *
     * @param portalChosen
     * @return urlRequested The String url for the site that the user has chosen.
     */
    public String routeTeacher(String portalChosen) {

        String urlRequested;

        switch (portalChosen) {
            case "createQuiz": urlRequested = "/teacher/teacher-quiz-builder.jsp";
                break;

            case "showStudentReport": urlRequested = "/teacher/teacher-student-report.jsp";
                break;

            case "viewOrEditClassPage": urlRequested = "/teacher/teacher-homeroom.jsp";
                break;

            case "complain": urlRequested =  "/teacher/teacher-complain.jsp";
                break;

            default: urlRequested = "/error-pages/500.jsp";

        }
        return urlRequested;
    }
}
