import java.util.*;
public class Q1PalindromeLL {
    public static class Node {
        char data;
        Node next;
        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(char data) {
        // create a new node
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLL() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node getMid(Q1PalindromeLL list) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static boolean isPalindrome(Q1PalindromeLL list) {
        Stack<Character> s = new Stack<>();
        Node temp = head;
        Node midNode = getMid(list);
        while(temp != midNode) {
            s.push(temp.data);
            temp = temp.next;
        }

        // if size is odd then skip the middle element
        if(size%2 != 0) {
            temp = temp.next;
        }

        while(!s.empty()) {
            if(temp == null || s.pop() != temp.data) {  
                return false;
            } 
            // s.pop();    // we can write this pop() instead of s.peek() in above if condition
            temp = temp.next;    
        }

        return true;
    }
    public static void main(String[] args) {
        Q1PalindromeLL list = new Q1PalindromeLL();
        list.addFirst('A');
        list.addFirst('B');
        list.addFirst('C');
        // list.addFirst('D');
        list.addFirst('B');
        list.addFirst('A');

        // System.out.println(list);
        list.printLL();

        System.out.println(isPalindrome(list));
    }
}
