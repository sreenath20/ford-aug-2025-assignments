package assignment4.assignment4InheritanceEmployeeMgmtSystem;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;
    private String department;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayManagerDetails(){
        System.out.println("Please find below the details from Employee.");
        System.out.println("Id is : " +this.getId());
        System.out.println("Name is : " +this.getName());
        System.out.println("Department is : " +this.getDepartment());
        System.out.println("Salary is : " +this.getSalary());
    }
}
