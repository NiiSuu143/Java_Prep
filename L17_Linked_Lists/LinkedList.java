public class LinkedList {
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

    // Methods
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);

        // if linked list is empty at first then
        if(head == null) {
            head = tail = newNode;
            return;
        }

        // newNode's next = head
        newNode.next = head; // linking with the prev. one
        // head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // create a new node 
        Node newNode = new Node(data);

        // if linked list is empty at first
        if(head == null) {
            head = tail = newNode;
            return ;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
    }
}
