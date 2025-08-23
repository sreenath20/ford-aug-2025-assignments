package Assignment61_Javaaccessmodifiersstaticassignments.company;

import company.hr.Employee;

public class Manager extends Employee {
    public Manager(String name, int employeeId, String department, double salary) {
        super(name, employeeId, department, salary);
    }

    public void generateReport() {
        System.out.println("Manager access to department (protected): " + this.department);

        Employee other = new Employee("Eve", 103, "Marketing", 90_000.00);

    }

    public static void main(String[] args) {
        Manager m = new Manager("Carol", 201, "Engineering", 150_000.00);
        m.generateReport();
    }
}
