package CourseApp;

import java.util.ArrayList;

public class CourseBLC {

    private ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course newCourse)
    {
        courseList.add(newCourse);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
