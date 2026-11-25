import java.util.*;
public class DequeBasic {
    public static void main(String[] args) {
        /***********
         * Deque is Double ended queue
         * It is a interface present in the JCF(Java Collection Framework)
         * Deque & Dequeue is not same -> Dequeue is a king of remove method
         * We can add from first or last
         * we can also remove form first or last
         * getFirst or getLast for peek
         * ************/
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);

        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        System.out.println("First element : "+deque.getFirst());
        System.out.println("Last element : "+deque.getLast());
    }
}
