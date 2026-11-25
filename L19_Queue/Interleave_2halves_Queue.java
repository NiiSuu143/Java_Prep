import java.util.*;
public class Interleave_2halves_Queue {
    /*************
     * Interleave 2 halves of a Queue (even length only)
     * interleave -> its like braiding of girl's hair
     * **************/
    public static void interleave2Halve(Queue<Integer> q) {
        Queue<Integer> first = new LinkedList<>();

        int size = q.size()/2;  // half of q.size()
        // add first halve to the first queue
        for(int i=0; i<size; i++) {
            first.add(q.remove());
        }

        while(!first.isEmpty()) {
            // add front of first to q
            q.add(first.remove());
            // then add front of q to q itself as it will add from right side
            q.add(q.remove()); 
        }

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave2Halve(q);
        
        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
