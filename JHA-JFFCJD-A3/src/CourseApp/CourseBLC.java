package CourseApp;

import java.util.ArrayList;
import java.util.Iterator;

public class CourseBLC {

    private ArrayList<Course> courseList = new ArrayList<>();

    public void addCourse(Course newCourse)
    {
        courseList.add(newCourse);
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void deleteCourse(int cId) {
        Iterator<Course> itr = courseList.iterator() ;
        while (itr.hasNext())
        {
            Course course = itr.next();
            if (cId == course.getCourseId())
                itr.remove();
        }



    }
}
