package inheritance;

import java.util.Scanner;

public class MainApp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Facebook f1 = new Facebook();

        System.out.println("SELECT THE LOGIN OPTION ");
        System.out.println("1. email login");
        System.out.println("2. contact login ");
        int ch = sc.nextInt();

        if (ch == 1)
        {
            System.out.println("ENTER EMAIL ");
            String email = sc.next();
            System.out.println("ENTER PASSWORD ");
            String pass = sc.next();
            f1.login(email , pass);
        }else if (ch == 2)
        {
            System.out.println("ENTER PHONE NUMBER ");
            int phn = sc.nextInt();
            System.out.println("ENTER PASSWORD ");
            String pass = sc.next();
            f1.login(phn , pass);

        }



    }
}
