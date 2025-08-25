package assignment_04.online_learning_platform;

public abstract class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
    public String getCourseName() {
        return courseName;
    }
    public int getDuration() {
        return duration;
    }

    public abstract void enrollStudent(String studentName);
    public abstract void startCourse();
}
