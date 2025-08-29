import java.util.ArrayList;

public class Student extends Person {
    private int stdId;
    private ArrayList<String> courseList;

    public Student() {
        this.courseList = new ArrayList<>();
    }
    public Student(String name, String email, int age, int stdId) {
        super(name, email, age);
        this.stdId = stdId;
        this.courseList = new ArrayList<>();

    }

    public ArrayList<String> getCourseList() {
        return courseList;
    }



    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public void addCourse(String course) {
        courseList.add(course);
        System.out.println(course);
    }



}
