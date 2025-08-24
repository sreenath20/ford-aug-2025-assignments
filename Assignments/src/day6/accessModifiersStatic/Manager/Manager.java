package day6.accessModifiersStatic.Manager;

import day6.accessModifiersStatic.hrEmployee.Employee;

public class Manager extends Employee {
    public Manager(int employeeId,String name,double salary,String department){
        super(employeeId,name,salary,department);
    }
    public void generateReport(){
        System.out.println("Employee Name: "+this.name);
        System.out.println("Manager Department: "+this.department);
    }

}
