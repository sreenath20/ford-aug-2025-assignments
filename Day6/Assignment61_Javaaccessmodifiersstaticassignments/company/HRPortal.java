
import company.hr.Employee;

public class HRPortal {
    public static void main(String[] args) {
        Employee e = new Employee("Alice", 101, "Engineering", 120_000.00);

        System.out.println("Name (public): " + e.name);
        System.out.println("Employee ID (default): " + e.employeeId);
        System.out.println("Department (protected): " + e.department);
        System.out.println("Salary via public getter: " + e.getSalaryForPayroll());
    }
}
