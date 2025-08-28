package com.assignment.day7.assignment1_1;

import com.assignment.day7.assignment1_1.hr.Employee;
import com.assignment.day7.assignment1_1.hr.HRPortal;
import com.assignment.day7.assignment1_1.manager.Manager;
import com.assignment.day7.assignment1_1.payrollservice.PayrollService;

public class Day7Assignment1_1 {
    public static void main(String[] args) {
        System.out.println("Day 7 Assignment 1.1");
        Employee e1 = new Employee();

        System.out.println("HR Portal Access:");
        HRPortal hrPortal = new HRPortal();
        hrPortal.accessEmployeeInfo(e1);
        System.out.println("Payroll Service Access:");
        PayrollService payrollService = new PayrollService();
        payrollService.processPayroll(e1);
        System.out.println("Manager Access:");
        Manager manager = new Manager();
        manager.display();
    }
}
