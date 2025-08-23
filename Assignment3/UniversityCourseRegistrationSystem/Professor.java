package Assignment3.UniversityCourseRegistrationSystem;

public class Professor extends Person {
    private String subjectTaught;
    private String employeeId;

    public Professor(String name, String email, int age, String subjectTaught, String employeeId) {
        super(name, email, age);
        this.subjectTaught = subjectTaught;
        this.employeeId = employeeId;
    }

    public String getSubjectTaught() { return subjectTaught; }
    public String getEmployeeId() { return employeeId; }
}
