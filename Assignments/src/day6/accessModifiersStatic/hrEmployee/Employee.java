package day6.accessModifiersStatic.hrEmployee;

public class Employee {
    public String name;
    private double salary;
    int employeeId;
    protected String department;

    public Employee(int employeeId, String name, double salary, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }
}
