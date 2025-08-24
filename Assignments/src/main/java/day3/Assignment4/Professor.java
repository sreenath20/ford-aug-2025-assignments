package day3.Assignment4;

public class Professor extends Person{
    String subjectTaught;
    String employeeId;
    public Professor(String name, String email, int age, String subjectTaught, String employeeId) {
        super(name, email, age);
        this.subjectTaught = subjectTaught;
        this.employeeId = employeeId;
    }

}
