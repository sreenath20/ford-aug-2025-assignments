//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProgrammingCourse ProgCourse = new ProgrammingCourse("Java", "10hrs");
        ProgCourse.enrollStudent("Trishanth");
        ProgCourse.startCourse();
        ProgCourse.generateCertificate("Trishanth");

        System.out.println();

        DesignCourse graphicDesign = new DesignCourse("Graphic design", "10hrs");
        graphicDesign.enrollStudent("Trishanth ");
        graphicDesign.startCourse();
        graphicDesign.generateCertificate("Trishanth");
    }
}