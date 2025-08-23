package company.hr;

public class Employee {
    private double salary;

    public int employeeId;

    public String department;

    public String name;

    public Employee(String name, int employeeId, String department, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.salary = salary;
    }

    public double getSalaryForPayroll() {
        return salary;
    }

    String getDeptPackageVisible() {
        return department;
    }
}
