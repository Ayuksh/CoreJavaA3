package methodOverriding;

public class Addition {
    public void add()
    {
        System.out.println("add method ");
    }

    public void add(int a)
    {
        System.out.println("adding "+a);
    }

    public void add(int a , int b)
    {
        System.out.println("adding "+a +" + "+b);
    }

    public void add(int a , int b , int c)
    {
        System.out.println("adding "+a +" + "+b+" + "+c);
    }
}
