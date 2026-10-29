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

    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return ;
        }
        // create a newNode
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;

    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();
    }
}
