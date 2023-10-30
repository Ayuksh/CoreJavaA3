package abstraction;

public class GooglePay implements Payment{
    @Override
    public void sendMoney() {
        System.out.println("SENDING MONEY FROM GOOGLE PAY !!");
    }

    @Override
    public void showTransactions() {
        System.out.println("TRANSACTION ARE SHOWN IN GOOGLE PAY !!");
    }
}
