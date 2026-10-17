import java.util.ArrayList;
import java.util.Collections;

public class InbuiltFunc {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list); // Ascending order
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        // Collections.reverseOrder() -> Comparator(functions that defind logic)
        System.out.println(list);

        // Implementation of ArrayList
        /*********
         * in function, first crate a normal array with specific size
         * then when it is fully filled or half filled
         * it will create a double size array and copy the element from prev. one
         * the "double size which is created" varies to different java versions
         * ************/

    }
}
