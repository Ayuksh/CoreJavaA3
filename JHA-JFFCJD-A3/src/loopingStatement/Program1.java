package loopingStatement;


import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ;
        for (int i =50 ; i<=100 ; i++)
        {
            sum+=i;     // sum = sum+i ;
        }
        System.out.println(sum);
    }
}
