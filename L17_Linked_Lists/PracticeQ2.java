public class PracticeQ2 {
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

    // Delete N nodes after M nodes of a linked list
    public void deleteNNode(int M, int N) {
        Node curr = head;
        while(curr != null) {
            // retain M nodes
            for(int i=1; i<M && curr!=null; i++) {
                curr = curr.next;
            }

            // if we reached the end of the list
            if(curr == null) {
                return ;
            }

            // store the current node where deletion start
            Node temp = curr.next;

            // delete N nodes
            for(int i = 0; i<N && temp!=null; i++) {
                temp = temp.next;
            }

            // link the M-th node to the node after the N deleted node
            curr.next = temp;

            // updation
            curr = temp;
        }
    }
    public static void main(String[] args) {
        PracticeQ2 p2 = new PracticeQ2();
        p2.addFirst(8);
        p2.addFirst(7);
        p2.addFirst(6);
        p2.addFirst(5);
        p2.addFirst(4);
        p2.addFirst(3);
        p2.addFirst(2);
        p2.addFirst(1);
        p2.print();

        p2.deleteNNode(2, 2);
        p2.print();;
    }
}
