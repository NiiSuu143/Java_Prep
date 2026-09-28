public class CountContiguousSubStr {
    public static int countSubStr(String str, int i, int j, int n) {
        // base case
        if(n == 1) {
            return 1;
        }
        if(n <= 0) {
            return 0;
        }
        // kaam
        int count = countSubStr(str, i+1, j, n-1) + 
        countSubStr(str, i, j-1, n-1) - 
        countSubStr(str, i+1, j-1, n-2);

        if(str.charAt(i) == str.charAt(j)) {
            count++;
        }
        return count;

    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(countSubStr(str, 0, n-1, n));
    }
}