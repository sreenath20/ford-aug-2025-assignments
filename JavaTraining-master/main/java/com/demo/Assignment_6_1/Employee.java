package com.demo.Assignment_6_1;

public class Employee {
    private double Salary;
    String Employee_Id;
    protected String Department;
    String Employee_Name;


    Employee(double Salary, String Employee_Id, String Department, String Employee_Name) {
        this.Salary = Salary;
        this.Employee_Id = Employee_Id;
        this.Department = Department;
        this.Employee_Name = Employee_Name;
    }

    public Employee() {
    }

    public double getSalary() {
        return this.Salary;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }


}
class HrPortal extends Employee {
    HrPortal(double Salary, String Employee_Id, String Department,String Employee_Name) {
        super(Salary, Employee_Id, Department, Employee_Name);
    }
    void display(){

    System.out.println("Employee Name : "+Employee_Name+"Employee ID : "+Employee_Id);
        System.out.println("Salary : "+getSalary()+"Department ID : "+Department);
    }

}
class main{
    public static void main(String[] args) {
        HrPortal hrportal= new HrPortal(2000.09,"123W2231","XYz","AK");
        hrportal.display();
    }

}

