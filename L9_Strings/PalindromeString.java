

public class PalindromeString {
    public static boolean checkPalindrome1(String str) {
        for(int i=0; i<str.length()/2; i++) {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-i-1)) {
                return false;
            }
        }
        return true;
    }
    
    public static void checkPalindrome(String str) {
        boolean isPalindrome = false;
        int first = 0;
        int last = str.length()-1;
        while(first <= last) {
            if(str.charAt(first) == str.charAt(last)) {
                isPalindrome = true;
                first++;
                last--;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome == true) {
            System.out.println(str+ " is a palindrome");
        } else {
            System.out.println(str+ " is not a palindrome");
        }
    }
    public static void main(String[] args) {
        // String str = "racecar";
        // String str1 = "noon";
        String str2 = "madam";
        // checkPalindrome(str2);
        System.out.println(checkPalindrome1(str2));
    }
}
