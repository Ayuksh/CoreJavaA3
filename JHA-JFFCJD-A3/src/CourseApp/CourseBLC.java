package CourseApp;

import java.nio.charset.CoderResult;
import java.util.ArrayList;
import java.util.Iterator;

public class CourseBLC {

    private ArrayList<Course> courseList = new ArrayList<>();

    {
        courseList.add(new Course(101 , "Core java" , 3.5 , 12000));
        courseList.add(new Course(102 , "SQL" , 1.2 , 7000));
        courseList.add(new Course(103 , "Web tech" , 3.5 , 11000));
        courseList.add(new Course(104 , "Manual testing" , 3.5 , 5000));


    }

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

    public void updateCourse(int cId, Course uptCourse) {
        int idx = -1 ;
        for (int i =0 ; i<courseList.size() ; i++)
        {
            Course c = courseList.get(i);
            if (c.getCourseId() == cId) {
                idx = i;
                break;
            }
        }
        if (idx == -1)
            return;
        courseList.set(idx , uptCourse);
    }

    public void findCourseByid(int cId) {

        for (Course c : courseList)
        {
            if (c.getCourseId() == cId)
                System.out.println(c);
        }

    }
}
