public class SuperKeyword {
    public static void main(String[] args) {
        HorseBasic h = new HorseBasic();
        System.out.println(h.color);
    }
}

class AnimalBasic {
    String color;
    AnimalBasic() {
        System.out.println("animalsuper constructor is called.");
    }
}

class HorseBasic extends AnimalBasic {
    HorseBasic() {
        // super();    // if we dont write this super statement java will automatically call this line by default.
        super.color = "brown";
        System.out.println("HorseSuper constructor is called.");
    }
}
