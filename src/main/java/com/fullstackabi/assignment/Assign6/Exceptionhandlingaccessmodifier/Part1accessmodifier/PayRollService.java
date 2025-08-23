package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier;

import com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.accessmodifierscenario1.Employee;

public class PayRollService {

    // payroll class is in diff package ,
    // but can access salary (private) using the public getter
    public void getEmployeeSalaryDetail(Employee emp) {
        System.out.println("Employee Name is " + emp.name);
        // EmpID is default method cannot be accessed in a diff package
        // System.out.println("EMp id is " +emp.empID);
        // dept is protected cannot be access in diff package without a subclass
        //System.out.println("EMp dept is" +emp.dept);
        System.out.println("Employee salary is " + emp.getSalary());
    }

}
