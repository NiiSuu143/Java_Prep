public class Intersec2LL {
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head1;
    public static Node head2;
    public static Node tail;

    public static Node getIntersectionPart(Node head1, Node head2) {
        while(head2 != null) {
            Node temp = head1;
            while(temp != null) {
                if(temp == head2) {
                    return head2;
                }
                temp = temp.next;
            }
            head2 = head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        // 1nd linked list 
        head2 = new Node(4);
        head2.next = new Node(5);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(7);
        head2.next.next.next.next = null;

        // 2nd linked list
        head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = head2.next.next;

        // solution -> intersection node
        Node intersectionPoint = getIntersectionPart(head1, head2);
        if(intersectionPoint != null) {
            System.out.println("Intersection point = "+intersectionPoint.data);
        } else {
            System.out.println("There is no intersection point....");
        }
    }
}
