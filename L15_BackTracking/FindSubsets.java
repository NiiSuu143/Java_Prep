public class FindSubsets {
    public static void findSubsets(String str, String ans, int i) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // recursionn
        // Yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        // No choice
        findSubsets(str, ans, i+1);
    }

    public static void optimizedFindSubsets(String str, StringBuilder ans, int i) {
        // base case
        if(i == str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return ;
        }

        // recursion
        // Yes choice
        optimizedFindSubsets(str, ans.append(str.charAt(i)), i+1);
        // for StringBuilder, we need to delete the element for furthur use
        ans.deleteCharAt(ans.length()-1);
        // No choice
        optimizedFindSubsets(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str = "abc";
        // findSubsets(str, "", 0);

        // optimized one by using StringBuilder
        optimizedFindSubsets(str, new StringBuilder(), 0);
    }
}
