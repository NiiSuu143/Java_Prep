public class CheckPalindrome {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // crate a new node
        Node newNode = new Node(data);
        size++;

        // if linked list is empty
        if(head == null) {
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // slow-fast approach ->  to find mid
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
      
        while(fast !=null && fast.next != null) {
            slow = slow.next;   // +1 -> next node(one by one)
            fast = fast.next.next;  // +2 -> 2nd next node(double)

        }
        return slow;
    }

    public static void main(String[] args) {
        CheckPalindrome newList = new CheckPalindrome();
        newList.addFirst(1);
        newList.addFirst(2);
        newList.addFirst(2);
        newList.addFirst(1);

        // print linked list
        newList.print();

    }
}
