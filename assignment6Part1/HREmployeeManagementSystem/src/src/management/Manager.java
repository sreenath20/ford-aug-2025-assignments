package management;

import hr.Employee;

public class Manager extends Employee {

    public Manager(double salary, int employeeID, String department, String name) {
        super(salary, employeeID, department, name);
    }
    public void generateManagerReport(){
        System.out.println("Manager Name: " + name);
//         System.out.println("ID: " + employeeId);
        System.out.println("Dept: " + department);
//         System.out.println("Salary: " + salary);
        System.out.println("Salary (via method): " + getSalary());
        System.out.println("employeeID and salary are not directly accessible");
    }
}
