public class OddEvenLL {
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
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Segragate Odd and Even in linked list
    public void oddEven() {
        // if linked list has only 1 node or null
        if(head == null || head == tail) {
            return ;
        }

        Node prev = null;
        Node curr = head;
        Node end = tail;    // original tail
        Node newEnd = tail; // this one is moving pointer


        // finding odd nodes and linked to tail(newnewEnd)
        while (curr.data % 2 != 0 && curr != end) {
            newEnd.next = curr;
            curr = curr.next;
            newEnd.next.next = null; // ensure the last node -> null
            newEnd = newEnd.next; // update the newEnd node to the last new node
        }

        // for even odd
        if (curr.data % 2 == 0) {
            head = curr;

            // traverse the node from head to newEnd
            while (curr != end) {
                // if node is even
                if (curr.data % 2 == 0) {
                    prev = curr;
                    curr = curr.next;
                } else {
                    // if node is odd
                    prev.next = curr.next;
                    curr.next = null; // last node -> null
                    newEnd.next = curr; // last node.next = new last node
                    newEnd = curr; // pointer newEnd at new last node
                    curr = prev.next;
                }
            }
        } else {
            // If the first processed node wasn't even, prev simply catches up to curr
            prev = curr;
        }

        // 3. Clean up the final 'tail' node if it was odd
        if (newEnd != end && end.data % 2 != 0) {
            prev.next = end.next;
            end.next = null;
            newEnd.next = end;
        }
    }

    public static void main(String[] args) {
        OddEvenLL oe = new OddEvenLL();
        oe.addFirst(6);
        oe.addFirst(1);
        oe.addFirst(4);
        oe.addFirst(5);
        oe.addFirst(10);
        oe.addFirst(12);
        oe.addFirst(8);
        oe.print();

        // separate odd even in linked list
        oe.oddEven();
        oe.print();
    }
}
