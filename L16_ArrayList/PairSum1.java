import java.util.ArrayList;

public class PairSum1 {
    // Brute force approach -> O(n^2)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i=0; i<list.size(); i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i) + list.get(j) == target) {
                    return true;
                    // System.out.println(list.get(i)+ " "+ list.get(j));
                }
            }
        }
        return false;
    }

    // 2 pointer approach -> O(n)
    public static boolean optimizedPairSum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while(lp < rp) {
            // case 1
            if(list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2
            if(list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                // case 3
                rp--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        int target = 5;
        // System.out.println(pairSum(list, target));
        // pairSum(list, target);
        System.out.println(optimizedPairSum(list, target));

    }
}
