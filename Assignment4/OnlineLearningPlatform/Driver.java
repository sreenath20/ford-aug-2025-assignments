package Assignment4.OnlineLearningPlatform;


public class Driver {
    public static void main(String[] args) {
        ProgrammingCourse javaCourse = new ProgrammingCourse("Java Programming Course", 8);
        javaCourse.enrollStudent("Ram");
        javaCourse.startCourse();
        javaCourse.generateCertificate("Ram");

        System.out.println();

        DesigningCourse designCourse = new DesigningCourse("Graphic Design Course", 6);
        designCourse.enrollStudent("Sam");
        designCourse.startCourse();
        designCourse.generateCertificate("Sam");
    }
}

