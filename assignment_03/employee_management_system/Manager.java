package assignment_03.employee_management_system;

class Manager extends Employee {

    private int teamSize;
    private String projectName;

    public Manager(int id, String name, double salary, String department,
                   int teamSize, String projectName) {
        super(id, name, salary, department);

        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void displayFullManagerDetails() {
        System.out.println("Manager Information");

        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + getDepartment());


        System.out.println("Team Size: " + teamSize + " people");
        System.out.println("Project: " + projectName);
        System.out.println("Role: Manager\n");
    }
}
