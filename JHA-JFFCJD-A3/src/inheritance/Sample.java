package inheritance;

public class Sample extends Demo{

    Sample(){
        super(10);
        System.out.println("THIS IS SAMPLE CONSTRUCTOR ");
    }

    public void text()
    {
        System.out.println("TEXT METHOD FROM SAMPLE CLASS");
    }
}
