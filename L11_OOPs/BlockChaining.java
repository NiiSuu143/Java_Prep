public class BlockChaining {
    public static void main(String[] args) {
        new Temp1();
        new Temp1(10);
    }
}

class Temp1 {
    // block to be executed first
    {
        System.out.println("init");
    }
    Temp1() {
        System.out.println("default");
    }
    Temp1(int x) {
        System.out.println(x);
    }

    // block to be executed after the first block
    // which has been defined above.
    {
        System.out.println("second");
    }
}
