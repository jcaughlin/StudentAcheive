package edu.matc.utility;

/**
 * Utility Class to assist Servlets in routing links and menus.
 */
public class RouteUserHelper {

    /**
     * Assists Login Servlet in routing Users based on their userole.
     *
     * @param userRole The String value role of the user as submitted via the login form.
     * @return the string
     */
    public String routeUserByRole(String userRole) {

        String url;

        switch (userRole) {

            case "student":
                return url = "/student/student-portal.jsp";

            case "teacher":
                return url = "/teacher/teacher-landing.jsp";

            case "admin":
                return url = "/admin/admin-landing.jsp";

            default:
                return url = "/error-pages/error-page/500.jsp";
        }
    }

    /**
     * Page router string.
     *
     * @param pageRequested the page requested
     * @return the string
     */
    public String pageRouter(String pageRequested) {
        String filePath = "/menu-content/";
        String jspSuffix = ".jsp";

        String url = filePath + pageRequested + jspSuffix;

        return url;

    }
}
