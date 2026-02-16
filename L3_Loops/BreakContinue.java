package Java.L3_Loops;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i = 0; i<5; i++) {
            if(i == 3) {
                break;
            }
            System.out.println(i);
            // if we use "continue" it will skip the iteration
        }
        System.out.println("I'm out of the loop");
    }
}
