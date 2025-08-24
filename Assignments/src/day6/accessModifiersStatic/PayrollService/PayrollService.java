package day6.accessModifiersStatic.PayrollService;

import day6.accessModifiersStatic.hrEmployee.Employee;

public class PayrollService {
    public void processPayroll(Employee e){
        System.out.println("Employee Name: "+e.name);
        System.out.println("Salary : "+e.getSalary());
    }
}
