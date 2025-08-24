package assignment6.accessModifier.HREmployeeManagement;

public class HRPortal extends Employee{
        void display(){
            System.out.println("The employee ID : "+super.employeeID);
            System.out.println("The department name is : " +super.department);
        }
}
