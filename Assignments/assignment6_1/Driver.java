package com.assignments.assignment6_1;

import com.assignments.assignment6_1.Billing.BillDetails;
import com.assignments.assignment6_1.HRPortal.Employee;
import com.assignments.assignment6_1.InsuranceDetails.InsuranceClaim;
import com.assignments.assignment6_1.Managers.Manager;
import com.assignments.assignment6_1.PayrollService.PayEmployee;

public class Driver {

    static  void HREmployeeManagement(){
        Employee employee = new Employee(1,"ET",50000.0);
//        'salary' has private access in Employee class
//        employee.salary = 30000.0;

//        'employeeId' is not public.Cannot access outside the package
//        employee.employeeId = 2;

//        'department' has protected access in Employee class
//        employee.department = "IT";

//        private member 'salary' accessed
//        using public method
        PayEmployee payEmployee = new PayEmployee();
        payEmployee.changeEmployeeSalary(employee,100000.0);

//        protected member accessed outside package
//        by subclass of Employee
        Manager manager = new Manager(3,"HR",75000.0,"FCG-Onboarding");
        manager.displayDepartment();

    }

    static  void HospitalManagement(){

//                                        Patient   Reception   InsuranceClaim  BillDetails
//        name (public)                     yes        yes          yes           yes
//        hospitalId (default)              yes        yes          yes           no
//        insuranceDetails (protected)      yes        yes       yes(sub-class)   no
//        medicalHistory (private)          yes        no           no            no

        InsuranceClaim patient = new InsuranceClaim(1,"Raamji","Elbow-fracture","Med-assist");
        patient.displayInsuranceDetails();

        BillDetails   billDetails = new BillDetails();
        billDetails.displayBillDetails(patient);

    }

    static  void E_CommerceOrderTracking(){

        Order order1 = new Order(1,"Raj","Soap");
        Order order2 = new Order(2,"Josh","Brush");
        Order.displayTotalOrder();
        Order order3 = new Order(3,"Rick","Biscuits");
        Order order4 = new Order(4,"Kenny","Scrubber");
        Order order5 = new Order(5,"Jim","Chocolate");
        Order.displayTotalOrder();

    }
    static void BankInterestRate(){
        BankAccount bankAccount1 = new BankAccount(1,50000.0);
        BankAccount bankAccount2 = new BankAccount(2,88000.0);
        BankAccount bankAccount3 = new BankAccount(3,112000.0);

        BankAccount.updateInterestRate(5);
        bankAccount1.displayDetails();
        bankAccount2.displayDetails();
        bankAccount3.displayDetails();

        BankAccount.updateInterestRate(10);
        bankAccount1.displayDetails();
        bankAccount2.displayDetails();
        bankAccount3.displayDetails();

        BankAccount.updateInterestRate(17);
        bankAccount1.displayDetails();
        bankAccount2.displayDetails();
        bankAccount3.displayDetails();

    }
    public static void main(String[] args) {

        HREmployeeManagement();
        HospitalManagement();
        E_CommerceOrderTracking();
        BankInterestRate();

    }

}
