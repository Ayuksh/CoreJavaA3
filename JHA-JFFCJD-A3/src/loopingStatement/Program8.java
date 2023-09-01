package loopingStatement;

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        for (int i =0 ; i<10 ; i++)
        {
            System.out.println("ENTRE A NUMBER ");
            sum += sc.nextInt();
        }

        int avg = sum / 10 ;
        System.out.println("AVERAGE IS : "+ avg);
    }
}
