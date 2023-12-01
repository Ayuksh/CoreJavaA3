package exceptionPrograms;

import java.util.Scanner;

public class MainApp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER THE PRICE !!");
        double price = sc.nextDouble();

        if(price<100)
            System.out.println("BUY THE PRODUCT !!");
        else
            throw new OutOfMoney("WE DON'T HAVE MONEY");
    }
}
