package encapsulation;

import java.util.Scanner;

public class MainApp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT THE COUNTRY !!");
        System.out.println("1. INDIA ");
        System.out.println("2. AMERICA");
        System.out.println("3. JAPAN ");
        int ch = sc.nextInt();
        Currency curr = CurrencyFactory.getCurrency(ch) ;
        curr.getCurrency();
    }
}
