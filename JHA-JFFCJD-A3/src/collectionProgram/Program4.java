package collectionProgram;

import java.util.ArrayList;
import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> courseList = new ArrayList<>();

        System.out.println("ENTER 5 SUBJECT NAME ");
        for(int i =0 ; i<5 ; i++) {
            String course = sc.next();
            courseList.add(course);
        }

        System.out.println(courseList);
    }


}
