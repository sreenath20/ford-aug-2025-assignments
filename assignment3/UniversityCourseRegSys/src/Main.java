//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Rishan");
        System.out.println("Name of the student :"+student.getName());
        System.out.println("courses enrolled :");
        student.addCourse("java");
        student.addCourse("python");
        student.addCourse("c++");


        System.out.println("____________________");
        Course java = new Course();
        java.setName("java");
        java.addstudents("trixie");
        java.displayStudentsEnrolled();


System.out.println("____________________");
        Professor prof = new Professor();
        prof.setName("Professor");
        prof.setSubjectTaught("Java");
        prof.displayProfessorDetails();




    }
}