package casting;

public class SavingAccount extends BankAccount{

    static double bankBalance = 1000 ;

    public void getAccountNumber()
    {
        System.out.println("SAVING ACCOUNT NUMBER :- 1234567890");
    }

    @Override
    public void deposit(double amt) {
        bankBalance += amt ;
        displayBalance();
    }

    @Override
    public void withdraw(double amt) {
        bankBalance-=amt  ;
        displayBalance();
    }

    @Override
    public void displayBalance() {
        System.out.println("BANK BALANCE IS :-  "+bankBalance);
        System.out.println("+---------------------------------+");
    }
}
