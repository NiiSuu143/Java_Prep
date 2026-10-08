public class FindPermutation {
    public static void findPermutationn(String str, String ans) {
        // base case
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursion -> O(n*n!)
        for(int i=0; i<str.length(); i++) {
            char curr = str.charAt(i);
            // "abcd" = "ab" + "de" = "abde" by removing c from it
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutationn(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        findPermutationn(str, new String());
    }
}
