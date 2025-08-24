package day6.accessModifiersStatic.hrEmployee;

import day6.accessModifiersStatic.Manager.Manager;
import day6.accessModifiersStatic.PayrollService.PayrollService;

public class Driver {
    public static void main(String[] args) {
        Employee emp=new Employee(1,"Sam",20000.86,"IT");
        HRportal hRportal=new HRportal();
        hRportal.showEmployeeInfo(emp);


        PayrollService payroll=new PayrollService();
        payroll.processPayroll(emp);

        Manager manager=new Manager(11,"John",700678.9,"Finance");
        manager.generateReport();

    }
}
