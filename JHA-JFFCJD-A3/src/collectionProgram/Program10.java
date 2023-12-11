package collectionProgram;

import java.util.PriorityQueue;
import java.util.Queue;

public class Program10 {
    public static void main(String[] args) {
        Queue<Integer> q1  = new PriorityQueue<>();
        q1.offer(10);
        q1.offer(5);
        q1.offer(1);
        q1.offer(3);
        q1.offer(20);
        q1.offer(15);

        q1.poll();
        System.out.println(q1);




    }
}
