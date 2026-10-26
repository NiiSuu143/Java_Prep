import java.util.ArrayList;

public class Beautiful_Array {
    public static ArrayList<Integer> beautifulArr(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            // for even num.
            for (Integer e : ans) {
                if (2 * e <= n)
                    temp.add(e * 2);
            }

            // for odd num.
            for (Integer e : ans) {
                if (2 * e - 1 <= n)
                    temp.add(e * 2 - 1);
            }
            ans = temp;
        }
        return ans;
    }

    public static ArrayList<Integer> beautifulArray(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        divideConque(1, 1, res, n);
        return res;
    }

    public static void divideConque(int start, int increment, ArrayList<Integer> res, int n) {
        // we can be solved this problem with divide and conquer rule and recursion method..
        if (start + increment > n) {
            res.add(start);
            return;
        }
        divideConque(start, 2 * increment, res, n);
        divideConque(start + increment, 2 * increment, res, n);
    }

    /**********
     * Revised it and learn 100% for sure....
     * ************/
    public static void main(String[] args) {
        // using normal iteration
        // System.out.println(beautifulArr(4));

        // using divide and conquer rule and recursion
        System.out.println(beautifulArray(4));;
        
    }
}
