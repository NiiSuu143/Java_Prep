public class Inheritance {
    public static void main(String args[]) {
        // Fish shark = new Fish();
        // shark.eat();

        // // multi level inheritance
        // Dog doggy = new Dog();
        // doggy.legs = 4;
        // System.out.println(doggy.legs);
    }
}

class Animal1 {
    String color;
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}



// // Hierarchial Inheritance
// class Mammal extends Animal1 {
//     void walk() {
//         System.out.println("walks");
//     }
// }
// class Fish extends Animal1 {
//     void swim() {
//         System.out.println("swim");
//     }
// }
// class Bird extends Animal1 {
//     void fly() {
//         System.out.println("fly");
//     }
// }



// // Multi level inheritance from animal1 class
// class Mammals extends Animal1 {
//     int legs;
// }
// class Dog extends Mammals {
//     String breed;
// }



// // Derived class / subclass
// class Fish extends Animal1 {
//     int fins;
//     void swim() {
//         System.out.println("swims in water");
//     }
// }



