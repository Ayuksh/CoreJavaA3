package inheritance;

public class MainApp4 {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.add(10);
        a1.add(10 , 20);
        a1.add(10 , "core java");
        a1.add( "core java" , 20);
    }
}
