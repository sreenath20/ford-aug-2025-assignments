abstract public class Course {
    protected String courseName;
    protected String courseDuration;

    public Course(String courseName, String courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
    }


    abstract void enrollStudent(String studentName);

    abstract void startCourse();
}
