package exceptionPrograms;

import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("stmt1");
        System.out.println("stmt2");
        try {
            System.out.println("tb stmt1");
            System.out.println(10 / 0);
            System.out.println("tb stmt3");
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println("stmt4");
        System.out.println("stmt5");
    }
}
