import java.util.*;

public class StackReverse {
    // time complexity -> O(n), SC -> O(n)
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    // Time complexity -> O(n), SC -> O(n)
    public static void reverseStack(Stack<Integer> s) {
        // base case
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        // 4, 3, 2, 1

        // For this one Tine complexity -> O(n^2) & SC -> O(n)
        reverseStack(s);

        // print stack
        printStack(s);  // 1, 2, 3, 4
    }
}