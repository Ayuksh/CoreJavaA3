package loopingStatement;

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        System.out.println("ENTER A NUMBER !!");
        int a = new Scanner(System.in).nextInt();

        while (a!=0){
           int r = a % 10;
           a = a / 10;
           System.out.println(r);
       }

    }
}
