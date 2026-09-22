

public class CompareStrings {
    public static void main(String[] args) {
        // String s1 = "Dabii";    
        // String s2 = "Dabii";    // s2 points at the Dabii which is s1
        // String s3 = new String("Dabii");

        // // simply s2 points at s1 that's why it is equal 
        // if(s1 == s2) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // // s3 is made with new keyword so. it became new string with new address
        // if(s1 == s3) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }

        // // if we want to compare s1 and s3 then use `s1.equals(s2)`
        // if(s1.equals(s3)) {
        //     System.out.println("Strings are equal");
        // } else {
        //     System.out.println("Strings are not equal");
        // }


        // use of .compareTo & .compareToIgnoreCase
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i=0; i<fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
