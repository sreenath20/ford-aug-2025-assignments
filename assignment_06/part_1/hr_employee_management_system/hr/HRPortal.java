package assignment_06.part_1.hr_employee_management_system.hr;

public class HRPortal {

    public void accessEmployeeData() {
        System.out.println("--- HR Portal---");

        Employee emp = new Employee("Swathik", "swathik@ford.com", 1001, "IT", 75000.0);

        // Testing access from same package

        System.out.println("Name: " + emp.name);
        System.out.println("email: " + emp.email);
        System.out.println("EmployeeID: " + emp.employeeID);
        System.out.println("Department: " + emp.department);
        System.out.println("Salary (via public method): " + emp.getSalary());

//        System.out.println(" HR Portal can access all non-private members");
//        System.out.println(" HR Portal cannot access private salary directly");

    }
}