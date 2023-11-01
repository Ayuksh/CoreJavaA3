package abstraction;

public class MainApp8 {
    public static void main(String[] args) {
        Hero h1  = (String n ) -> {
            System.out.println("name : "+n);
        };

        Hero h2 = (String n ) -> {
            System.out.println("name : "+ n);
        };

        h1.heroName("JAVA");
        h2.heroName("IRON MAN");


    }
}
