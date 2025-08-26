package assignment_06.part_1.hr_employee_management_system.hr;

public class Employee {
    private double salary;
    int employeeID;
    protected String department;
    public String name;
    public String email;

    public Employee(String name, String email, int employeeID, String department, double salary) {
        this.name = name;
        this.email = email;
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
            System.out.println("Salary updated through public method");
        }
    }

    public void displayBasicInfo() {
        System.out.println("--- Employee Basic Information ---");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        // System.out.println("Salary: " + salary);    // PRIVATE - accessible within same class
    }
}