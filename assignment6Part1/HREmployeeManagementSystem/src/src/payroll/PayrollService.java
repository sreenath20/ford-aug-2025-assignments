package payroll;

import hr.Employee;

public class PayrollService {
    public void processPayroll() {
        Employee emp = new Employee(20000, 321234, "HR", "prabhu");
        System.out.println("name : " + emp.name);
//        System.out.println("ID:"+ emp.employeeID);
//         System.out.println("Dept: " + emp.department);
//         System.out.println("Salary: " + emp.salary);
        System.out.println("Salary (via method): " + emp.getSalary());

        System.out.println("Remaining EmployeeID,department,and salary cannot be directly retrived instead we can use GET Method which is public");
    }
}
