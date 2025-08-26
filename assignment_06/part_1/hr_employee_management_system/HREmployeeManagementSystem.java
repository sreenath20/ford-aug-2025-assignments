package assignment_06.part_1.hr_employee_management_system;
import assignment_06.part_1.hr_employee_management_system.hr.Employee;
import assignment_06.part_1.hr_employee_management_system.hr.HRPortal;
import assignment_06.part_1.hr_employee_management_system.external.Manager;
import assignment_06.part_1.hr_employee_management_system.external.PayrollService;

public class HREmployeeManagementSystem {
    public static void main(String[] args) {
        System.out.println("HR Employee Management System\n");

        // Test 1: Employee class internal access
        Employee emp = new Employee("Sara Samyu", "sara@ford.com", 1003, "HR", 70000.0);
        emp.displayBasicInfo();
        System.out.println();

        // Test 2: Same package access (HRPortal)
        HRPortal hrPortal = new HRPortal();
        hrPortal.accessEmployeeData();
        System.out.println();

        // Test 3: Different package access (PayrollService)
        PayrollService payroll = new PayrollService();
        payroll.processPayroll();
        System.out.println();

        // Test 4: Subclass in different package access (Manager)
        Manager manager = new Manager("Tanya", "tanya@ford.com", 1004, "Engineering", 95000.0, "12 developers");
        manager.generateDepartmentReport();
        manager.displayTeamInfo();
        System.out.println();

    }
}
