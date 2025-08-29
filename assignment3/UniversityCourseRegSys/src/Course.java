import java.util.ArrayList;

public class Course extends Student{
    private String courseName;
    private ArrayList studentsEnrolled;

    public Course() {
        studentsEnrolled = new ArrayList<>();
    }
    public Course(String name, String email, int age, int stdId, ArrayList studentsEnrolled) {
        super(name, email, age, stdId);
        this.studentsEnrolled = studentsEnrolled;
    }

    public ArrayList getStudentsEnrolled() {
        return studentsEnrolled;
    }

    public void setStudentsEnrolled(ArrayList studentsEnrolled) {
        this.studentsEnrolled = studentsEnrolled;
    }

    public void addstudents(String studentName) {

        studentsEnrolled.add(studentName);
    }
    public void displayStudentsEnrolled() {
        System.out.println("Students Enrolled for :"+getName());
        for (Object std : getStudentsEnrolled()) {
            System.out.println(std);
        }


    }
}
