public class ConstructorChaining {
    public static void main(String[] args) {
        /******
         * this()
         * *******/
        // invokes parameterized constructor 3
        new Temp();


        /********
         * super()
         * *********/
        // calls parameterized constructor 4
        Derived obj = new Derived("test");
        // Calls No-argument constructor
        // Derived obj = new Derived();

    }
}

 /*********
     * Rules of constructor chaining this():
     * 1. The this() expression should always be the first line of the constructor.
     * 2. There should be at-least be one constructor without the this() keyword (constructor 3 in above example).
     * 3. Constructor chaining can be achieved in any order.
     * ***********/ 
class Temp {
    Temp()
    {
        // calls constructor 2
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2
    Temp(int x)
    {
        // calls constructor 3
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3
    Temp(int x, int y)
    {
        System.out.println(x * y);
    }
}


 /*********
     * Rules of constructor chaining super():
     * 1. It must be the first statement in the child class constructor.
     * 2. Used in inheritance to initialize superclass members.
     * ***********/ 
class Base {
    String name;

    // constructor 1
    Base() {
        this("");
        System.out.println("No argument constructor of the base class.");
    }

    // constructor 2
    Base(String name) {
        this.name = name;
        System.out.println("Parameterized constructor of base class");
    }
}

class Derived extends Base {
    // constructor 3
    Derived() {
        System.out.println("No-argument constructor of derived");
    }

    // parameterized constructor 4
    Derived(String name) {
        // invokes base class constructor 2
        super(name);
        System.out.println("Calling parameterized constructor of derived");
    }
}


