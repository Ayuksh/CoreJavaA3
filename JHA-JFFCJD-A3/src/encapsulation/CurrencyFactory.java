package encapsulation;

public class CurrencyFactory {
    public static Currency getCurrency(int ch){
        if (ch == 1) {
           return new India();
        } else if (ch == 2) {
           return new America();
        } else if (ch == 3) {
            return new Japan();
        }
        return null;
    }
}
