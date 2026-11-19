import java.util.Stack;

public class SimplifyPath {
    // overall time complexity of simplifyPath is O(n)
    public static String simplifyPath(String str) {
        Stack<String> s = new Stack<>();
        /*************
         * .split("/") -> it automatically cut the string to many parts 
         * ie. "/" acts as a separater.... 
         * time complexity of split("/") -> O(n)
         * *************/
        String[] strArr = str.split("/");   // it always start with "" for this case

        for(String part : strArr) { // O(n)
            if(part.equals("") || part.equals(".")) {
                // skip empty string and curr dir
                continue;
            } else if(part.equals("..")) {
                // move upto parent directory -> root
                if(!s.isEmpty()) {
                    s.pop();
                }
            } else {
                // push valid directory name inside the stack
                s.push(part);
            }
        }

        // if stack is empty
        if(s.isEmpty()) {
            return "/";
        }

        // by using stringBuilder -> O(n)
        StringBuilder result = new StringBuilder();
        for(String dir : s) {
            result.append("/").append(dir);
        }

        // finally return string
        return result.toString();
    }
    public static void main(String[] args) {
        String str = "/a/b/..";
        String res = simplifyPath(str);
        System.out.println(res);
    }
}
