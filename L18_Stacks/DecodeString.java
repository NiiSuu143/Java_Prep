import java.util.Stack;

public class DecodeString {
    public static String decoding(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currString = new StringBuilder();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');    // string to interger by using ascii code
                integerStack.push(count);
            } else if(ch == '[') {
                integerStack.push(count);
                stringStack.push(currString);
                count = 0;
                currString = new StringBuilder();
            } else if(ch == ']') {
                int repeatTimes = integerStack.pop();
                StringBuilder decoded = stringStack.pop();
                for(int j=0; j<repeatTimes; j++) {
                    decoded.append(currString);
                }
                currString = decoded;
            } else {
                currString.append(ch);
            }
        }

        return currString.toString();
    }
    public static void main(String[] args) {
        String str = "3[b2[v]]";
        System.out.println(decoding(str));
    }
}
