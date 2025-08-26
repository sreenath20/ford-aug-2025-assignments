package assignment_06.part_1.hr_employee_management_system.external;

import assignment_06.part_1.hr_employee_management_system.hr.Employee;

public class PayrollService {

    public void processPayroll() {
        System.out.println("--- Payroll Service ---");

        Employee emp = new Employee("Hitesh", "hitesh@ford.com", 1002, "Finance", 80000.0);

        // Testing access from different package
        System.out.println("Name: " + emp.name);
        System.out.println("email: " + emp.email);

        // Update salary using public method
        emp.setSalary(85000.0);
        System.out.println("Updated salary: " + emp.getSalary());

//        System.out.println(" Payroll Service can access public members only");
//        System.out.println(" Payroll Service cannot access default, protected, or private members");
//        System.out.println(" Payroll Service can access salary through public method");

    }
}