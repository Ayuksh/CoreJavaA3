package abstraction;

public class MainApp4 {
    public static void main(String[] args) {
        Master.text();
        System.out.println( Master.a );
        System.out.println( Master.b );

        Master m1 = new Central();
        m1.display();
    }
}
