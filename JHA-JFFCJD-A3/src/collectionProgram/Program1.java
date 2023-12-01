package collectionProgram;

import java.util.ArrayList;

public class Program1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        list1.add("core java") ; //      auto boxing-----> upcasting
        list1.add(10);      // int --> Integer obj  X--> ref Object class
        list1.add(20.99);
        list1.add('A');
        list1.add(true);
        list1.addAll(list1);
        System.out.println(list1);


    }
}
