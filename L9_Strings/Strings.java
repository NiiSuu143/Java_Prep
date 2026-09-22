
// import java.util.Scanner;

public class Strings {
    public static void printLetters(String str) {
        for(int i=0; i<str.length(); i++) {
            System.out.print(str.charAt(i)+ " ");
        }
    }
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str1 = new String("xyz@#1234");

        // // Strings are IMMUTABLE...(means it cant be changed...)

        // Scanner sc = new Scanner(System.in);
        // // String str2 = sc.next();    // print only single word
        // String name = sc.nextLine();
        // System.out.println(name);

        // // length of the string
        // String fullname = "Dabii the king";
        // System.out.println(fullname.length());  // print the length with the combination of space and letters


        // Concatenation
        String firstname = "Sunanda";
        String lastname = "Leitanthem";
        String fullname = firstname+" "+lastname;
        // System.out.println(fullname.charAt(0));
        printLetters(fullname);
    }
}
