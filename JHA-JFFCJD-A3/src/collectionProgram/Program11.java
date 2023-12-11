package collectionProgram;

import java.util.*;

public class Program11 {
    public static void main(String[] args) {
        Map m1 = new TreeMap<>();
        m1.put(new Program1() , 12000);
        m1.put("mt" , 12000);
        m1.put("webtech" , 7000);
        m1.put("python" , 3000);
        m1.put(100 , 5000);

        System.out.println(m1);
    }
}
