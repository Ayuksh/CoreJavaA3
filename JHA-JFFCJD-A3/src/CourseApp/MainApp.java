package CourseApp;

import java.util.Scanner;

public class MainApp {

    static Scanner sc = new Scanner(System.in);
    static CourseBLC service = new CourseBLC() ;

    public static void main(String[] args) {
        System.out.println("SELECT OPTIONS :- ");
        System.out.println("1. ADD COURSE");
        System.out.println("2. DISPLAY COURSES ");
        System.out.println("3. REMOVE COURSE");
        System.out.println("4. UPDATE COURSE ");

        int ch = sc.nextInt() ;
        switch (ch)
        {
            case 1 :
                addCourseInfo();
                break;
            case 2 :
                System.out.println(service.getCourseList());
        }

        main(args);
    }

    private static void addCourseInfo() {
        System.out.println("ENTER COURSE ID ");
        int cId = sc.nextInt() ;
        System.out.println("ENTER COURSE NAME ");
        String cName = sc.next();
        System.out.println("ENTER COURSE DURATION");
        double cDuration = sc.nextDouble() ;
        System.out.println("ENTER COURSE FEES ");
        double cFees = sc.nextDouble() ;

        Course course = new Course(cId , cName , cDuration , cFees);
        service.addCourse(course);
    }
}
