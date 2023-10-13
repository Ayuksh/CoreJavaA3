package inheritance;

public class Master {
    public Master(){
        System.out.println("1ST CONSTRUCTOR !!");
    }

    public Master(int a)
    {
        this();
        System.out.println("2nd CONSTRUCTOR !!");
    }

    public Master(double a , double b)
    {
        this(10);
        System.out.println("3RD CONSTRUCTOR !!");
    }
}
