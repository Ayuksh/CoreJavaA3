package multithreading;

public class Master extends Thread{

    @Override
    public void run() {
        System.out.println(10/0);
    }
}
