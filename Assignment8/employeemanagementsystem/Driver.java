package Assignment8.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        //Create
        List<Employee> employee=new ArrayList<Employee>();
        employee.add(new Employee(1,"Ram","ET",25000.00));
        employee.add(new Employee(1,"Sam","ET",35000.00));
        employee.add(new Employee(3,"abc","IT",15000.00));

        System.out.println(employee);
        //check id is equal or not
        Employee empOne=new Employee(1,"Ram","ET",25000.00);
        Employee empTwo=new Employee(1,"Sam","ET",35000.00);
        if(empOne.equals(empTwo)){
            System.out.println("Employee is the same");
        }
        else{
            System.out.println("Employee is not the same");
        }

        //Update
        Employee update=new Employee(2,"Sam","ET",35000.00);
        employee.set(1, update);
        System.out.println("---------Aftere Update--------");
        System.out.println(employee);

        //Delete
        employee.remove(1);
        System.out.println("---------Aftere Remove--------");
        System.out.println(employee);
        //Read
        System.out.println("-----------Read Operation-------");
        System.out.println(employee.get(1));


    }
}
