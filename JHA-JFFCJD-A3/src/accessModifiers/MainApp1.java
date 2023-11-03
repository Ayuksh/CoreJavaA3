package accessModifiers;

public class MainApp1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.publicMethod();
        d1.packageMethod();
        d1.protectedMethod();
    }
}
