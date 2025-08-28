package day3.Assignment1;

public class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager(int id, String name, double salary, String department) {
        super(id, name, salary, department);
    }

    public Manager() {
    }

    public Manager(int teamSize, String projectName) {
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public Manager(int id, String name, double salary, String department, int teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                ", projectName='" + projectName + '\'' +
                '}';
    }

    public void displayManagerDetails() {
        System.out.println("Manager Details -> ID: " + getId() +
                ", Name: " + getName() +
                ", Salary: " + getSalary() +
                ", Department: " + getDepartment() +
                ", Team Size: " + teamSize +
                ", Project: " + projectName);
    }
}
