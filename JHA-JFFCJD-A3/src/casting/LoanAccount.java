package casting;

public class LoanAccount extends BankAccount{
    static double loanBalance = 200 ;

    public void getAccountNumber()
    {
        System.out.println("LOAN ACCOUNT NUMBER :- 0987654321");
    }

    @Override
    public void deposit(double amt) {
        loanBalance -= amt ;
        displayBalance();
    }

    @Override
    public void withdraw(double amt) {
        loanBalance+=amt ;
        displayBalance();
    }

    @Override
    public void displayBalance() {
        System.out.println("LOAN BALANCE IS :- "+ loanBalance);
        System.out.println("+---------------------------------+");

    }
}
