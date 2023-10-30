package abstraction;

import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        System.out.println("SELECT PAYMENT OPTION !!");
        System.out.println("1. PAYTM ");
        System.out.println("2. GOOGLE PAY ");
        int ch = new Scanner(System.in).nextInt();

        Payment payment = null ;

        if (ch == 1 )
        {
            payment = new PayTM();
        }else{
           payment = new GooglePay() ;
        }

        payment.sendMoney();
        payment.showTransactions();
    }
}
