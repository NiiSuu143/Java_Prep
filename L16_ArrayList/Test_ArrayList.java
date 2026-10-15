import java.util.ArrayList;

public class Test_ArrayList {
    public static void main(String[] args) {
        // Array List topic is started....
        System.out.println("Let's go boys...");
        // some updation is added...
        System.out.println("Happy to learn new things...");

        /**************
         * Java Collection Framework
         * same as making objects in OOPs
         * ClassName objectName = new ClassName();
         * ****************/ 
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();

        // adding element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // get Operation
        int element = list.get(2);
        System.out.println(element);

        // delete element
        list.remove(2);
        System.out.println(list);

        // set element at index
        list.set(1, 10);
        System.out.println(list);

        // contain element
        System.out.println(list.contains(4));
        System.out.println(list.contains(9));

        // add element with index
        list.add(1, 8);
        System.out.println(list);

        // size of the ArrayList
        System.out.println(list.size());

        // print arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

        list1.add("Konichiwa");
        list2.add(true);

    }
}
