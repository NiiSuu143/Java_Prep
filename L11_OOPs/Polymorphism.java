public class Polymorphism {
    public static void main(String[] args) {
        // compile time polymorphism
        // methods overloading or function overloading
        Calculator cal = new Calculator();
        System.out.println(cal.sum(5, 10));
        System.out.println(cal.sum(5.8f, 10.2f));
        System.out.println(cal.sum(5, 10, 20));


        // run time polymorphism
        // methods overriding or function overriding
        Deer d = new Deer();
        d.eat();
    }
}

// run time polymorphism
// methods overriding or function overriding
class Animal {
    void eat() {
        System.out.println("eats anythings...");
    }
}
class Deer extends Animal {
    void eat() {
        System.out.println("eats grass...");
    }
}


// compile time polymorphism
// methods overloading or function overloading
class Calculator {
    int sum(int a, int b) {
        return a+b;
    }
    float sum(float a, float b) {
        return a+b;
    }
    int sum(int a, int b, int c) {
        return a+b+c;
    }
}
