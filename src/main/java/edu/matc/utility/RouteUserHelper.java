package edu.matc.utility;

public class RouteUserHelper {


    public String routeUserType(String userType) {

        String url;


        switch (userType) {

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
}
