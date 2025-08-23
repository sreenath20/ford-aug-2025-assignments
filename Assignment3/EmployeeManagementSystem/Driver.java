package Assignment3.EmployeeManagementSystem;

public class Driver {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "Ram", 80000, "HR");
        Manager mgr = new Manager(102, "Sam", 95000, "IT", 10, "AI Development");

        System.out.println("Employee Details:");
        emp.displayEmployeeDetails();

        System.out.println("Manager Details:");
        mgr.displayManagerDetails();
    }
}
