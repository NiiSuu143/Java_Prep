import java.util.ArrayList;

public class Monotonic_ArrayList {
    /***********
     * Practice question 1 -> Monotonci ArrayList
     * An Arraylist is monotonic if it is either monotone increasing or monotone
     * decreasing.
     ****************/
    public static boolean checkMonotonic(ArrayList<Integer> list) {
        boolean inc = true;
        boolean dec = true;
        for (int i = 0; i < list.size() - 1; i++) {
            int j = i + 1;
            // increasing monotonic
            if (list.get(i) > list.get(j)) {
                inc = false;
            } 

            // decreasing monotonic
            if(list.get(i) < list.get(j)) {
                dec = false;
            }
        }
        return inc || dec;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(2);
        System.out.println(list);
        System.out.println(checkMonotonic(list));
    }
}
