package collectionProgram;

import java.util.Stack;

public class Program6 {
    public static void main(String[] args) {
        Stack<Character> s1 = new Stack<>();
        s1.push('A');
        s1.push('B');
        s1.push('C');
        s1.push('D');
        s1.pop();
        System.out.println(s1.peek());
       int idx = s1.search('A');
        System.out.println(idx);

        System.out.println(s1);
    }
}
