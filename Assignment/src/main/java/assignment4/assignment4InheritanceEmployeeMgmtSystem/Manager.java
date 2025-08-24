package assignment4.assignment4InheritanceEmployeeMgmtSystem;

public class Manager extends Employee{

    private Integer teamSize;
    private String projectName;


    public Manager(Integer id, String name, Double salary, String department, Integer teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void displayManagerDetails(){
        System.out.println("Please find below the Manager details");
        super.displayManagerDetails();
        System.out.println("Team Size: "+teamSize);
        System.out.println("Project Name: "+projectName);
    }

}
