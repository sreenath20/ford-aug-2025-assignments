package day4.Assignment3;

public abstract class Course {
    String courseName;
    String duration;

    public Course(String courseName, String duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public abstract void enrollStudent(String studentName);
    public abstract void startCourse();
}
