public class KeypadCombination {
    static String[] keypad = {
            "", // 0
            "", // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs", // 7
            "tuv", // 8
            "wxyz" // 9
    };

    public static void keyCombination(String digits, int index, String currPath) {
        // base case
        if (index == digits.length()) {
            if (currPath.isEmpty()) {
                System.out.println("You should aleast a key...");
            } else {
                System.out.println(currPath);
            }
            return;
        }

        // recursion
        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);

            keyCombination(digits, index + 1, currPath + letter);
        }
    }

    // by using StringBuilder
    public static void keyComb(String digits, int index, StringBuilder currPath) {
        // base case
        if (index == digits.length()) {
            if (currPath.isEmpty()) {
                System.out.println("You should aleast a key...");
            } else {
                System.out.println(currPath.toString());
            }
            return;
        }

        // recursion
        int digit = digits.charAt(index) - '0';
        String letters = keypad[digit];

        for (int i = 0; i < letters.length(); i++) {
            char letter = letters.charAt(i);

            keyComb(digits, index + 1, currPath.append(letter));
            currPath.deleteCharAt(currPath.length() - 1);
        }
    }

    public static void main(String[] args) {
        String digits = "2";
        System.out.println("Key combination of " + digits + " : ");
        // keyCombination(digits, 0, new String());
        // using StringBuilder
        keyComb(digits, 0, new StringBuilder());
    }
}
