package abstraction;

public class Amazon implements AmazonFresh , AmazonMiniTV{


    public void placeOrder(){
        System.out.println("PLACING ORDERS !!");
    }

    public void payment(){
        System.out.println("USING AMAZON PAY ");
    }

    @Override
    public void buyGrocery() {
        System.out.println("BUYING GROCERY FROM AMAZON FRESH !!");
    }

    @Override
    public void watchTVShows() {
        System.out.println("WATCHING TV SHOWS ON AMAZON MINI TV !!");
    }
}
