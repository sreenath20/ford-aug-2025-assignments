package day3.Assignment4;

public class Professor extends Person {
    private String employeeId;
    private String subjectTaught;

    public Professor(String name, String email, int age, String employeeId, String subjectTaught){
        super(name, email, age);
        this.employeeId = employeeId;
        this.subjectTaught = subjectTaught;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public void displayProfessorInfo(){
        displayPersonInfo();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Courses taught: " + subjectTaught);
        System.out.println();
    }
}
