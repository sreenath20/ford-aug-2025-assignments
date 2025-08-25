package com.assignments.assignment6_1.PayrollService;

import com.assignments.assignment6_1.HRPortal.Employee;

public class PayEmployee{

    public void changeEmployeeSalary(Employee employee,Double salary){
//        private member accessed by public method in different package
        employee.setSalary(salary);
        System.out.println("Employee salary changed successfully.");
    }
}
