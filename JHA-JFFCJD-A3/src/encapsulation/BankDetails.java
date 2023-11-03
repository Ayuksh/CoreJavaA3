package encapsulation;

public class BankDetails {
    private long accNo = 123456 ;
    private String name = "Aman Kumar" ;
    private String panNumber= "JTAPK1234LK" ;

    public String getName(){
        return name ;
    }

    public long getAccNo(){
        return accNo;
    }

    public String getPanNumber(){
        return panNumber;
    }

    public void setName(String name ){
        this.name = name ;
    }
}
