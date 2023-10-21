package methodOverriding;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER EMP ID ");
        int id = sc.nextInt();
        System.out.println("ENTER EMP NAME ");
        String name = sc.next();
        System.out.println("ENTER EMP SALARY ");
        double sal = sc.nextDouble();
        System.out.println("ENTER DEPARTMENT");
        String dept = sc.next();

        System.out.println("SELECT EMP TYPE ");
        System.out.println("1. DEVELOPER ");
        System.out.println("2. TESTER ");
        System.out.println("3. HR ");
        int ch = sc.nextInt();
        Employee emp = new Employee(id , name , sal , dept);
        if (ch  == 1)
           emp = new Developer(id , name , sal , dept);
        else if (ch == 2)
            emp = new Tester(id , name , sal , dept);
        else if (ch == 3)
            emp = new HR(id , name , sal , dept);

        emp.displayDetails();

        if (emp instanceof Developer)
            ((Developer) emp).language();
        else if (emp instanceof Tester)
            ((Tester) emp).testingApproach();
        else if (emp instanceof HR)
            ((HR) emp).irritatingOther();


    }
}
