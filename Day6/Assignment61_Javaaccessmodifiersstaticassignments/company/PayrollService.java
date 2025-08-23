package company.payroll;

import company.hr.Employee;

public class PayrollService {
    public static void processPayroll(Employee e) {
        System.out.println("Payroll reads salary via public getter: " + e.getSalaryForPayroll());
    }

    public static void main(String[] args) {
        Employee e = new Employee("Bob", 102, "Sales", 85_000.00);
        processPayroll(e);
    }
}
