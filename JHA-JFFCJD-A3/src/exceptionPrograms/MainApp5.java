package exceptionPrograms;

import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER AGE ");
        int age = sc.nextInt() ;


        if (age>18)
            System.out.println("ELIGIBLE FOR VOTING !!");
        else
            throw new ArithmeticException();
    }
}
