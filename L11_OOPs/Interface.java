public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatMeat();
    }
}

// interface is blueprint of class
interface Herbivore {
    void eatPlant();
}
interface Carnivore {
    void eatMeat();
}
class Bear implements Herbivore, Carnivore {
    // should call the two interface functions otherwise it shows error.
    public void eatPlant() {
        System.out.println("Bear eats plant...");
    }
    public void eatMeat() {
        System.out.println("Bear eats meat.");
    }
}



interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all directionns)");
    }
}
class King implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right (by 1 step)");
    }
}
class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right");
    }
}