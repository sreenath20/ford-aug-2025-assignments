package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.accessmodifierscenario1;

public class HRPortal {


    public void displayEmployeeDetails(Employee employee){
        System.out.println(employee.dept);
        System.out.println(employee.name);
        System.out.println(employee.empID);
        // private variable can be accessed through the public getter method
        System.out.println(employee.getSalary());
    }

}
