
import java.util.*;

public class Practrice {
    public static int countLowercaseVowels(String useStr) {
        int count = 0;
        for(int i=0; i<useStr.length(); i++) {
            char ch = useStr.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void checkAnagrams(String str, String str1) {
        str = str.toLowerCase();
        str1 = str1.toLowerCase();

        if(str.length() == str1.length()) {
            char strCharArr[] = str.toCharArray();
            char str1CharArr[] = str1.toCharArray();

            Arrays.sort(strCharArr);
            Arrays.sort(str1CharArr);

            boolean result = Arrays.equals(strCharArr, str1CharArr);

            if(result) {
                System.out.println(str + " and " + str1 + " are anagrams of eachother.");
            } else {
                System.out.println(str + " and " + str1 + " are not anagrams of eachother.");
            }
        } else {
            System.out.println(str + " and " + str1 + " are not anagrams of eachother.");
        }
    }
    public static void main(String args[]) {
        // // 1st Question -> Count how many times lowercase vowels occurred in a String entered by the user.
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a string : ");
        // String userStr = sc.nextLine();
        // System.out.println(countLowercaseVowels(userStr));
        // sc.close();


        // // 2nd Question -> what will be the output
        // String str = "ShradhaDidi";
        // String str1 = "ApnaCollege";
        // String str2 = "ShradhaDidi";
        // System.out.println(str.equals(str2)+ " " +str1.equals(str2));


        // // 3rd Question -> what will be the output
        // String str = "ApnaCollege".replace("1", ""); // .replace() will change "1" to "" but there is not 1 so, output is unchanged.
        // System.out.println(str);

        
        // 4th Question -> Determine if 2 Strings are anagrams of each other. 
        String str = "care";
        String str1 = "race";
        checkAnagrams(str, str1);

        // 5th Question is also done...
    }
}
