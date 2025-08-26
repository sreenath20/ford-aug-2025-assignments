package assignment_06.part_1.hr_employee_management_system.external;

import assignment_06.part_1.hr_employee_management_system.hr.Employee;

// Manager.java - Subclass of Employee in different package
public class Manager extends Employee {
    private String teamSize;

    // Constructor
    public Manager(String name, String email, int employeeID, String department, double salary, String teamSize) {
        super(name, email, employeeID, department, salary);
        this.teamSize = teamSize;
    }

    public void generateDepartmentReport() {
        System.out.println("--- Manager Access ---");

        System.out.println("Name: " + name);
        System.out.println("email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Salary (via public method): " + getSalary());
        System.out.println("Team Size: " + teamSize);
//        System.out.println(" Manager can access public and protected members");
//        System.out.println(" Manager cannot access default or private members from parent");

    }

    // Method to display team info using protected department
    public void displayTeamInfo() {
        System.out.println("--- Team Information ---");
        System.out.println("Manager: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

