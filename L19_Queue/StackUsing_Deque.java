import java.util.*;
public class StackUsing_Deque {
    public static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // isEmpty
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // push() using deque -> O(1)
        public void push(int data) {
            deque.addLast(data);
        } 

        // pop() using deque -> O(1)
        public int pop() {
            if(deque.isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return deque.removeLast();
        }

        // peek() using deque -> O(1)
        public int peek() {
            if(deque.isEmpty()) {
                System.out.println("Stack is empty.");
                return -1;
            }
            return deque.getLast();
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
