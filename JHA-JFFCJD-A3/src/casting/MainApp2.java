package casting;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT LAPTOP !!");
        System.out.println("1. HP ");
        System.out.println("2. APPLE ");
        int ch =  sc.nextInt();

        Laptop l1 = new Laptop();

        if(ch == 1)
        {
           l1 = new HP();
        }else if(ch == 2)
        {
           l1 = new Apple();
        }

        l1.getCompany();
        l1.getProcessor();
        l1.getOS();

    }
}
