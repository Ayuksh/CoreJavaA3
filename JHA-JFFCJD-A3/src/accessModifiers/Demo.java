package accessModifiers;

public class Demo {

    private void privateMethod()
    {
        System.out.println("PRIVATE METHOD !!");
    }

    void packageMethod()
    {
        System.out.println("PACKAGE METHOD !!");
    }

    protected void protectedMethod()
    {
        System.out.println("PROTECTED METHOD !!");
    }

    public void publicMethod(){
        System.out.println("PUBLIC METHOD !!");
    }
}
