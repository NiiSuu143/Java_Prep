package Java.L5_Function;

public class FunctionMultiply {

    public static int multiply(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 10;
        int product = multiply(num1, num2);
        System.out.println("Product is: " + product);
    }
}
