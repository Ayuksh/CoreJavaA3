package multithreading;

public class MainApp1 {
    public static void main(String[] args) throws InterruptedException {
        Demo d1 = new Demo();
        Sample s1 = new Sample();


        s1.start();
        d1.start();


    }
}
