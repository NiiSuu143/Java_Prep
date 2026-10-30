public class RemoveNth_fromEnd {
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
        size++;

        // if linked list is empty
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeNth_end(int n) {
        int sz = 0;
        Node temp = head;
        // count size of the linked list
        while(temp != null) {
            sz++;
            temp = temp.next;
        }

        // if size = n
        if(n == sz) {
            head = head.next;   // remove first node
            return ;
        }

        // sz - n
        int i = 1;
        int iToFind = sz - n;   // finding the prev node of the actual removing node
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;  // removing node's next becomes prev's next
        return ;

    }
    public static void main(String[] args) {
        RemoveNth_fromEnd li = new RemoveNth_fromEnd();
        li.addFirst(5);
        li.addFirst(4);
        li.addFirst(3);
        li.addFirst(2);
        li.addFirst(1);

        li.print();

        li.removeNth_end(3);
        li.print();
    }
}
