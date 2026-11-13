import java.util.ArrayList;

public class StackBasic {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        // is empty or not
        public boolean isEmpty() {
            return list.size() == 0;
        }

        // push
        public void push(int data) {
            list.add(data);
        }

        // pop
        public int pop() {
            // Corner case -> we should add this as if the stack is empty then return -1
            if(isEmpty()) {
                return -1;
            }
            
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        // peek
        public int peek() {
             // Corner case -> we should add this as if the stack is empty then return -1
            if(isEmpty()) {
                return -1;
            }
            return list.get(list.size()-1);
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
