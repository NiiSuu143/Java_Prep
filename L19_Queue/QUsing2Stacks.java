import java.util.*;
public class QUsing2Stacks {
    static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add -> O(n)
        public void add(int data) {
            while(!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while(!s2.isEmpty()) {
                int top = s2.pop();
                s1.push(top);
            }
        }

        // remove -> O(1)
        public int remove() {
            if(s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }   

            int fornt = s1.pop();
            return fornt;
        }

        // peek -> O(1)
        public int peek() {
            if(s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
