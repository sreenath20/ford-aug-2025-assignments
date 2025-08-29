public class Professor extends Person {
    private String subjectTaught;
    private int employeeId;

    public Professor() {

    }
    public Professor(String subjectTaught, int employeeId,String name,String email,int age) {
        super(name,email,age);
        this.subjectTaught = subjectTaught;
        this.employeeId = employeeId;

    }

    public String getSubjectTaught() {
        return subjectTaught;
    }

    public void setSubjectTaught(String subjectTaught) {
        this.subjectTaught = subjectTaught;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void displayProfessorDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + getSubjectTaught());
        System.out.println("ID: " + employeeId);

    }
}
