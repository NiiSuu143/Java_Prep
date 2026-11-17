import java.util.Stack;

public class DuplicateParenthesis {
    // Duplicate parenthesis
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // for closing
            if (ch == ')') {
                int count = 0;
                // // This one is called explicit approach 
                // while (s.peek() != '(') {
                //     s.pop();
                //     count++;
                // }
                // // check count is less than 1 or not
                // if (count < 1) {
                //     return true; // duplicate exist
                // } else {
                //     s.pop(); // opening pair
                // }

                /**************
                 * we can write this code instead of above commented code
                 * the direct s.pop() in while loop
                 * Because, generally s.pop() return its value while deleting
                 * This one is calle implicit approach
                 * **************/
                while (s.pop() != '(') {
                    count++;
                }

                // check count is less than 1 or not
                if (count < 1) {
                    return true; // duplicate exist
                } 
            } else {
                // opening
                s.push(ch);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b))+(c+d))";
        // String str = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str));
    }
}
