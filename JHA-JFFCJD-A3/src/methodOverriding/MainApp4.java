package methodOverriding;

public class MainApp4 {
    public static void main(String[] args) {
        Addition a = new Addition();
        a.add();
        a.add(10);
        a.add(10 , 20);
        a.add(10 , 20 , 30);
    }
}
