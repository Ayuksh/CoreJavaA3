package encapsulation;

public class MainApp {

    public static void main(String[] args) {
        Demo d1 = new Demo();
//        Sample s1 = new Sample();

        Demo.Sample s1 = d1.new Sample();

        d1.display();
        System.out.println(d1.a);
        System.out.println(d1.b);

        s1.show();
        System.out.println(s1.c);
        System.out.println(s1.d);

    }
}
