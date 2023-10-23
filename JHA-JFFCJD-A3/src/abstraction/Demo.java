package abstraction;

public abstract class Demo {

    static String str = "static data member";
    String str1 = "non static data member ";

    public abstract void display();

    public static void text(){
        System.out.println("STATIC CONCRETE METHOD ");
    }

    static {
        System.out.println("STATIC BLOCK ");
    }

    {
        System.out.println("NON STATIC BLOCK !!");
    }

    public void show()
    {
        System.out.println("NON STATIC CONCRETE METHOD !");
    }

    public Demo()
    {
        System.out.println("CONSTRUCTOR !!");
    }

}
