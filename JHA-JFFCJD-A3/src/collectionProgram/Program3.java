package collectionProgram;

import java.util.ArrayList;
import java.util.Collections;

public class Program3 {
    public static void main(String[] args) {
        ArrayList<Character> data = new ArrayList<>();
        data.add('F');
        data.add('A');
        data.add('E');
        data.add('B');
        data.add('C');
        data.add('D');

        System.out.println(data);
        Collections.sort(data);
        System.out.println(data);
    }
}
