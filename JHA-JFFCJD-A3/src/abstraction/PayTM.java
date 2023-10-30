package abstraction;

public class PayTM implements Payment{
    @Override
    public void sendMoney() {
        System.out.println("SENDING MONEY FROM PAYTM !!");
    }

    @Override
    public void showTransactions() {
        System.out.println("TRANSACTION ARE SHOWN IN PAYTM !!");
    }
}
