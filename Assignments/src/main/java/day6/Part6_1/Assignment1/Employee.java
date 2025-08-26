package day6.Part6_1.Assignment1;

public class Employee {
    private double salary;
    int employeeId;
    protected String department;
    public String employeeName;

    public Employee(double salary, int employeeId, String department, String name) {
        this.salary = salary;
        this.employeeId = employeeId;
        this.department = department;
        this.employeeName = name;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }
}
