package day6_1.Assignment1.sub_package;


import day6_1.Assignment1.Employee;

public class Manager extends Employee {
    public Manager(double salary, String department, String employeeId) {
        super(salary, department, employeeId);
    }

    public static void main(String[] args) {
        Manager manager = new Manager(100000, "HR", "OE123");
        manager.department = "et";
        manager.getSalary();
    }
}
