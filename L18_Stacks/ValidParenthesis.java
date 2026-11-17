import java.util.*;

public class ValidParenthesis {
    /***************
     * Time complexity -> O(n)
     * **************/
    public static boolean isValid(String str) { 
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            // opening case
            if(ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
            } else {
                // closing case
                if(s.isEmpty()) {
                    return false;
                }
    
                if( (s.peek() == '(' && ch == ')')  // ()
                    || (s.peek() == '{' && ch == '}')   // {}
                    || (s.peek() == '[' && ch == ']') ) {   // []
                        s.pop();
                } else {
                    return false;
                }

            }

        }

        if(s.isEmpty()) {
            return true;
        } else {
            return false;   // if there are some remaining in stack
        }
    }
    public static void main(String[] args) {
        String str = "({[]}())";
        System.out.println(isValid(str));
    }
}
