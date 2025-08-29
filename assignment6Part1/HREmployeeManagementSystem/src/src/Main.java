import hr.Employee;
import hr.HRPortal;
import management.Manager;
import payroll.PayrollService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Employee details: ");
        Employee emp=new Employee(25000.0,11162110,"PDPO","Trixie");
//        System.out.println("employee ID: "+emp.employeeID);
        System.out.println("Employee id is default we cannot access it");
//        System.out.println("salary is private we can access it: "+emp.Salary());
        System.out.println("salary is private cannot be directly accessible!!");
//        System.out.println("department: "+emp.department);
        System.out.println("department is protected so we cannot access it");
        System.out.println("name is "+emp.name);


        System.out.println("we can access private through public methods");
        System.out.println("---------------------------------");

        System.out.println("HR details");
        HRPortal hr=new HRPortal();
        hr.accessEmployeeData();

        System.out.println("---------------------------------");
        System.out.println("Manager details:");
        Manager manager=new Manager(50000,23456,"IT","srinivasan");
        manager.generateManagerReport();

        System.out.println("---------------------------------");
        System.out.println("Payroll Details: ");
        PayrollService  payroll=new PayrollService();
        payroll.processPayroll();
    }
}
