package abstraction;

import java.util.Scanner;

public class MainApp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT JOB TYPE !!");
        System.out.println("1. DEVELOPER \n2. TESTER ");
        int ch = sc.nextInt();
        Employee emp ;
        if (ch == 1)
        {
            System.out.println("SELECT DEVELOPER TYPE ");
            System.out.println("1. FRONTEND \n2. BACKEND ");
            ch = sc.nextInt() ;
            if (ch == 1)
                emp = new FrontEndDeveloper();
            else
                emp = new BackEndDeveloper();
        }else{
            System.out.println("SELECT TESTER TYPE ");
            System.out.println("1. MANUAL TESTER \n2. AUTOMATION TESTER  ");
            ch = sc.nextInt() ;
            if (ch == 1)
                emp = new ManualTesters();
            else
                emp = new AutomationTester();
        }

        emp.designation();
        emp.jobDescription();
        if ( emp instanceof Developer) {
            Developer d = (Developer) emp;
            d.displayDetails();
        }else{
            Tester t = (Tester) emp ;
            t.displayDetails();
        }
    }
}
