import java.util.*;
public class Reversing_FirstK_Element {
    
    public static void reversing_frist_k(int k, Queue<Integer> q) {
        if(q == null || k <= 0 || k > q.size()) {
            return ;
        }

        Deque<Integer> stack = new LinkedList<>();
        int n = q.size();
        for(int i=0; i<k; i++) {
            stack.push(q.remove());
        }

        while(!stack.isEmpty()) {
            q.add(stack.pop());
        }

        for(int i=0; i<n-k; i++) {
            q.add(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);

        int k = 5;

        reversing_frist_k(k, q);

        while(!q.isEmpty()) {
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
