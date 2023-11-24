package exceptionPrograms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[]{10 , 20 , 30 , 40 };
        int idx = 0 ;
            System.out.println("ENTER A ARRAY INDEX ");
        try {
            idx = sc.nextInt();
            System.out.println("ELEMENT AT THE IDEX IS "+ arr[idx]);
        }catch (Exception i)
        {
            System.out.println(i);
        }




    }
}
