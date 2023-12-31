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
        System.out.println("5. SEARCH COURSE BY ID ");
        System.out.println("6. SHOW COURSE WITH HIGHEST FEES ");
        int ch = sc.nextInt() ;
        switch (ch)
        {
            case 1 :
                addCourseInfo();
                break;
            case 2 :
                System.out.println(service.getCourseList());
                break;
            case 3 :
                deleteCourse();
                break;
            case 4:
                update();
                break;
            case 5 :
                findById();
                break;
            case 6:
                service.getCourseWithHighestFees();
        }

        main(args);
    }

    private static void findById() {
        System.out.println("ENTER ID");
        int cId = sc.nextInt() ;
        service.findCourseByid(cId);
    }

    private static void deleteCourse() {
        System.out.println("ENTER A COURSE ID TO BE DELETED !!");
        int cId = sc.nextInt() ;
        service.deleteCourse(cId);
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

    private static void update(){
        System.out.println("ENTER COURSE ID ");
        int cId = sc.nextInt() ;
        System.out.println("ENTER COURSE NAME ");
        String cName = sc.next();
        System.out.println("ENTER COURSE DURATION");
        double cDuration = sc.nextDouble() ;
        System.out.println("ENTER COURSE FEES ");
        double cFees = sc.nextDouble() ;

        Course uptCourse = new Course(cId , cName , cDuration , cFees);
        service.updateCourse(cId , uptCourse);

    }
}
