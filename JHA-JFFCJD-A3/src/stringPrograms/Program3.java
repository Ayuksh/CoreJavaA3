package stringPrograms;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A STRING");
        String str = sc.next();
        String revStr = "";
        for (int i = str.length()-1 ; i>=0 ; i--)
            revStr += str.charAt(i);

        String ans = (str.equalsIgnoreCase(revStr))?
                "string is palindrome":"String is not palindrome";
        System.out.println(ans);
    }
}
