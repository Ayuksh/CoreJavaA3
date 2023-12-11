package collectionProgram;

import java.util.LinkedList;
import java.util.Queue;

public class Program9 {
    public static void main(String[] args) {
        Queue<String>  q1 = new LinkedList<>();     // upcasting

        q1.offer("core java");
        q1.offer("SQL");
        q1.offer("mt");
        q1.offer("python");
        q1.offer("web-tech");

        while (q1.peek() != null)
        {
            System.out.println(q1.peek());
            q1.poll();
        }
    }
}
