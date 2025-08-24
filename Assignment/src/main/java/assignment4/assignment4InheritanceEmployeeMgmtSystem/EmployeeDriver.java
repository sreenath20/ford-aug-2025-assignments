package assignment4.assignment4InheritanceEmployeeMgmtSystem;

public class EmployeeDriver {
    public static void main(String[] args) {

//        Employee employee = new Employee(12,"Sam",75000.65,"Finance");
            Employee employee = new Employee();

        employee.setId(2);
        employee.setName("Rishi");
        employee.setDepartment("IT");
        employee.setSalary(65000.65);

        employee.displayManagerDetails();
        Manager manager = new Manager(45,"Ian",35000.67,"Finance",8,"FAST");

        manager.displayManagerDetails();

    }
}
