package loopingStatement;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        int num = sc.nextInt();
        int fact = 1 ;
        for (int i = 1; i <=num ; i++)
        {
            fact *= i ;
        }

        System.out.println("FACTORIAL IS : "+ fact);
    }
}
