public class SwappingNodes {
    private Node head;
    public static Node tail;
    private static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);

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

    public void swappingNodes(int x, int y) {
        if(x == y) {
            return ;
        }

        // for 1st node -> node.data = x
        Node prevX = null, currX = head;
        while(currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }

        // for 2nd node -> node.data = x
        Node prevY = null, currY = head;
        while(currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }

        if(prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }

        if(prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
        
    }
    public static void main(String[] args) {
        SwappingNodes sn = new SwappingNodes();
        sn.addFirst(4);
        sn.addFirst(3);
        sn.addFirst(2);
        sn.addFirst(1);

        sn.print();

        // swapping nodes by using two keys
        sn.swappingNodes(2, 4);
        sn.print();
    }
}
