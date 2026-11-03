import java.util.LinkedList;;
public class CollectionsFramework {
    public static void main(String[] args) {
        // create -> Not objects like int, float, char -> Integer, Character
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.addFirst(5);
        ll.addLast(6);

        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
