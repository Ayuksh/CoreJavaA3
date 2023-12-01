package exceptionPrograms;


import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10 , 20 , 30 , 40 , 50} ;

        System.out.println("ENTER A NUMBER !!");
        String ch = sc.next() ;



        try {
            int idx = Integer.parseInt(ch);
            System.out.println("ELEMENT AT IDX IS  " + arr[idx]);
        }catch (NumberFormatException n)
        {
            System.out.println(n);
        }finally {
            System.out.println("CLOSE COSTLY RESOURCES !!");
            sc.close();
        }

        System.out.println("ENTER A STRING VALUE ");
        String str = sc.next() ;

        System.out.println(str);


    }
}
