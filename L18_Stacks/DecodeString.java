import java.util.Stack;

public class DecodeString {
    /**************
     * Time complexity is O(L)
     * where L is the no. of length of the decoded string at the last
     * because when decoded the process is also increased...
     * *******************/
    public static String decoding(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder currString = new StringBuilder();
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                count = count * 10 + (ch - '0');    // string to interger by using ascii code
            } else if(ch == '[') {
                integerStack.push(count); // push count to integerStack
                stringStack.push(currString);   // push currString to stringStack
                count = 0;  // reset count for inner box
                currString = new StringBuilder();   // reset currString for inner new char.
            } else if(ch == ']') {
                int repeatTimes = integerStack.pop();   // pop the repeated time form integerStack
                StringBuilder decoded = stringStack.pop();  // pop the outer one char. which is in paused
                for(int j=0; j<repeatTimes; j++) {
                    decoded.append(currString); // append to the new StringBuilder decoded as the string box is decoded
                }
                currString = decoded;   // put the decoded one to currString 
            } else {
                currString.append(ch);  // if the ch = normal char then append to currString
            }
        }

        return currString.toString();
    }
    public static void main(String[] args) {
        String str = "3[b2[v]]";
        System.out.println(decoding(str));
    }
}
