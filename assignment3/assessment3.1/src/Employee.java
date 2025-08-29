public class Employee {
    private String id;
    private String name;
    private double salary;
    private String department;

    public Employee() {
    }

    public Employee(String id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void display() {
        System.out.println("Employee details:");
        System.out.println("Employee name: " + this.getName());
        System.out.println("EmpLoyee ID: " + this.getId());
        System.out.println("Employee salary: " + this.getSalary());
        System.out.println("Employee department: " + this.getDepartment());

    }
}
