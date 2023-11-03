package accessModifier2;

import accessModifiers.Demo;

public class MainApp1 extends Demo {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.publicMethod();

        MainApp1 m1 = new MainApp1();
        m1.protectedMethod();

    }
}
