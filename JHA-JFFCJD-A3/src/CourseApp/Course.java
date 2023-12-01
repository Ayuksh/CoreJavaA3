package CourseApp;

public class Course {

    private int courseId ;
    private String courseName ;
    private double courseDuration ;
    private double courseFees ;

    public Course() {
    }

    public Course(int courseId, String courseName, double courseDuration, double courseFees) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseFees = courseFees;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getCourseDuration() {
        return courseDuration;
    }

    public double getCourseFees() {
        return courseFees;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDuration(double courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseFees(double courseFees) {
        this.courseFees = courseFees;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDuration=" + courseDuration +
                ", courseFees=" + courseFees +
                '}';
    }
}
