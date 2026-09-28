public class LenghtOfString {
    public static int findLengthOfStr(String str) {
        // base case 
        if(str.length() == 0) {
            return 0;
        }

        // kaam
        return findLengthOfStr(str.substring(1)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(findLengthOfStr("abcde"));
    }
}
