package encapsulation;

public class MainApp1 {
    public static void main(String[] args) {
        BankDetails acc1 = new BankDetails();
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccNo());
        System.out.println(acc1.getPanNumber());

        acc1.setName("Amit Kumar");
        System.out.println("-----------------------------------");
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccNo());
        System.out.println(acc1.getPanNumber());

    }
}
