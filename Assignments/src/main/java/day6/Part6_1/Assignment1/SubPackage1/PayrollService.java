package day6.Part6_1.Assignment1.SubPackage1;

import day6.Part6_1.Assignment1.Employee;

public class PayrollService {
    public void processSalary(Employee e) {
        System.out.println("Payroll Service processing...");
        System.out.println("Salary via getter: " + e.getSalary());
        // System.out.println(e.salary);private - not accessible
    }
}
