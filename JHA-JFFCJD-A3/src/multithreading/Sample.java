package multithreading;

public class Sample extends Thread{

    @Override
    public void run() {
        for (char ch = 'A' ; ch <='J'  ; ch++) {
            System.out.print(ch + "  ");

        }
    }
}
