package multithreading;

public class Central extends Thread{

    @Override
    public void run() {
        for (int ch = 33 ; ch <= 43 ; ch++)
            System.out.print(  (char)ch +"  ");
    }
}
