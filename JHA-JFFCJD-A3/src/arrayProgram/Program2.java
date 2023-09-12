package arrayProgram;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[] arr = new int[6] ;

        for (int i =0 ; i< arr.length ; i++ )
        {
            System.out.println("ENTER A VALUE !!");
            arr[i] = sc.nextInt() ;
        }

        System.out.println("----------------------------------");
        System.out.println("VALUES INSIDE ARRAY ARE !!");
        for (int n : arr)
            System.out.println(n);

    }
}
