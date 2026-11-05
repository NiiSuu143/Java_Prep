public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // add first
    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return ;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // print linked list
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);

        dl.print();
    }
}
