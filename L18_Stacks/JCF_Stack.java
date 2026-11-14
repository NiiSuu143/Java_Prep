import java.util.*;

public class JCF_Stack {
    public static void main(String[] args) {
        // stack using JCF(java collection framework)
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        // we use peek() or pop() to print the stack in the screen 
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
