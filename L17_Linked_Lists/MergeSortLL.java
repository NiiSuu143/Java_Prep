public class MergeSortLL {
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
        // create new node
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

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    // mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            // head1 compare head2
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        
        // for remaining node for head1
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        
        // for ramaining node for head2
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        // base case for recursion
        if(head == null || head.next == null) {
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left & right half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);    // left half
        Node newRight = mergeSort(rightHead);   // right half

        // merge
        return merge(newLeft, newRight);
    }
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        // ll.addFirst(5);

        ll.print();

        head = ll.mergeSort(head);
        ll.print();
        
        /***********
         * Time complexity of this is O(nlogn)
         * which is same as the normal merged sort
         * ************/
    }
}
