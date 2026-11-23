import java.util.*;

public class QwithJCF {
    public static void main(String[] args) {
        /*********
         * Queue in java collection framework is not a class
         * it is an interface 
         * Queue is implemented with (LinkedList & ArrayDeque)
         * **********/

        // Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println();

        // Queue using ArrayDeque
        Queue<Integer> q1 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        
        while(!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}