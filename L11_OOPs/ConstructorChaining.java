public class ConstructorChaining {
    ConstructorChaining()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    ConstructorChaining(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChaining(int x, int y)
    {
        System.out.println(x * y);
    }
    public static void main(String[] args) {
        /*********
     * Rules of constructor chaining :
     * 1. The this() expression should always be the first line of the constructor.
     * 2. There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
     * 3. Constructor chaining can be achieved in any order.
     * ***********/ 

        // invokes parameterized constructor 3
        new ConstructorChaining();
    }
}


