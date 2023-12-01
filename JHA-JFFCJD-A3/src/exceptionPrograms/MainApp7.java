package exceptionPrograms;

import java.net.MalformedURLException;
import java.net.URL;

public class MainApp7 {

    public static void master() throws MalformedURLException
    {
        System.out.println("MASTER METHOD START !!");
        URL url = new URL("");
        System.out.println("MASTER METHOD END !!");
    }

    public static void central() throws MalformedURLException
    {
        System.out.println("CENTRAL METHOD START !!");
            master();
        System.out.println("CENTRAL METHOD END !!");
    }

    public static void main(String[] args)  {
        System.out.println("MAIN METHOD START !!");
        try {
            central();
        } catch (MalformedURLException e) {
            System.out.println(e);
        }
        System.out.println("MAIN METHOD END !!");
    }
}
