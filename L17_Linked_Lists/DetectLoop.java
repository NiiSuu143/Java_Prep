public class DetectLoop {
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
        // create a new node
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return ;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Floyd's cycle finding algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;   // +1
            fast = fast.next.next;  // +2
            if(slow == fast) {
                return true;    // cycle exists
            }
        }
        return false;   // cycle does not exist
    }
    public static void main(String[] args) {
        // DetectLoop dl = new DetectLoop();
        // dl.addFirst(4);
        // dl.addFirst(3);
        // dl.addFirst(2);
        // dl.addFirst(1);
        // dl.print();

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        // it is like this one which is a loop
        // 1 -> 2 -> 3 -> 1 
        System.out.println(isCycle());
    }
}
