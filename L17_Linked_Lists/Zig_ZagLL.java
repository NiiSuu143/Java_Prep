public class Zig_ZagLL {
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

    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
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
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    } 

    // zig-zag linked list 
    public void zigZag(Node head) {
        // find mid node -> mid = last node of 1st half
        Node mid = findMid(head);

        // 2nd half reverse
        Node curr = mid.next;
        mid.next = null;    // 1st left half need to end with null
        Node prev = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node rightHead = prev;

        // alternate merging -> zig-zag merge
        Node Lh = head;
        Node Rh = rightHead;
        Node nextL, nextR;
        while(Lh != null && Rh !=null) {
            nextL = Lh.next;
            Lh.next = Rh;
            nextR = Rh.next;
            Rh.next = nextL;

            // updation of this loop
            Lh = nextL;
            Rh = nextR;
        }
    }
    public static void main(String[] args) {
        Zig_ZagLL zz = new Zig_ZagLL();
        zz.addFirst(6);
        zz.addFirst(5);
        zz.addFirst(4);
        zz.addFirst(3);
        zz.addFirst(2);
        zz.addFirst(1);

        zz.print();

        // zig-zag linked list
        zz.zigZag(head);
        zz.print();
    }
}
