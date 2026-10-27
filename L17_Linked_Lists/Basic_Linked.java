import java.util.LinkedList;

public class Basic_Linked {
    public static void main(String[] args) {
        /************
         * LinkedList is a part of the Java Collections Framework.
         * It is present in the java.util package.
         * It implements a doubly linked list, where each element is stored in a node containing the element and references to the previous and next nodes.
         * ************/
        System.out.println("Let's start the linked list");
        LinkedList<Integer> li = new LinkedList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        System.out.println(li);

    }
}
