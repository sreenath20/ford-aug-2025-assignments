package Assignment4.OnlineLearningPlatform;


public abstract class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public abstract void enrollStudent(String studentName);
    public abstract void startCourse();
}
