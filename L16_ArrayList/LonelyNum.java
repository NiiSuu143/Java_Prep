import java.util.ArrayList;
import java.util.Collections;

public class LonelyNum {
    public static ArrayList<Integer> printLonlyNum(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> newList = new ArrayList<>();

        // first element
        if(list.size() == 1) {
            newList.add(list.get(0));
        }

        // interior element
        for(int i=1; i<list.size()-1; i++) {

            if(list.get(i-1)+1 < list.get(i) && list.get(i)+1 < list.get(i+1)) {
                newList.add(list.get(i));
            }
        }

        // last element
        if(list.size() > 1) {
            if(list.get(0)+1 < list.get(1)) {
                newList.add(list.get(0));
            }

            if(list.get(list.size()-2)+1 < list.get(list.size()-1)) {
                newList.add(list.get(list.size()-1));
            }
        }
        return newList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);

        System.out.println(printLonlyNum(list));
    }
}
