import java.util.*;
public class QueueUsing_Deque {
    public static  class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // isEmpty 
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // add()
        public void add(int data) {
            deque.addLast(data);
        }

        // remove()
        public int remove() {
            if(deque.isEmpty()) {
                System.out.println("Queue is empty...");
                return -1;
            }
            return deque.removeFirst();
        }

        // peek() 
        public int peek() {
            if(deque.isEmpty()) {
                System.out.println("Queue is empty...");
                return -1;
            }
            return deque.getFirst();
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
