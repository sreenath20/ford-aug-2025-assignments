package Assignment3.EmployeeManagementSystem;

public class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(int id, String name, double salary, String department, int teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void displayManagerDetails() {
        super.displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}
