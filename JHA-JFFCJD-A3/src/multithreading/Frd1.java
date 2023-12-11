package multithreading;

public class Frd1 implements Runnable{
    @Override
    public void run() {
        for (int i =1 ; i <=20 ; i++) {
            System.out.println("RECEIVE MSG !");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
