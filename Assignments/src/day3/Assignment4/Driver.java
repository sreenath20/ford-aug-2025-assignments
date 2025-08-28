package day3.Assignment4;

public class Driver {
    public static void main(String[] args) {
        System.out.println("University Course Registration System");

        Professor professor1= new Professor("Alex", "alex@vit.ac.in", 30,"al08","DSA");
        Professor professor2=new Professor("Ajay", "ajay@vit.ac.in", 58, "ay102", "OS");

        Course dbCourse = new Course("DBMS", "DBMS99", professor1);
        Course designCourse = new Course("CN", "CN111", professor2);
        System.out.println("--- Course Information ---");
        dbCourse.displayCourseInfo();
        designCourse.displayCourseInfo();

        System.out.println("--- Professor Information ---");
        professor1.displayProfessorInfo();
        professor2.displayProfessorInfo();

        Student student1= new Student("Suhas", "suhas@gmail.com",20,"21bct0073");
        Student student2= new Student("chichu", "chichu@gmail.com", 20,"21bce8900");
        Student student3= new Student("venky","venky@gmail.com",22,"21bba0987");

        System.out.println("--- Student Registration ---");
        dbCourse.registerStudent(student1);
        designCourse.registerStudent(student1);
        designCourse.registerStudent(student2);
        dbCourse.registerStudent(student3);
        designCourse.registerStudent(student3);
        System.out.println();

        System.out.println("--- Student Information ---");
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        student3.displayStudentInfo();

        System.out.println("Course Name: "+ dbCourse.getCourseName());
        System.out.println("Student count: "+ dbCourse.getStudentCount());
        System.out.println();
        System.out.println("Course Name: "+ designCourse.getCourseName());
        System.out.println("Student count: "+ designCourse.getStudentCount());
    }
}
