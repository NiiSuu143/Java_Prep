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
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    // remove first
    public void removeFirst() {
        // if there is only one node in the linked list
        if(size == 0) {
            System.out.println("Linked list is empty...");
            return ;
        } else if(size == 1) {
            // int val = head.data;
            head = tail = null;
            size = 0;
            return ;
        }
        head = head.next;
        size--;
    }
    public static void main(String[] args) {
        DoublyLL dl = new DoublyLL();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);

        dl.print();
        System.out.println("Size = "+size);
        
        // removeFirst
        dl.removeFirst();
        dl.print();
        System.out.println("Size = "+size);
    }
}
