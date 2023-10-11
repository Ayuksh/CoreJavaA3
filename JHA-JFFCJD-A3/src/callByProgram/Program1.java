package callByProgram;

public class Program1 {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20 ;
        Variable v1 = new Variable()  ;
        swap(v1);
        System.out.println(v1.a);
        System.out.println(v1.b);
    }
    public static void swap(Variable v)
    {
        v.a = v.a^v.b ;
        v.b = v.a^v.b ;
        v.a = v.a^v.b ;
    }
}

class Variable
{
    int a = 10 ;
    int b = 20 ;
}