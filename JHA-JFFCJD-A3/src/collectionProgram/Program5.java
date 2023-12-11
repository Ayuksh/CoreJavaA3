package collectionProgram;

import java.util.Vector;

public class Program5 {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(20);
        v1.add(30);
        v1.add(40);
        v1.add(50);
        v1.add(null);
        v1.remove(2);
        System.out.println(v1.get(4));

    }
}
