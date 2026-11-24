import java.util.*;

public class Stack_2Q_Push {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push to the stack -> O(n)
        public void push(int data) {
            q2.add(data);

            while(!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            // swap q1 and q2 reference
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            /**********
             * Zero wasted allocation:
             * temp is just a temporary reference variabl 
             * it only needs to hold an existing reference during the swap,
             * not own a third queue.
             * **********/ 
        }

        // pop() -> O(1)
        public int pop() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.remove();
        }

        // peek() -> O(1)
        public int peek() {
            if(isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
