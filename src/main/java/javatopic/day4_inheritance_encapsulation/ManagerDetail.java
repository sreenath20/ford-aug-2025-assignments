package javatopic.day4_inheritance_encapsulation;

public class ManagerDetail extends EmployeeDetail {
    private Integer teamSize;
    private String projectName;

    public ManagerDetail(String id, String name, String salary, String department, Integer teamSize, String projectName) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    public void DisplayDetail(){
        System.out.println("Manger id:"+getId());
        System.out.println("Name:"+getName());
        System.out.println("Salary:"+ getSalary());
        System.out.println("Department:"+getDepartment());
        System.out.println("teamSize:"+teamSize);
        System.out.println("projectName:"+projectName);

    }


}
