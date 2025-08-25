package assignment_04.online_learning_platform;

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Online Learning platform\n");

        ProgrammingCourse pc = new ProgrammingCourse("Java Programming", 12);
        pc.enrollStudent("John");
        pc.startCourse();
        pc.generateCertificate("John");
        System.out.println("");
        DesignCourse dc = new DesignCourse("Graphic Design", 8);
        dc.enrollStudent("Alice");
        dc.startCourse();
        dc.generateCertificate("Alice");
    }
}
