package day6.Part6_1.Assignment1;

import day6.Part6_1.Assignment1.SubPackage1.PayrollService;
import day6.Part6_1.Assignment1.SubPackage2.Manager;

public class Driver {
    public static void main(String[] args) {
        Employee emp = new Employee(50000, 101, "ET", "Abc");

        HRPortal portal = new HRPortal();
        portal.accessEmployee(emp);

        PayrollService payroll = new PayrollService();
        payroll.processSalary(emp);

        Manager mgr = new Manager(90000, 106, "GDIA", "Def");
        mgr.generateReport();
    }
}
