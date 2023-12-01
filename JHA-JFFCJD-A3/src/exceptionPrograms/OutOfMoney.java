package exceptionPrograms;

public class OutOfMoney extends RuntimeException{
    public OutOfMoney() {
    }

    public OutOfMoney(String message) {
        super(message);
    }
}
