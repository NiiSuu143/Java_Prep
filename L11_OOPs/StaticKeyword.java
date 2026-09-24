public class StaticKeyword {
    public static void main(String args[]) {
        Students s1 = new Students();
        s1.schoolName = "RIT";

        Students s2 = new Students();
        System.out.println(s2.schoolName);

        // if we change it from s3 then it will changes for all student
        Students s3 = new Students();
        s3.schoolName = "ABC";

        System.out.println(s2.schoolName);  // output -> ABC
    }
}

class Students {
    // this static one will be created only once and other will points in this one as reference
    static int returnPercentage(int math, int phy, int chem) {
        return (math + phy + chem) / 3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}
