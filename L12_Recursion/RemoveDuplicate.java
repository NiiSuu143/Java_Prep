public class RemoveDuplicate {
    public static void removeDupli(String str, int i, StringBuilder newStr, boolean[] map) {
        // base case
        if(i == str.length()) {
            System.out.println(newStr);     // should not add .toString() -> it is used when we need to compare with a normal string with StringBuilder
            return;
        }
        // kaam
        char ch = str.charAt(i);
        int j = ch - 'a';
        if(map[j] != true) {
            map[j] = true;
            newStr.append(ch);
        }

        removeDupli(str, i+1, newStr, map);

        // if(map[ch - 'a'] == true) {
        //     removeDupli(str, i+1, newStr, map);
        // } else {
        //     map[ch - 'a'] = true;
        //     removeDupli(str, i+1, newStr.append(ch), map);
        // }

    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder newStr = new StringBuilder("");
        boolean[] map = new boolean[26];
        removeDupli(str, 0, newStr, map);
    }
}
