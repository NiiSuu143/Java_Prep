import java.util.*;

public class Package {
    public static void main(String[] args) {
        // Scanner is a class from java.util package
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = a + a;
        System.out.println(sum);
        sc.close();
    }
}
