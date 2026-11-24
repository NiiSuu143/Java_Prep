import java.util.*;

public class FirstNonRepeatLetter {
    // time complexity -> O(n)
    public static void getFirst_NonRepeating_Letter(String str) {
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);   // add to queue
            if(ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }

            // if any ch has freq > 1 then remove
            while(!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
               q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        getFirst_NonRepeating_Letter(str);
    }
}
