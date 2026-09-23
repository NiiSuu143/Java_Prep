public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);    // by default color is brown which is assigned in abstract class
        h.changeColor();

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        c.changeColor();

        // Animal -> Horse -> Mustang
        // Mustang m = new Mustang();
    }
}

abstract class Animal {
    String color;
    // can have constructor
    Animal() {
        color = "brown";
        System.out.println("animal constructor is called");
    }
    
    void eat() {
        System.out.println("animal eats"); 
    }
    
    abstract void walk();
}

class Horse extends Animal {
    Horse() {
        System.out.println("horse constructor is called.");
    }
    void changeColor() {
        color = "black";
        System.out.println(color);
    }
    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("mustand constructor is called...");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("chicken constructor is called.");
    }
    void changeColor() {
        color = "white";
        System.out.println(color);
    }
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
