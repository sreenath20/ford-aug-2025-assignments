package com.fullstackabi.assignment.Assign3.EncapsulationInheritance.Ex1EmpMgmntSystem;

public class Manager extends Employee {

    //constructor to refer the base class fields using super.

    public Manager(int empID, String empName, String empDept, Double empSalary) {
        super(empID, empName, empDept, empSalary);
    }

    int teamSize;
    String projectName;

    public Manager(int empID, String empName, String empDept, Double empSalary, int teamSize, String projectName) {
        super(empID, empName, empDept, empSalary);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // private fields of employee class is called using getter methods in the child class
    public void displayProjectDetails(){
        System.out.println("Displaying the Team and Project Details");
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
        System.out.println("EmpID is " +getEmpID());
        System.out.println("EmpName is " +getEmpName());
        System.out.println("EmpDept is " +getEmpDept());
        System.out.println("EmpSalary is " +getEmpSalary());

    }

}

