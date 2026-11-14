import java.util.*;
public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()) {
            char curr = s.pop();
            result.append(curr);
        }

        // need to change from StringBuilder to String
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "arigato gozaimasu";

        System.out.println(reverseString(str));
    }
}
