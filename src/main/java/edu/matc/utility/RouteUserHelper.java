package edu.matc.utility;

public class RouteUserHelper {

    // #TODO Create Test
    public String routeUserType(String userType) {

        String url;


        switch (userType) {

            case "student":
                return url = "student-profile.jsp";

            case "teacher":
                return url = "teacher-landing.jsp";

            case "admin":
                return url = "admin-landing.jsp";

            default:
                return url = "error-page.jsp";
        }
    }
}
