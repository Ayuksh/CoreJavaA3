package casting;

public class MainApp1 {
    public static void main(String[] args) {

        Demo d1 = new Sample();     // upcasting
        Sample s1 = (Sample) d1;    // downcasting
        s1.supMethod1();
        s1.supMethod2();
        s1.subMethod1();
        s1.subMethod2();
    }
}
