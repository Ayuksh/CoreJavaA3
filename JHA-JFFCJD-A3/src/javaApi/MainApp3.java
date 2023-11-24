package javaApi;

import java.util.Random;

public class MainApp3 {
    public static void main(String[] args) {
        Random rd = new Random();
        for (int i =0 ; i<10 ; i++) {
            int a = rd.nextInt(100);
            System.out.println(a);
        }
    }
}
