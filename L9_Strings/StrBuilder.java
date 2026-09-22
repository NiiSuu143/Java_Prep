

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
        // time complexity -> O(26);
        // with StringBuilder -> memory efficiency
    }
}
