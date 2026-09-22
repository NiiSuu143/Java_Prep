package Java.L10_Bit_Manipulation;

public class UppercaseToLower {
    public static void main(String args[]) {
        // convert uppercase to lowercase
        for(char ch = 'A'; ch<= 'Z'; ch++) {

            // using bit manipulation
            // every uppercase letter and its lowercase counterpart have a fixed numerical difference of 32
            // The space character (' ') has an ASCII value of 32.
            System.out.print((char)(ch | ' ')+ " ");
        }
    }
}
