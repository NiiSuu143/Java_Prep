import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // base case
        if(s.isEmpty()) {
            s.push(data);
            return ;
        }

        // recursion 
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);    // push the pop ones which is store at top while backtracking
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
