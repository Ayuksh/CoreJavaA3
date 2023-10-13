package inheritance;

public class Flipkart {
    public void payment(int days)
    {
        System.out.println("PAY AFTER "+days);
    }

    public void payment(String upi , int password)
    {
        System.out.println("PAYING BY USING UPI , AND YOU GET 10% DISCOUNT");
    }

    public void payment(long crdNo , String expDate , int cvv){
        System.out.println("PAYING BY USING CARD'S");
    }

    public void payment(String bankId , String password){
        System.out.println("PAYING BY USING NET BANKING ");
    }

    public void payment(String address)
    {
        System.out.println("ORDER WILL BE DELIVERED !!");
    }
}
