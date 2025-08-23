abstract class Course {
    protected String courseName;
    protected String duration;

    protected Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    abstract void enrollStudent(String studentName);
    abstract void startCourse();
}

interface CertificateProvider {
    void generateCertificate(String studentName);
}

class ProgrammingCourse extends Course implements CertificateProvider {
    public ProgrammingCourse(String courseName, String duration) {
        super(courseName, duration);
    }

    @Override
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + courseName);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in " + courseName);
    }
}

class DesignCourse extends Course implements CertificateProvider {
    public DesignCourse(String courseName, String duration) {
        super(courseName, duration);
    }

    @Override
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + " in " + courseName);
    }

    @Override
    void startCourse() {
        System.out.println("Starting " + courseName);
    }

    @Override
    public void generateCertificate(String studentName) {
        System.out.println("Certificate generated for " + studentName + " in " + courseName);
    }
}

public class OnlineLearningPlatform {
    public static void main(String[] args) {
        ProgrammingCourse prog = new ProgrammingCourse("Java Programming Course", "8 weeks");
        prog.enrollStudent("John");
        prog.startCourse();
        prog.generateCertificate("John");

        DesignCourse design = new DesignCourse("Graphic Design Course", "6 weeks");
        design.enrollStudent("Alice");
        design.startCourse();
        design.generateCertificate("Alice");
    }
}
