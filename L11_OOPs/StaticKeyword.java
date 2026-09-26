public class StaticKeyword {
    public static void main(String args[]) {
        // Student1 s1 = new Student1();
        // s1.schoolName = "RIT";

        // Student1 s2 = new Student1();
        // System.out.println(s2.schoolName);

        // // if we change it from s3 then it will changes for all student
        // Student1 s3 = new Student1();
        // s3.schoolName = "ABC";

        // System.out.println(s2.schoolName);  // output -> ABC
    }
}

class Student1 {
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
