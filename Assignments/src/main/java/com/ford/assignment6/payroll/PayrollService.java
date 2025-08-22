package com.ford.assignment6.payroll;



import com.ford.assignment6.hr.Employee;

public class PayrollService {
    public static void main(String[] args) {
        Employee emp = new Employee();
        // System.out.println(emp.employeeId);     // default - not accessible
        // System.out.println(emp.department);     // protected - not accessible
        // System.out.println(emp.salary);         // private - not accessible
        System.out.println("Salary via method: " + emp.getSalary()); // ✅ public method
    }
}
