package collectionProgram;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program7 {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("pune");
        l1.add("mumbai");
        l1.add("delhi");
        l1.add(1 , "thane");
        System.out.println(l1.get(2));
        System.out.println(l1);
    }
}
