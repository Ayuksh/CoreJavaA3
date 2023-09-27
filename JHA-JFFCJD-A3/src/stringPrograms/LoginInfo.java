package stringPrograms;

import java.util.Scanner;

public class LoginInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME ");
        String name = sc.nextLine() ;
        System.out.println("ENTER EMAIL ");
        String mail = sc.nextLine() ;

        if (name.startsWith("Mr. ") || name.startsWith("Miss. ")
                &&
            mail.endsWith("@gmail.com") || mail.endsWith("@outlook.com"))
        {
            System.out.println("LOGIN SUCCESSFUL !!");
        }else {
            System.err.println("LOGIN UNSUCCESSFUL !!");
        }

    }
}
