import java.util.ArrayList;

public class Multi_Dimension {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        mainList.add(arr);

        arr1.add(2);
        arr1.add(4);
        arr1.add(6);
        arr1.add(8);
        mainList.add(arr1);

        System.out.println(mainList);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

        System.out.println();

        ArrayList<ArrayList<Integer>> mainList1 = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++) {
            list1.add(i*1); // 1 2 3 4 5
            list2.add(i*2); // 2 4 6 8 10
            list3.add(i*3); // 3 6 9 12 15
        }

        mainList1.add(list1);
        mainList1.add(list2);
        mainList1.add(list3);
        list2.remove(2);
        list2.remove(3);

        System.out.println(mainList1);

        // nested loop
        for(int i=0; i<mainList1.size(); i++) {
            ArrayList<Integer> currList1 = mainList1.get(i);
            for(int j=0; j<currList1.size(); j++) {
                System.out.print(currList1.get(j)+ " ");
            }
            System.out.println();
        }

    }
}
