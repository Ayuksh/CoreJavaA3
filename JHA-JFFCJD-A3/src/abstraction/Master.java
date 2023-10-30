package abstraction;

public interface Master {
    static int a = 10 ;
    int b = 20 ;

    void display();

    public static void text(){
        System.out.println("STATIC METHOD !!");
    }
}
