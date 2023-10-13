package inheritance;

import java.util.Scanner;

public class MainApp6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Flipkart f1 = new Flipkart();
        System.out.println("SELECT THE PAYMENT OPTION ");
        System.out.println("1. PAY LATER ");
        System.out.println("2. UPI ");
        System.out.println("3. CARD'S ");
        System.out.println("4. NET BANKING ");
        System.out.println("5. CASH ON DELIVERY ");
        int ch = sc.nextInt();

        switch (ch) {
            case 1 -> f1.payment(10);
            case 2 -> f1.payment("abc@icici" , 1234);
            case 3 -> f1.payment(1234 , "10/23" , 123);
            case 4 -> f1.payment("abc" , "1234abc");
            case 5 -> f1.payment("abc , ABC , 12345");
            default -> System.out.println("invalid payment ");
        }
    }
}
