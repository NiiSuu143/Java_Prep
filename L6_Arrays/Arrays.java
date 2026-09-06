package Java.L6_Arrays;
import java.util.*;

public class Arrays {

    public static void update(int marks[]) {
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // int marks[] = new int[50];
        // int numbers[] = {1, 2, 3};
        String fruits[] = {"apple", "orange", "mango"};
        System.out.println("Fruits : " +fruits[1]);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Phys. = "+ marks[0]);
        // System.out.println("Maths. = "+ marks[1]);
        // System.out.println("Chem. = "+ marks[2]);
        
        // marks[2] = marks[2] + 1;
        // System.out.println("Chem. = "+ marks[ 2]);

        // int average = (marks[0] + marks[1] + marks[2])/3;
        // System.out.println("Average = "+average);

        // System.out.println("Length of Array : "+marks.length);

        int marks[] = {97, 98, 99};
        update(marks);
        for(int i=0; i<marks.length; i++) {
            System.out.println("Updated marks : "+ marks[i]);
        }
        sc.close();
    }
}
