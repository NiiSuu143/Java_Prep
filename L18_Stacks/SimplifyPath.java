import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String str) {
        Stack<String> s = new Stack<>();
        /*************
         * .split("/") -> it automatically cut the string to many parts 
         * ie. "/" acts as a separater.... 
         * *************/
        String[] strArr = str.split("/");   // it always start with "" for this case

        for(String part : strArr) {
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

        // if stack is not empty then
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
