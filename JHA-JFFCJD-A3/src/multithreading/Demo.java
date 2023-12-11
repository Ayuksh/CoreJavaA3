package multithreading;

public class Demo extends Thread{

    @Override
    public void run() {
       for (int i =1 ; i<=10 ; i++ ) {
           System.out.print(i + "  ");

       }
    }
}
