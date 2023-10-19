package casting;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SELECT ACCOUNT TYPE ");
        System.out.println("1. SAVING ACCOUNT ");
        System.out.println("2. LOAN ACCOUNT ");
        int ch = sc.nextInt();
        BankAccount acc = new BankAccount();
        if (ch== 1)
        {
            acc = new SavingAccount();      // upcasting
        }else if(ch == 2)
        {
            acc = new LoanAccount();        // upcasting
        }

        System.out.println("SELECT OPERATION !!");
        System.out.println("1. DEPOSIT AMOUNT ");
        System.out.println("2. WITHDRAW AMT ");
        System.out.println("CHECK BALANCE ");
        ch = sc.nextInt();

        if(ch == 1)
        {
            System.out.println("ENTER DEPOSIT AMOUNT ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        }else if (ch == 2)
        {
            System.out.println("ENTER WITHDRAW AMOUNT ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        }else {
            acc.displayBalance();
        }

        main(args);
    }
}
