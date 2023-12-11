package multithreading;

public class Frd2 implements Runnable{
    @Override
    public void run() {

        for (int i =1 ; i<=20 ; i++) {
            System.out.println("\t\t MSG SEND !! ");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
