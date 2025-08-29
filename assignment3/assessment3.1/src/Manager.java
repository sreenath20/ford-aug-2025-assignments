public class Manager extends Employee {
    private int teamSize;
    private String projectName;

    public Manager() {
    }

    public Manager(int teamSize, String projectName,String name, int salary, String department,String id) {
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
    public void display(int teamSize, String projectName) {

        super.display();
        System.out.println("Manager ID: " + this.getId());
        System.out.println("Manager salary: " + this.getSalary());
    }

}
