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
    public static int size;

    // Methods
    public void addFirst(int data) {
        // create new node
        Node newNode = new Node(data);
        size++;

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
        size++;

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
        size++;
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

    public int rmoveFirst() {
        if(size == 0) {
            System.out.println("Linked list is empty....");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("Linked list is empty...");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = tail.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev -> i = size-2;
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;   // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int itrSearch(int key) {
        int i = 0;
        Node temp = head;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // by using recursion
    public int helper(Node head, int key) { // time complexity -> O(n)
        // base case
        if(head == null) {
            return -1;
        }
        
        // kaam or recursion
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;
    }

    public int recurSearch(int key) {
        return helper(head, key);
    }


    // reverse of linked list -> time complexity is O(n)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;    // pre initialized the tail as head (we r doing reverse)
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;   // actual reverse step
            prev = curr;    // curr becomes prev
            curr = next;    // next becomes curr
        }
        head = prev;    // because curr becomes null at the end of loop
    }


    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2, 9);
        ll.print();

        // // remove first 
        // ll.rmoveFirst();
        // ll.print();

        // // remove last
        // ll.removeLast();
        // ll.print();
        System.out.println("Size of linked list = "+size);

        // search key
        System.out.println("Found at index "+ll.itrSearch(4));

        // search key using recursion
        System.out.println("Found at index "+ ll.recurSearch(4));

        // reverse linked list
        ll.reverse();
        ll.print();
    }
}
