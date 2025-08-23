package com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.accessmodifierscenario1;

import com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.Manager;
import com.fullstackabi.assignment.Assign6.Exceptionhandlingaccessmodifier.Part1accessmodifier.PayRollService;

public class HREmpDriver {
    public static void main(String[] args) {

        Employee employee = new Employee(10000.00,100,"IT", "Frank");

        // HRPortal (same package) needs access to non-sensitive info
        HRPortal hr = new HRPortal();
        hr.displayEmployeeDetails(employee);

        //PayrollService (different package) needs access to salary but can’t directly read it—must call a
        //public method.
        PayRollService payroll = new PayRollService();
        payroll.getEmployeeSalaryDetail(employee);

        //Manager (different package, subclass of Employee) needs department info for reports.
        Manager manager = new Manager(5000.00,101,"HR" ,"John");
        manager.getDeptReport();









    }
}
