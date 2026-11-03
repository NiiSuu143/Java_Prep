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

    public static void print() {
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

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                cycle = true;
                break;
            }   
        }
        
        // if there is no loop or no cycle then return
        if(cycle == false) {
            return;
        }
        
        // Finding meeting point -> to find last node 
        slow = head;    // slow becomes head again
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -> last.next = null;
        prev.next = null;
        
    }
    public static void main(String[] args) {
        // DetectLoop dl = new DetectLoop();
        // dl.addFirst(4);
        // dl.addFirst(3);
        // dl.addFirst(2);
        // dl.addFirst(1);
        // dl.print();

        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;;

        // it is like this one which is a loop
        // 1 -> 2 -> 3 -> 2(prev 2) 
        System.out.println(isCycle());
        
        removeCycle();

        // after removing cycle
        System.out.println(isCycle());
        print();
        // 1 -> 2 -> 3 -> null
    }
}
