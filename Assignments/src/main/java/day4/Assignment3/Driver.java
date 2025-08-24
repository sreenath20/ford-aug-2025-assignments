package day4.Assignment3;

public class Driver {
    public static void main(String[] args) {
        ProgrammingCourse pc = new ProgrammingCourse("Java Programming","6 months");
        DesignCourse dc = new DesignCourse("Graphic Design","6 months");

        pc.enrollStudent("John");
        pc.startCourse();
        pc.generateCertificate("John");
        System.out.println();
        dc.enrollStudent("Alice");
        dc.startCourse();
        dc.generateCertificate("Alice");
    }
}
